package com.dicoding.imbb.ui.detailtvshow

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.core.app.NavUtils
import androidx.core.view.isInvisible
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.imbb.R
import com.dicoding.imbb.data.MovieEntity
import com.dicoding.imbb.data.TvShowEntity
import com.dicoding.imbb.databinding.ContentDetailMovieBinding
import com.dicoding.imbb.databinding.ContentDetailTvshowBinding
import com.dicoding.imbb.ui.detailmovie.DetailMovieViewModel

class DetailTvShowActivity : AppCompatActivity() {
    private lateinit var binding: ContentDetailTvshowBinding

    companion object {
        const val EXTRA_TVSHOW = "101"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ContentDetailTvshowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("TV Show")

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailTvShowViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(EXTRA_TVSHOW)
            if (movieId != null) {
                viewModel.setSelected(movieId)
                countMovie(viewModel.getSelected())
                Log.d("farid", movieId)
            }
        }
        Log.d("awad", extras.toString())


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this)
            return true
        } else {
            return super.onOptionsItemSelected(item)
        }
    }

    private fun countMovie(tvShowEntity: TvShowEntity) {
        with(binding) {
            textDescription.text = tvShowEntity.description
            textDirector.text = tvShowEntity.director
            textDuration.text = tvShowEntity.duration
            textGenre.text = tvShowEntity.genre
            textRating.text = tvShowEntity.rating
            textRatingUser.text = tvShowEntity.ratingUser
            textTitle.text = tvShowEntity.title
            textEpisode.text = tvShowEntity.episode
            textSeason.text = tvShowEntity.season
            textYear.text = tvShowEntity.year
        }
        Glide.with(this)
            .load(tvShowEntity.imagePath)
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error).override(150, 180)
            )
            .into(binding.imageView)
    }
}