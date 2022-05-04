package com.example.mobileapp_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var button1var: Button
    private lateinit var button2var: Button
    private lateinit var button3var: Button
    private lateinit var button4var: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1var =findViewById<Button>(R.id.buttonact1)
        button2var =findViewById<Button>(R.id.buttonact2)
        button3var =findViewById<Button>(R.id.buttonact3)
        button4var =findViewById<Button>(R.id.buttonact4)

        button1var.setOnClickListener {
            val intent = Intent(this, Contacts::class.java)
            startActivity(intent)
        }

        button2var.setOnClickListener {
            val intent = Intent(this, Messages::class.java)
            startActivity(intent)
        }

        button3var.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        button4var.setOnClickListener {
            val intent = Intent(this, Suprise::class.java)
            startActivity(intent)
        }

    }

}