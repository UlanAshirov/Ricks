package com.example.main.pager

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.main.characters.CharactersFragment
import com.example.main.episodes.EpisodesFragment
import com.example.main.location.LocationFragment

class PagersAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> CharactersFragment()
            1 -> EpisodesFragment()
            else -> LocationFragment()
        }
    }


}