package com.diamong.mykotlinstudy

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

    }

}
