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
    companion object{
        val songTitles = Array(10) { "" }
        val artistNames = Array(10) { "" }
        val ratings = Array(10) { 0 }
        val comments = Array(10) { "" }
        var count = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val nextBtn = findViewById<Button>(R.id.nextBtn)
        val exitBtn = findViewById<Button>(R.id.exitBtn)
        val headingTextView = findViewById<TextView>(R.id.headingTextview)

        nextBtn.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)

            startActivity(intent)
        }

        addBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }

        exitBtn.setOnClickListener {
            finishAffinity()
        }
    }
}
