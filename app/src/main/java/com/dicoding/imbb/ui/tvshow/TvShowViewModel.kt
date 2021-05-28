package com.dicoding.imbb.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dicoding.imbb.data.MovieEntity
import com.dicoding.imbb.data.TvShowEntity
import com.dicoding.imbb.utils.DataDummy

class TvShowViewModel : ViewModel() {
    fun getTvShow(): List<TvShowEntity> = DataDummy.generateDummyTvShow()
}