package com.zaidali.myapplicationsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}