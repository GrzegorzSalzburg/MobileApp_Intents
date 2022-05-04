package com.example.mobileapp_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Suprise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suprise)

        val actionBar = supportActionBar
        actionBar!!.title = "SuprisePage"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}