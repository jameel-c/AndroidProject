package com.example.cashapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AddMembersActivity : AppCompatActivity() {




    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_members)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        //crating an arraylist to store users using the data class user
        val users = ArrayList<Member>()

        //adding some dummy data to the list
        users.add(Member("Belal Khan"))
        users.add(Member("Ramiz Khan"))
        users.add(Member("Faiz Khan"))
        users.add(Member("Yashar Khan"))

        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter


        val fabBtn = findViewById<FloatingActionButton>(R.id.fabBtn_Addmember)
        fabBtn.setOnClickListener {

            val intent = Intent(this,GroupRegistrationActivity ::class.java)
            startActivity(intent)
        }

    }
}
