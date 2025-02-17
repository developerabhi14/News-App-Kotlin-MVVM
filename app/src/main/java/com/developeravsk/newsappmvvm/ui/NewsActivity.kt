package com.developeravsk.newsappmvvm.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.developeravsk.newsappmvvm.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottonNavigationView)
        val newsnav: View = findViewById(R.id.newsNavHostFragment)
        bottomNavigationView.setupWithNavController(newsnav.findNavController())
    }
}