package com.flickrSearch.image.presentration.fullImage

import android.content.Context
import com.google.common.truth.Truth
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
internal class ImageAdapterTest{

    @Test
    fun  whenViewPagerIsValid(context: Context){
        val context = context
        val image = "Some random url"
        val adapter = ImageAdapter()
        val result = adapter.ViewPagerAdapter(context,image)
        Truth.assertThat(result).isEqualTo(true)
    }

    @Test
    fun  whenViewPagerIsInValid(context: Context){
        val context = context
        val image = ""
        val adapter = ImageAdapter()
        val result = adapter.ViewPagerAdapter(context,image)
        Truth.assertThat(result).isEqualTo(false)
    }
}