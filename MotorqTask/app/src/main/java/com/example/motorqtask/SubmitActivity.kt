package com.example.motorqtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SubmitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit)
        var finall = findViewById<TextView>(R.id.finall)
        finall.setText("TOPIC A\nWORKSHOP A")
    }
}