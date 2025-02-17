package com.developeravsk.newsappmvvm.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.developeravsk.newsappmvvm.R
import com.developeravsk.newsappmvvm.db.ArticleDatabase
import com.developeravsk.newsappmvvm.repositories.NewsRepository
import com.google.android.material.bottomnavigation.BottomNavigationView


class NewsActivity : AppCompatActivity() {
lateinit var viewModel: NewsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottonNavigationView)
        val newsnav: View = findViewById(R.id.newsNavHostFragment)

        val database= ArticleDatabase(this)
        val repository= NewsRepository(database)
        val factory=ViewModelProviderFactory(repository)
        viewModel= ViewModelProvider(this, factory).get(NewsViewModel::class.java)

        bottomNavigationView.setupWithNavController(newsnav.findNavController())
    }
}