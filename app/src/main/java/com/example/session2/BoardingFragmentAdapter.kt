package com.example.session2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class BoardingFragmentAdapter (fa: FragmentActivity, val fragments: List<BoardingFragment>) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}