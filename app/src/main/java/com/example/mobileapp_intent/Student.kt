package com.example.mobileapp_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private lateinit var check_bt: Button
private lateinit var index_et: EditText

class Student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val actionBar = supportActionBar
        actionBar!!.title = "Student"
        actionBar.setDisplayHomeAsUpEnabled(true)

        check_bt = findViewById(R.id.checkbt)
        index_et = findViewById(R.id.indexet)

        check_bt.setOnClickListener {
            val index = index_et.text.toString()
            val intent = Intent(this, StudentResult::class.java).apply {
                putExtra("index_data", index)
            }
            startActivity(intent)
        }

    }
}