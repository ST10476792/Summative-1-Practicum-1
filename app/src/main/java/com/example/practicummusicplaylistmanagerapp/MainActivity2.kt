package com.example.practicummusicplaylistmanagerapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val saveBtn = findViewById<Button>(R.id.saveBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn)
        val titleEdittext = findViewById<EditText>(R.id.titleEdittext)
        val nameEditText = findViewById<EditText>(R.id.nameEdittext)
        val ratingEditText = findViewById<EditText>(R.id.ratingEdittext)
        val commentsEditText=  findViewById<EditText>(R.id.commentsEdittext)
        val headingTextview2 = findViewById<TextView>(R.id.headingTextview2)
        val backBtn1 = findViewById<Button>(R.id.backBtn1)


        saveBtn.setOnClickListener {
            val title = titleEdittext.text.toString()
            val artist = nameEditText.text.toString()
            val rating = ratingEditText.text.toString().toIntOrNull() ?: 0
            val comment = commentsEditText.text.toString()


                if (title.isNotEmpty() && artist.isNotEmpty() && rating in 1..5 && count < 10) {
                    songTitles[count] = title
                    artistNames[count] = artist
                    ratings[count] = rating
                    comments[count] = comment
                    count++

                    Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show()

                    titleEdittext.text.clear()
                    nameEditText.text.clear()
                    ratingEditText.text.clear()
                    commentsEditText.text.clear()
                } else {
                    Toast.makeText(this, "Fill all fields correctly", Toast.LENGTH_SHORT).show()
                }
            }

            backBtn1.setOnClickListener {
                finish() // go back to MainActivity
            }
        }
    }












