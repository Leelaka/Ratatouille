package com.example.ratatouille

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        val actionBar = supportActionBar

        actionBar!!.title = "Home Screen"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}