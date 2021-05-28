package com.dicoding.imbb.ui.movies

import com.dicoding.imbb.data.MovieEntity

interface MovieFragmentCallback {
    fun onShareCLick(movie: MovieEntity)
}