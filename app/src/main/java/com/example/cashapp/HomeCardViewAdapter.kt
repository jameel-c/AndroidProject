package com.example.cashapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.core.content.ContextCompat.startActivity



class HomeCardViewAdapter (val userList: ArrayList<GroupCard>,val context: Context) : RecyclerView.Adapter<HomeCardViewAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeCardViewAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.home_cardview, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(userList[position])
        holder.linearClick?.setOnClickListener {

            Toast.makeText(context,"you clicked",Toast.LENGTH_LONG).show();
         //   val intent = Intent(context,GroupDetailsActivity ::class.java)
            context.startActivity(Intent(context,GroupDetailsActivity::class.java))
        }
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var context: Context? = null


        var linearClick: LinearLayout? = itemView.findViewById(R.id.cardlayout)


        fun bindItems(user: GroupCard) {
           // val textViewName = itemView.findViewById(R.id.name_text) as TextView
           // textViewName.text = user.name

            val  staring_date = itemView.findViewById<TextView>(R.id.grpstrtDate)
                 staring_date.text = user.startingDate
            itemView.findViewById<TextView>(R.id.grpendDate).text = user.endingDate
            itemView.findViewById<TextView>(R.id.grptolamt).text = user.totalAmount
            itemView.findViewById<TextView>(R.id.grpblncamt).text = user.balanceAmount

        }

    }
}