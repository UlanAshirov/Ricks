package com.example.main.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.core.ext.loadImage
import com.example.main.databinding.ItemCharactersBinding
import com.example.main.presentation.model.ResultUI

class CharacterPagingAdapter :
    PagingDataAdapter<ResultUI, CharacterPagingAdapter.CharacterViewHolder>(DiffCallback()) {

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val model = getItem(position)
        holder.onBind(model)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CharacterViewHolder(
        ItemCharactersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    class DiffCallback : DiffUtil.ItemCallback<ResultUI>() {
        override fun areItemsTheSame(oldItem: ResultUI, newItem: ResultUI): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: ResultUI, newItem: ResultUI): Boolean =
            oldItem == newItem
    }

    class CharacterViewHolder(private val binding: ItemCharactersBinding) :
        ViewHolder(binding.root) {
        fun onBind(model: ResultUI?) {
            model?.image?.let { binding.imgCharacter.loadImage(it) }
            binding.txtCharacterName.text = model?.name
            binding.txtCharacterGender.text = model?.gender
            binding.txtCharacterSpecies.text = model?.species
            binding.txtCharacterStatus.text = model?.status

        }

    }
}