package com.cts.aaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sample_tv.setOnClickListener {

            val i= Intent(this@MainActivity,FirstClass::class.java)
            startActivity(i)


        }
    }
}
