package com.flickrSearch.image.presentration.PhotoSearch

import android.content.Context
import com.flickrSearch.image.models.Photo
import com.flickrSearch.image.presentration.list.PhotoAdapter
import com.google.common.truth.Truth
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
internal class PhotoSearchAdapterTest{
    @Test
    fun  whenItemIsValid(){
        val list:ArrayList<Photo> = ArrayList()
        val adapter = PhotoSearchAdapter()
        val result = adapter.setItems(list)
        Truth.assertThat(result).isEqualTo(true)
    }

    @Test
    fun  whenItemIsInValid(context: Context){
        val list:ArrayList<Photo> = arrayListOf()
        val adapter = PhotoSearchAdapter()
        val result = adapter.setItems(list)
        Truth.assertThat(result).isEqualTo(true)
    }
}