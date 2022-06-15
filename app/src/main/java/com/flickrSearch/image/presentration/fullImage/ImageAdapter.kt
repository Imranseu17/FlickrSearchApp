package com.flickrSearch.image.presentration.fullImage



import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.flickrSearch.image.databinding.ImageLayoutBinding


class ImageAdapter : PagerAdapter() {
    //Context object
    var context: Context? = null

    //Array of images
    var images: String? = null


    //Viewpager Constructor
    fun ViewPagerAdapter(context: Context, images: String) {
        this.context = context
        this.images = images
    }

    override fun getCount(): Int {
        //return the number of images
        return images!!.length
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val binding: ImageLayoutBinding =
            ImageLayoutBinding.inflate(LayoutInflater.from(container.context), container, false)

        Glide.with(binding.root).
        load(images)
            .into(binding.imageViewMain)

        container.addView(binding.root)

        return binding.root
    }




    }


