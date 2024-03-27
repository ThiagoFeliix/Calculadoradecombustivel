package com.example.calculadoradecombustivel

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
const val KEY_RESULT = "MainActivity2.KEY_RESULT"
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val tvResult = intent.getFloatExtra(KEY_RESULT, 0f)
        val tvView = findViewById<TextView>(R.id.textView3)
        tvView.text = tvResult.toString()






    }
}