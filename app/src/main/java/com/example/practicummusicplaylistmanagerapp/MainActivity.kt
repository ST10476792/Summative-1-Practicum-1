package com.example.practicummusicplaylistmanagerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val nextBtn = findViewById<Button>(R.id.nextBtn)
        val exitBtn = findViewById<Button>(R.id.exitBtn)
        val headingTextView = findViewById<TextView>(R.id.headingTextview)

        //pressing next button will take you to the third screen
        nextBtn.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)

            startActivity(intent)
        }

        //pressing the add button will take you to the second screen
        addBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }

        //pressing the exit button will exit the app
        exitBtn.setOnClickListener {
            finishAffinity()
        }
    }
}
