package com.dicoding.imbb.ui.detailmovie

import androidx.lifecycle.ViewModel
import com.dicoding.imbb.data.MovieEntity
import com.dicoding.imbb.utils.DataDummy

class DetailMovieViewModel: ViewModel() {
    private lateinit var movieId: String
    fun getSelected(): MovieEntity{
        lateinit var movie: MovieEntity
        val movieEntities = DataDummy.generateDummyMovie()
        for (movieEntity in movieEntities){
            if (movieEntity.movieId == movieId){
                movie = movieEntity
            }
        }
        return movie
    }

    fun setSelected(movieId: String){
        this.movieId = movieId
    }
}