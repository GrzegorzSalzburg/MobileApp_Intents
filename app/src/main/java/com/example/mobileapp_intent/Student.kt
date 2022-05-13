package com.example.mobileapp_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Student : AppCompatActivity() {

    private lateinit var checkbtvar: Button
    private lateinit var indexetvar: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val actionBar = supportActionBar
        actionBar!!.title = "Student"
        actionBar.setDisplayHomeAsUpEnabled(true)

        checkbtvar = findViewById(R.id.checkbt)
        indexetvar = findViewById(R.id.indexet)

        checkbtvar.setOnClickListener {
            val index = indexetvar.text.toString()
            val intent = Intent(this, StudentResult::class.java).apply {
                putExtra("index_data", index)
            }
            startActivity(intent)
        }

    }
}