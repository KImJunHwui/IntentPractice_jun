package com.kim.intentpractice_jun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nickname.*

class NicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nickname)

        okBtn.setOnClickListener {

           val inputNickname = newNicknameEdt.text.toString()

           val resultIntent = Intent()
           resultIntent.putExtra("nickname", inputNickname)
           setResult(RESULT_OK, resultIntent)
           finish()


        }
    }
}