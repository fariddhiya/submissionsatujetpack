package com.dicoding.imbb.ui.tvshow

import com.dicoding.imbb.data.TvShowEntity

interface TvShowFragmentCallback {
    fun onShareCLicks(tvShow: TvShowEntity)
}