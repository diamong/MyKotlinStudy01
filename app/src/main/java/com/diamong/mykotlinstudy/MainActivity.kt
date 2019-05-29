package com.diamong.mykotlinstudy

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Log.i("MainActivity","Button Clicked")
            Toast.makeText(applicationContext,"Button was Clicked!!!!!",Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener {
            val message: String =et_user_message.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_LONG).show()

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)

        }

    }

}
