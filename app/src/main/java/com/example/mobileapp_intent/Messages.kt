package com.example.mobileapp_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Messages : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages)

        val actionBar = supportActionBar
        actionBar!!.title = "MessagesPage"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}