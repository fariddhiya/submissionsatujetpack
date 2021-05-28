package com.dicoding.imbb.ui.tvshow

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
import com.dicoding.imbb.data.TvShowEntity
import com.dicoding.imbb.databinding.FragmentTvshowBinding

class TvShowFragment : Fragment(R.layout.fragment_tvshow), TvShowFragmentCallback {
    private lateinit var binding: FragmentTvshowBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTvshowBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val tvShowViewModel:TvShowViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]
            val tvShow = tvShowViewModel.getTvShow()
            with(activity as AppCompatActivity){
                supportActionBar?.title = "TV Show"
            }
            val tvShowAdapter = TvShowAdapter(this)
            tvShowAdapter.setTvShow(tvShow)

            with(binding.rvTvshow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowAdapter
            }
        }
    }

    override fun onShareCLicks(tvShow: TvShowEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Bagikan info film dari aplikasi ini sekarang.")
                .setText(resources.getString(R.string.share_text, tvShow.title, tvShow.link))
                .startChooser()
        }
    }
}