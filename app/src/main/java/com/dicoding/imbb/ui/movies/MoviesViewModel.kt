package com.dicoding.imbb.ui.movies

import androidx.lifecycle.ViewModel
import com.dicoding.imbb.data.MovieEntity
import com.dicoding.imbb.utils.DataDummy

class MoviesViewModel : ViewModel() {
    fun getMovie(): List<MovieEntity> = DataDummy.generateDummyMovie()
}