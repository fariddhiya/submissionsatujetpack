package com.dicoding.imbb.ui.detailtvshow

import androidx.lifecycle.ViewModel
import com.dicoding.imbb.data.MovieEntity
import com.dicoding.imbb.data.TvShowEntity
import com.dicoding.imbb.utils.DataDummy

class DetailTvShowViewModel: ViewModel() {
    private lateinit var movieId: String
    fun getSelected(): TvShowEntity {
        lateinit var tvShow: TvShowEntity
        val tvShowEntities = DataDummy.generateDummyTvShow()
        for (tvShowEntity in tvShowEntities){
            if (tvShowEntity.movieId == movieId){
                tvShow = tvShowEntity
            }
        }
        return tvShow
    }

    fun setSelected(movieId: String){
        this.movieId = movieId
    }
}


