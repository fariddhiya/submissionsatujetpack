package com.dicoding.imbb.ui.detailtvshow

import com.dicoding.imbb.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTvShowViewModelTest {

    private lateinit var viewModel: DetailTvShowViewModel
    private val dummyTvShow = DataDummy.generateDummyTvShow()[0]
    private val movieId = dummyTvShow.movieId

    @Before
    fun setUp(){
        viewModel = DetailTvShowViewModel()
        viewModel.setSelected(movieId)
    }

    @Test
    fun getSelected() {
        viewModel.setSelected(dummyTvShow.movieId)
        val tvShowEntity = viewModel.getSelected()
        assertNotNull(tvShowEntity)
        assertEquals(dummyTvShow.title, tvShowEntity.title)
        assertEquals(dummyTvShow.movieId, tvShowEntity.movieId)
        assertEquals(dummyTvShow.link, tvShowEntity.link)
        assertEquals(dummyTvShow.description, tvShowEntity.description)
        assertEquals(dummyTvShow.imagePath, tvShowEntity.imagePath)
        assertEquals(dummyTvShow.episode, tvShowEntity.episode)
        assertEquals(dummyTvShow.director, tvShowEntity.director)
        assertEquals(dummyTvShow.duration, tvShowEntity.duration)
        assertEquals(dummyTvShow.genre, tvShowEntity.genre)
        assertEquals(dummyTvShow.rating, tvShowEntity.rating)
        assertEquals(dummyTvShow.ratingUser, tvShowEntity.ratingUser)
        assertEquals(dummyTvShow.season, tvShowEntity.season)
        assertEquals(dummyTvShow.year, tvShowEntity.year)
    }
}