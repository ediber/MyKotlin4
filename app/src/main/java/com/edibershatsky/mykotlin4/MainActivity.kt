package com.edibershatsky.mykotlin4

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     var model: Model? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        model = Model()


        plus.setOnClickListener { view ->
//            Toast.makeText(applicationContext, "NOT IMPLEMENTED YET", Toast.LENGTH_SHORT).show()
            plusClicked()
        }

        minus.setOnClickListener { view ->
            minusClicked()
        }

        zero.setOnClickListener { view ->
            zeroClicked()
        }

        equals.setOnClickListener { view ->
            equalsClicked()
        }


    }

    private fun equalsClicked() {
        var num = textToNum()

        model?.equal(num)
        text.setText(model!!.prev.toString())
    }

    private fun zeroClicked() {
        text.setText("")
        model?.toZero()
    }

    private fun minusClicked() {
        var num = textToNum()
        model?.minus(num)
        text.setText("")
    }

    private fun plusClicked() {
        var num = textToNum()
        model?.plus(num)
        text.setText("")
    }

    private fun textToNum(): Double {
        var num = 0.0
        if (text.text.toString() != "") {
            num = text.text.toString().toDouble()
        }
        return num
    }
}
