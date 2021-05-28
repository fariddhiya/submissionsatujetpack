package com.dicoding.imbb.ui.movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.imbb.R
import com.dicoding.imbb.data.MovieEntity
import com.dicoding.imbb.databinding.ItemsMovieBinding
import com.dicoding.imbb.ui.detailmovie.DetailMovieActivity

class MovieAdapter(private val callback: MovieFragmentCallback): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

    private var listMovie = ArrayList<MovieEntity>()

    inner class MovieViewHolder(private val binding: ItemsMovieBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity){
            with(binding){
                tvItemDate.text = movie.date
                tvItemDirector.text = movie.director
                tvItemTitle.text = movie.title
                linkMovie.text = movie.link
                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_MOVIE, movie.movieId)
                    itemView.context.startActivity(intent)
                }
                imgShare.setOnClickListener{
                    callback.onShareCLick(movie)
                }
                Glide.with(itemView.context)
                    .load(movie.imagePath)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error).override(90, 120))
                    .into(imgPoster)
            }
        }
    }

    fun setMovie(movie: List<MovieEntity>?){
        if (movie == null) return
        this.listMovie.clear()
        this.listMovie.addAll(movie)
    }

    override fun onBindViewHolder(movieViewHolder: MovieViewHolder, position: Int) {
        val movie = listMovie[position]
        movieViewHolder.bind(movie)
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsMovieBinding = ItemsMovieBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return MovieViewHolder(itemsMovieBinding)
    }
}