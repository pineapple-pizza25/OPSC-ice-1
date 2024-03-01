package com.example.splashscreen

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Locale

class Homescreen : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)
        val helloWorldTextView : TextView = findViewById(R.id.txtHelloWorld)

        val btnSpanish : Button = findViewById(R.id.btnSpanish)
        btnSpanish.setOnClickListener {
            helloWorldTextView.text = "Hola, Mundi"

        }

        val btnFrench : Button = findViewById(R.id.btnFrench)
        btnFrench.setOnClickListener {
            helloWorldTextView.text = "Bonjour, le monde!"

        }

        val btnGerman : Button = findViewById(R.id.btnGerman)
        btnGerman.setOnClickListener {
            helloWorldTextView.text = "Hallo, Welt!"

        }

        val btnItalian : Button = findViewById(R.id.btnItalian)
        btnItalian.setOnClickListener {
            helloWorldTextView.text = "Ciao, mondo!"

        }

        val btnEnglish : Button = findViewById(R.id.btnEnglish)
        btnEnglish.setOnClickListener {
            helloWorldTextView.text = "Hello World"

        }
    }


}