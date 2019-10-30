package com.example.cashapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_group_details.*
import kotlinx.android.synthetic.main.group_details_fragment.*

class GroupDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_details)


        val adapter = TabbarAdapter(supportFragmentManager)
        adapter.addFragment(GroupDetailsFragment(), "Notifications")
        adapter.addFragment(CollectionMarkingFragment(), "Marking")
        adapter.addFragment(ReceivedCollectionList(), "Received")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}
