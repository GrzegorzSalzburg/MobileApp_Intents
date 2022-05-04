package com.example.mobileapp_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Map : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val actionBar = supportActionBar
        actionBar!!.title = "MapsPage"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}