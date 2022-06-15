package com.flickrSearch.image.presentration.fullImage

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.flickrSearch.image.R
import com.flickrSearch.image.databinding.FragmentImageBinding
import com.flickrSearch.image.usecase.Constant
import com.flickrSearch.image.usecase.autoCleared
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ImageFragment : Fragment() {

    private var binding: FragmentImageBinding by autoCleared()
    private lateinit var adapter: ImageAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentImageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getView()?.setFocusableInTouchMode(true)
        getView()?.requestFocus()
        getView()?.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
                return if (keyCode == KeyEvent.KEYCODE_BACK) {
                    if(Constant.gotobackpage == 1)
                    {
                        findNavController().navigate(
                            R.id.Photo_list_fragment
                        )
                    }else{
                        findNavController().navigate(
                            R.id.photo_list_search
                        )
                    }
                    true

                } else false
            }
        })
        //Initializing the ViewPagerAdapter
        //Initializing the ViewPagerAdapter
        adapter = ImageAdapter()
        Log.e("image_value: ", arguments!!.getString("photo")!!)
       adapter.ViewPagerAdapter(requireContext(), arguments!!.getString("photo")!!)
        //Adding the Adapter to the ViewPager

        //Adding the Adapter to the ViewPager
        binding.pager.setAdapter(adapter)

    }




}