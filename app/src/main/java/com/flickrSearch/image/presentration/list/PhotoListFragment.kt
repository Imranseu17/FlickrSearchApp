package com.flickrSearch.image.presentration.list

import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.flickrSearch.image.R
import com.flickrSearch.image.databinding.FragmentPhotoListBinding
import com.flickrSearch.image.models.Photo
import com.flickrSearch.image.usecase.Constant
import com.flickrSearch.image.usecase.Resource
import com.flickrSearch.image.usecase.autoCleared
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PhotoListFragment : Fragment() , PhotoAdapter.PhotoListItemListener {

    private var binding: FragmentPhotoListBinding by autoCleared()
    private val viewModel: PhotoViewModel by viewModels()
    private lateinit var adapter: PhotoAdapter
    private  var list = ArrayList<Photo>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPhotoListBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        setupObservers()
        getView()?.setFocusableInTouchMode(true)
        getView()?.requestFocus()
        getView()?.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
                return if (keyCode == KeyEvent.KEYCODE_BACK) {
                    true
                } else false
            }
        })
    }

    private fun setupRecyclerView() {
        adapter = PhotoAdapter(requireContext(),list,this)
        binding.PhotoRv.layoutManager = LinearLayoutManager(requireContext())
        binding.PhotoRv.adapter = adapter

    }

    private fun setupObservers() {
        viewModel.Photos.observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Resource.Status.SUCCESS -> {
                    binding.progressBar.visibility = View.GONE
                    binding.shimmerViewContainer.visibility = View.GONE
                    if (!it.data.isNullOrEmpty()){
                        list = it.data as ArrayList<Photo>
                        adapter.setItems(it.data)

                    }
                }
                Resource.Status.ERROR ->{
                    Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT).show()
                }
                Resource.Status.LOADING ->{
                    binding.progressBar.visibility = View.VISIBLE
                    binding.shimmerViewContainer.visibility = View.VISIBLE
                }

            }
        })
    }



    override fun onPause() {
        super.onPause()
        binding.shimmerViewContainer.stopShimmerAnimation()
    }

    override fun onResume() {
        super.onResume()
        binding.shimmerViewContainer.startShimmerAnimation()
    }

    override fun onClickedPhotos(photo: String) {
        Constant.gotobackpage = 1
        findNavController().navigate(
            R.id.action_Photo_list_fragment_to_Photo_view,
            bundleOf("photo" to photo)
        )
    }


}