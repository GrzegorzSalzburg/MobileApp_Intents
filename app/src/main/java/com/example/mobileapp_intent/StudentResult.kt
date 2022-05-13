package com.example.mobileapp_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class StudentResult : AppCompatActivity() {

    private lateinit var resulttvvar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_result)

        val actionBar = supportActionBar
        actionBar!!.title = "Index results"
        actionBar.setDisplayHomeAsUpEnabled(true)

        resulttvvar=findViewById(R.id.resulttv)

        if(intent.getStringExtra("index_data") == "252912")
            resulttvvar.text="Grzegorz Salzburg"
        else
            resulttvvar.text="Not found"
    }
}