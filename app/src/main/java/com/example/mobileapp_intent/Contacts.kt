package com.example.mobileapp_intent

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.EditText
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

const val REQUEST_SELECT_PHONE_NUMBER = 1

class Contacts : AppCompatActivity() {

    private lateinit var etnumbervar: EditText
    private lateinit var etnamevar:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        etnumbervar = findViewById<EditText>(R.id.ETnumber)
        etnamevar = findViewById<EditText>(R.id.ETname)

        val actionBar = supportActionBar
        actionBar!!.title = "ContactsPage"
        actionBar.setDisplayHomeAsUpEnabled(true)

        etnumbervar.setOnClickListener {
            val i = Intent(Intent.ACTION_PICK)
            i.type=ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE //what type of data
            startActivityForResult(i,111)
        }

        fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
             super.onActivityResult(requestCode,resultCode,data)
             if (requestCode == REQUEST_SELECT_PHONE_NUMBER && resultCode == Activity.RESULT_OK) {
                // Get the URI and query the content provider for the phone number
                val contactUri: Uri = data?.data?:return
                val nndata: Array<String> = arrayOf(ContactsContract.CommonDataKinds.Phone.NUMBER,
                                                        ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)

                val cr = contentResolver.query(contactUri, nndata, null, null, null)

                if (cr?.moveToFirst()!!) {
                    etnumbervar.setText(cr.getString(0))
                    etnamevar.setText(cr.getString(1))
                }
            }
        }
        val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val intent = result.data
                // Handle the Intent
                //do stuff here
            }
        }

        fun openActivityForResult() {
            startForResult.launch(Intent(this, startForResult::class.java))
        }

    }
}