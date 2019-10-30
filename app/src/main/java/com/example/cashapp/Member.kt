package com.example.cashapp

data class Member(val name: String)
data class GroupCard(val startingDate:String,
                     val endingDate:String,
                     val totalAmount:String,
                     val balanceAmount:String)