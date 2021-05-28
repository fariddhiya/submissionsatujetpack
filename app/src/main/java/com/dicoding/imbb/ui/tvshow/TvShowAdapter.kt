package com.dicoding.imbb.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.imbb.R
import com.dicoding.imbb.data.MovieEntity
import com.dicoding.imbb.data.TvShowEntity
import com.dicoding.imbb.databinding.ItemsMovieBinding
import com.dicoding.imbb.ui.detailmovie.DetailMovieActivity
import com.dicoding.imbb.ui.detailtvshow.DetailTvShowActivity
import com.dicoding.imbb.ui.detailtvshow.DetailTvShowViewModel
import com.dicoding.imbb.ui.movies.MovieAdapter
import com.dicoding.imbb.ui.movies.MovieFragmentCallback

class TvShowAdapter(private val callback: TvShowFragmentCallback): RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>(){

    private var listTvShow = ArrayList<TvShowEntity>()

    inner class TvShowViewHolder(private val binding: ItemsMovieBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: TvShowEntity){
            with(binding){
                tvItemDirector.text = tvShow.director
                tvItemTitle.text = tvShow.title
                linkMovie.text = tvShow.link
                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailTvShowActivity::class.java)
                    intent.putExtra(DetailTvShowActivity.EXTRA_TVSHOW, tvShow.movieId)
                    itemView.context.startActivity(intent)
                }
                imgShare.setOnClickListener{
                    callback.onShareCLicks(tvShow)
                }
                Glide.with(itemView.context)
                    .load(tvShow.imagePath)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error).override(90, 120))
                    .into(imgPoster)
            }
        }
    }

    fun setTvShow(tvShow: List<TvShowEntity>?){
        if (tvShow == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(tvShow)
    }


    override fun getItemCount(): Int {
        return listTvShow.size
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemsMovieBinding = ItemsMovieBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return TvShowViewHolder(itemsMovieBinding)
    }

    override fun onBindViewHolder(tvShowViewHolder: TvShowViewHolder, position: Int) {
        val tvShow = listTvShow[position]
        tvShowViewHolder.bind(tvShow)
    }
}