package com.scc.kotlin.primary

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val intent = Intent(this,NextActivity::class.java).apply {
//            putExtra("name","sc")
//            putExtra("age",19)
//        }
//        startActivity(intent)
    }
}