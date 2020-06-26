package com.aleph5.shiamobile.ui.main

import android.app.Activity
import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.aleph5.shiamobile.R

private val TAB_TITLES = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager, lc: Lifecycle)
    : FragmentStateAdapter(fm, lc) {

    override fun getItemCount(): Int {
        // Show 2 total pages.
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        TODO("Not yet implemented")
    }
}