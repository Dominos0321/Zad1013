package com.example.zad1013

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tekst = findViewById<EditText>(R.id.editTextTextPersonName)

        var ok = findViewById<TextView>(R.id.label)



        findViewById<Button>(R.id.button).setOnClickListener {
            ok.text = ok.text.toString() +" "+ tekst.text.toString()
            tekst.text.clear()
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            ok.text = "Dominik Schwoch"
            tekst.text.clear()
        }
    }
}