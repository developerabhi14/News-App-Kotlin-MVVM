package com.developeravsk.newsappmvvm.ui

import androidx.lifecycle.ViewModel
import com.developeravsk.newsappmvvm.repositories.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
): ViewModel(){

}

