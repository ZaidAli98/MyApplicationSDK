package com.zaidali.myapplicationsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zaidali.mylibrary.Calculator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val c = Calculator()
        val x = c.add(1,2)
    }

}
