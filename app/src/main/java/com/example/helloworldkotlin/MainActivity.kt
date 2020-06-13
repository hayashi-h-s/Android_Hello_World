package com.example.helloworldkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var hello : TextView = findViewById(R.id.textView)
        var hellobutton : Button = findViewById(R.id.button2)
        hellobutton.setOnClickListener {
            hello.text = "Change"
        }
    }
}