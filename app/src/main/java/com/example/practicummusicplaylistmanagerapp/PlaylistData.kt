package com.example.practicummusicplaylistmanagerapp

// 4 parallel arrays to store data
object PlaylistData {
    val songTitles = Array(10) { "" }
    val artistNames = Array(10) { "" }
    val ratings = Array(10) { 0 }
    val comments = Array(10) { "" }
    var count = 0
}

// Counter for how many songs are saved
var count = 0
