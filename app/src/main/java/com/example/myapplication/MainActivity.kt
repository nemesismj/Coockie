package com.example.myapplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var isHappy = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val myTxt = findViewById<TextView>(R.id.textView)
            val myBtn = findViewById<Button>(R.id.button)
            val myImage = findViewById<ImageView>(R.id.imageView)
        myBtn.setOnClickListener{
            if (isHappy == true) {
                isHappy = false
                myTxt.setText("Im hungry")
                myBtn.setText("Eat Coockie")
                myImage!!.setImageResource(R.drawable.test)
            } else {
                isHappy = true
                myTxt.setText("Im so full")
                myBtn.setText("Done")
                myImage!!.setImageResource(R.drawable.test2)
            }
        }
        }
}
