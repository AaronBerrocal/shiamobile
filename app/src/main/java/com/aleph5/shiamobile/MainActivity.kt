package com.aleph5.shiamobile

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.viewpager2.widget.ViewPager2
import com.aleph5.shiamobile.ui.main.MySectionsPageAdapter
import com.aleph5.shiamobile.ui.main.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mySectionsPagerAdapter = MySectionsPageAdapter(this)

        val viewPager: ViewPager2 = findViewById(R.id.main_view_pager)
        viewPager.adapter = mySectionsPagerAdapter

        val tabs: TabLayout = findViewById(R.id.main_tabs)
        TabLayoutMediator(tabs, viewPager){tab, position ->
            tab.text = "OBJECT ${(position + 1)}"
        }.attach()

    }
}

