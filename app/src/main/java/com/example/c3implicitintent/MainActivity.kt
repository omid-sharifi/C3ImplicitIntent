package com.example.c3implicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnShareToOtherApps = findViewById<Button>(R.id.btnShareToOtherApps)

        btnShareToOtherApps.setOnClickListener {
            val intent=Intent()// as parameter we don't add anything because we are not sure to which activity we are about to share data
            val etUserMessage = findViewById<EditText>(R.id.etUserMessage)
            val message: String = etUserMessage.text.toString()
            intent.action = Intent.ACTION_SEND //define the property of this intent
            intent.putExtra(Intent.EXTRA_TEXT, message)// this are predefined key to send data to others
            intent.type = "text/plain" //define the type of this message
            startActivity(Intent.createChooser(intent, "Share to : "))

        }




    }


}