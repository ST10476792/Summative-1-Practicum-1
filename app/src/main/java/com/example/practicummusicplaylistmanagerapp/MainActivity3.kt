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

        val returnBtn = findViewById<Button>(R.id.returnBtn)
        val displayTextview = findViewById<TextView>(R.id.displayTextview)
        val displayBtn = findViewById<Button>(R.id.displayBtn)
        val averageBtn = findViewById<Button>(R.id.averageBtn)


        displayBtn.setOnClickListener {
            var result = ""

            // Loop through all saved songs
            for (i in 0 until PlaylistData.count) {
                result += "Song: ${PlaylistData.songTitles[i]}\n"
                result += "Artist: ${PlaylistData.artistNames[i]}\n"
                result += "Rating: ${PlaylistData.ratings[i]} out of 5\n"
                result += "Comment: ${PlaylistData.comments[i]}\n"
                result += "-------------------\n"
            }

            // If no songs were saved, show a message
            if (result == "") {
                displayTextview.text = "No songs saved."
            } else {
                // Else will display the result in the TextView
                displayTextview.text = result
            }
        }


        if (PlaylistData.count == 0) {
            displayTextview.text = "No ratings yet."
        } else {
            var total = 0
            for (i in 0 until PlaylistData.count) {
                total += PlaylistData.ratings[i]
            }
            val average = total / PlaylistData.count
            displayTextview.text = "Average Rating: $average"
        }

        returnBtn.setOnClickListener {
            finish()
        }
    }
}


