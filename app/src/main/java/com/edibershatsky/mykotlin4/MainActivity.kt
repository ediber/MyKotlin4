package com.edibershatsky.mykotlin4

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var prev: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener { view ->
//            Toast.makeText(applicationContext, "NOT IMPLEMENTED YET", Toast.LENGTH_SHORT).show()
            var str = text.text.toString()
            var dou = str.toDouble()
            // TODO cahnge according to action taken
            prev = prev + dou
            text.setText(prev.toString())
        }
    }
}
