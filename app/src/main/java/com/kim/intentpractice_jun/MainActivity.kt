package com.kim.intentpractice_jun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PressBtn.setOnClickListener {


            val inputMessage = sayHelloEdt.text.toString()
            val myIntent = Intent(this, MoveToNext::class.java)
            myIntent.putExtra("message", inputMessage)
            startActivity(myIntent)

        }

    }
}