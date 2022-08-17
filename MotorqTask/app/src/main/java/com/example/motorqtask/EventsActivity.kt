package com.example.motorqtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class EventsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)
        var submit = findViewById<TextView>(R.id.submit)
        submit.setOnClickListener {
            val intent = Intent(this,SubmitActivity::class.java)
            intent.putExtra("key","value")
            startActivity(intent)
        }
        var capacity1 = 10;
        var capacity2 = 10;
        var capacity3 = 10;
        var l = listOf<Int>(1,2,3,4,5,6,7,8,9,10);

        var b1 = findViewById<Button>(R.id.b1)
        var b2 = findViewById<Button>(R.id.b1)
        var b3 = findViewById<Button>(R.id.b1)
        b1.setOnClickListener {
            capacity1--;
            if(capacity1<0){
                Toast.makeText(applicationContext,
                    "Seats are full here, explore other workshops", Toast.LENGTH_LONG).show()
            }
        }

        b2.setOnClickListener {
            capacity2--;
            if(capacity2<0){
                Toast.makeText(applicationContext,
                    "Seats are full here, explore other workshops", Toast.LENGTH_LONG).show()
            }
        }


        b3.setOnClickListener {
            capacity3--;
            if(capacity3<0){
                Toast.makeText(applicationContext,
                    "Seats are full here, explore other workshops", Toast.LENGTH_LONG).show()
            }
        }
    }
}