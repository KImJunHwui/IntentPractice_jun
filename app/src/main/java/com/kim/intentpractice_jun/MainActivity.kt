package com.kim.intentpractice_jun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQUEST_FOR_NICKNAME = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        nickNameChangeBtn.setOnClickListener {

            val myIntent = Intent(this, NicknameActivity::class.java)
            startActivityForResult(myIntent, REQUEST_FOR_NICKNAME)

        }

        PressBtn.setOnClickListener {


            val inputMessage = sayHelloEdt.text.toString()
            val myIntent = Intent(this, MoveToNext::class.java)
            myIntent.putExtra("message", inputMessage)
            startActivity(myIntent)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQUEST_FOR_NICKNAME){

         if(resultCode == RESULT_OK){

             val newNickname = data?.getStringExtra("nickname")
             nicknameTxt.text = newNickname
         }
        }
    }
}