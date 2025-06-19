package com.example.practicummusicplaylistmanagerapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val returnBtn = findViewById<Button>(R.id.returnBtn)
        val displayTextview = findViewById<TextView>(R.id.displayTextview)
        val displayBtn = findViewById<Button>(R.id.displayBtn)
        val averageBtn = findViewById<Button>(R.id.averageBtn)


        displayBtn.setOnClickListener {
            var result = ""

            // Loop through all saved songs
            for (i in 0 until count) {
                result = result + "Song: " + songTitles[i] + "\n"
                result = result + "Artist: " + artistNames[i] + "\n"
                result = result + "Rating: " + ratings[i] + "out of 5\n"
                result = result + "Comment: " + comments[i] + "\n"
                result = result + "-------------------\n"
            }

            // If no songs were saved, show a message
            if (result == "") {
                displayTextview.text = "No songs saved."
            } else {
                // Else will display the result in the TextView
                displayTextview.text = result
            }
        }

        averageBtn.setOnClickListener {
            if (count == 0) {
                //when average button is clicked,if no songs saved yet then will show this message
                displayTextview.text = "No ratings yet."
            } else {
                var total = 0  // A variable to store the sum of ratings

                // Loop through ratings to get total
                for (i in 0 until count) {
                    total = total + ratings[i]
                }

                // Calculate average rating
                val average = total / count
                displayTextview.text = "Average Rating: $average"
            }
        }

        returnBtn.setOnClickListener {
            finish()
        }
    }
}


