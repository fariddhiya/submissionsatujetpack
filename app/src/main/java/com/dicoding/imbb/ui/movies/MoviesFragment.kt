package com.dicoding.imbb.ui.movies

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.imbb.R
import com.dicoding.imbb.data.MovieEntity
import com.dicoding.imbb.databinding.FragmentMoviesBinding

class MoviesFragment : Fragment(R.layout.fragment_movies), MovieFragmentCallback {
    private lateinit var moviesViewModel: MoviesViewModel
    private lateinit var binding: FragmentMoviesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMoviesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null){
            moviesViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MoviesViewModel::class.java]
            val movies = moviesViewModel.getMovie()
            (activity as AppCompatActivity).supportActionBar?.title = "Movies"
            val movieAdapter = MovieAdapter(this)
            movieAdapter.setMovie(movies)

            with(binding.rvMovie){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }

    override fun onShareCLick(movie: MovieEntity) {
        if (activity != null){
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Bagikan info film dari aplikasi ini sekarang.")
                .setText(resources.getString(R.string.share_text, movie.title ,movie.link))
                .startChooser()
        }
    }
}