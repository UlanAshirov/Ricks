package com.example.data.base

import android.net.Uri
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.utils.DataMapper
import retrofit2.HttpException
import java.io.IOException

private const val START_PAGE_INDEX = 1

abstract class BasePagingSource<ValueDto : DataMapper<Value>, Value : Any>(
    private val request: suspend (position: Int) -> BaseMainResponse<ValueDto>,
) : PagingSource<Int, Value>() {
    override fun getRefreshKey(state: PagingState<Int, Value>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Value> {
        val position = params.key ?: START_PAGE_INDEX
        return try {
            val response = request(position)
            val nextPage = when (response.info.next) {
                null -> null
                else -> Uri.parse(response.info.next).getQueryParameter("page")?.toInt()
            }
            LoadResult.Page(
                data = response.results.map { it.toDomain() },
                prevKey = null,
                nextKey = nextPage
            )
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }
}