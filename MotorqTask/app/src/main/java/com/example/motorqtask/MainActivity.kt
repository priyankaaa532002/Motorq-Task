package com.example.motorqtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var butt = findViewById<TextView>(R.id.butt)
        butt.setOnClickListener {
            val intent = Intent(this,EventsActivity::class.java)
            startActivity(intent)
        }
    }
}