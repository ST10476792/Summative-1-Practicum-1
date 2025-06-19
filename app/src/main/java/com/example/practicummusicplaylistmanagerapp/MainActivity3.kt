package com.example.practicummusicplaylistmanagerapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        // Find views by ID
        val clearBtn = findViewById<Button>(R.id.clearBtn)
        val displayTextview = findViewById<TextView>(R.id.displayTextview)
        val displayBtn = findViewById<Button>(R.id.displayBtn)
        val averageBtn = findViewById<Button>(R.id.averageBtn)

        // When the Display button is clicked
        displayBtn.setOnClickListener {
            var result = ""

            // Loop through all saved songs and build the display string
            for (i in 0 until PlaylistData.count) {
                result += "Song: ${PlaylistData.songTitles[i]}\n"
                result += "Artist: ${PlaylistData.artistNames[i]}\n"
                result += "Rating: ${PlaylistData.ratings[i]} out of 5\n"
                result += "Comment: ${PlaylistData.comments[i]}\n"
                result += "-------------------\n"
            }

            // If no songs were saved, show a default message
            if (result.isEmpty()) {
                displayTextview.text = "No songs saved."
            } else {
                // Otherwise, display the formatted result
                displayTextview.text = result
            }
        }

        // When the Average button is clicked
        averageBtn.setOnClickListener {
            // If there are no saved ratings yet
            if (PlaylistData.count == 0) {
                displayTextview.text = "No ratings yet."
            } else {
                var total = 0 // Variable to sum ratings

                // Loop to calculate total of all ratings
                for (i in 0 until PlaylistData.count) {
                    total += PlaylistData.ratings[i]
                }

                // Calculate average rating (integer division)
                val average = total / PlaylistData.count

                // Display the average rating
                displayTextview.text = "Average Rating: $average"
            }
            clearBtn.setOnClickListener {
                displayTextview.text = ""
            }
        }
    }
}

