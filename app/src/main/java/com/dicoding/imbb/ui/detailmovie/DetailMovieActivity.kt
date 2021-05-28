package com.dicoding.imbb.ui.detailmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.app.NavUtils
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.imbb.R
import com.dicoding.imbb.data.MovieEntity
import com.dicoding.imbb.databinding.ContentDetailMovieBinding

class DetailMovieActivity : AppCompatActivity() {

    private lateinit var binding: ContentDetailMovieBinding

    companion object{
        const val EXTRA_MOVIE = "100"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ContentDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Movie")

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]
        val extras = intent.extras
        if (extras != null){
            val movieId = extras.getString(EXTRA_MOVIE)
            if (movieId != null){
                viewModel.setSelected(movieId)
                countMovie(viewModel.getSelected())
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            NavUtils.navigateUpFromSameTask(this)
            return true
        } else {
            return super.onOptionsItemSelected(item)
        }
    }

    private fun countMovie(movieEntity: MovieEntity){
        with(binding){
            textDescription.text = movieEntity.description
            textDirector.text = movieEntity.director
            textDuration.text = movieEntity.duration
            textGenre.text = movieEntity.genre
            textRating.text = movieEntity.rating
            textRatingUser.text = movieEntity.ratingUser
            textTitle.text = movieEntity.title
            textWriter.text = movieEntity.writer
        }
        Glide.with(this)
            .load(movieEntity.imagePath)
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                .error(R.drawable.ic_error).override(150, 180))
            .into(binding.imageView)
    }
}