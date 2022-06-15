package com.flickrSearch.image.presentration.list

import android.content.Context
import com.flickrSearch.image.models.Photo
import com.flickrSearch.image.presentration.fullImage.ImageAdapter
import com.google.common.truth.Truth
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
internal class PhotoAdapterTest{

    @Test
    fun  whenItemIsValid(){
        val list:ArrayList<Photo> = ArrayList()
        val adapter = PhotoAdapter()
        val result = adapter.setItems(list)
        Truth.assertThat(result).isEqualTo(true)
    }

    @Test
    fun  whenItemIsInValid(context: Context){
        val list:ArrayList<Photo> = arrayListOf()
        val adapter = PhotoAdapter()
        val result = adapter.setItems(list)
        Truth.assertThat(result).isEqualTo(true)
    }

}