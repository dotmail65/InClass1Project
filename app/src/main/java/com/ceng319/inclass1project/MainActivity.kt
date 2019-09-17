package com.ceng319.inclass1project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toastMsg(msg: String) {

        val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()

    }
    fun displayToastMsg(v: View) {

        toastMsg("Hello, this is my first android app")

    }

}
