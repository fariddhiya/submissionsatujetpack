package com.dicoding.imbb.ui.detailmovie

import com.dicoding.imbb.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val movieId = dummyMovie.movieId

    @Before
    fun setUp(){
        viewModel = DetailMovieViewModel()
        viewModel.setSelected(movieId)
    }

    @Test
    fun getSelected() {
        viewModel.setSelected(dummyMovie.movieId)
        val movieEntity = viewModel.getSelected()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.movieId, movieEntity.movieId)
        assertEquals(dummyMovie.link, movieEntity.link)
        assertEquals(dummyMovie.description, movieEntity.description)
        assertEquals(dummyMovie.imagePath, movieEntity.imagePath)
        assertEquals(dummyMovie.date, movieEntity.date)
        assertEquals(dummyMovie.director, movieEntity.director)
        assertEquals(dummyMovie.duration, movieEntity.duration)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.rating, movieEntity.rating)
        assertEquals(dummyMovie.ratingUser, movieEntity.ratingUser)
        assertEquals(dummyMovie.writer, movieEntity.writer)
        assertEquals(dummyMovie.year, movieEntity.year)
    }
}