package com.kim.intentpractice_jun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_move_to_next.*

class MoveToNext : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_to_next)

        val get = intent.getStringExtra("message")

        getMessageTxt.text = get


    }
}