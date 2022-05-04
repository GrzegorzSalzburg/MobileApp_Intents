package com.example.mobileapp_intent

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView

const val REQUEST_IMAGE_CAPTURE = 1
private lateinit var photobuttonvar: Button
private lateinit var photoimagevar: ImageView

class Picture : AppCompatActivity() {

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        photoimagevar = findViewById(R.id.photoimage)

        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            photoimagevar.setImageBitmap(imageBitmap)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)

        val actionBar = supportActionBar
        actionBar!!.title = "BlankPage"
        actionBar.setDisplayHomeAsUpEnabled(true)

        photobuttonvar = findViewById(R.id.photobutton)

        photobuttonvar.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (intent.resolveActivity(packageManager) != null) {
                startActivityForResult(intent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }
}