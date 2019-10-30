package com.example.cashapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.widget.Toast
import android.widget.AdapterView.OnItemClickListener
import java.security.AccessController.getContext


class HomeActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewHome)
        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        //crating an arraylist to store users using the data class user
        val group = ArrayList<GroupCard>()

        //adding some dummy data to the list
        group.add(GroupCard("1/1/2011","2/2/2012","565656","4424546"))
        group.add(GroupCard("12/2/2011","2/2/2012","565656","4424546"))
        group.add(GroupCard("12/14/2011","2/2/2012","565656","4424546"))

        //creating our adapter

                val homeAdapter = HomeCardViewAdapter(group,this)
        //now adding the adapter to recyclerview


            recyclerView.adapter = homeAdapter



        val fabBtn = findViewById<FloatingActionButton>(R.id.fabBtn)
        fabBtn.setOnClickListener {

            val intent = Intent(this,AddMembersActivity ::class.java)
            startActivity(intent)
        }


    }

}