package com.example.mobileapp_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

private lateinit var result_tv: TextView

class StudentResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_result)

        val actionBar = supportActionBar
        actionBar!!.title = "Index results"
        actionBar.setDisplayHomeAsUpEnabled(true)

        result_tv=findViewById(R.id.resulttv)

        if(intent.getStringExtra("index_data") == "252912")
            result_tv.text="Grzegorz Salzburg"
        else
            result_tv.text="Not found"
    }
}