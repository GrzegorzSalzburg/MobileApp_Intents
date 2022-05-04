/*Grzegoz Salzburg 252912*/
package com.example.mobileapp_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
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

        fun openWebPage(url: String) {
            val webpage: Uri = Uri.parse(url)
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        fun openSettings() {
            val intent = Intent(Settings.ACTION_SETTINGS)
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        //web
        button1var.setOnClickListener {
            openWebPage("https://pwr.edu.pl/")
        }

        //settings
        button2var.setOnClickListener {
            openSettings()
        }

        //photo
        button3var.setOnClickListener {
            val intent = Intent(this, Picture::class.java)
            startActivity(intent)
        }

        //Jak na razie nie ma w tym nic - do zrobienia
        //student
        button4var.setOnClickListener {
            val intent = Intent(this, Student::class.java)
            startActivity(intent)
        }

    }

}