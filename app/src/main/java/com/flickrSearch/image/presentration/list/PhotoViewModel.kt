package com.flickrSearch.image.presentration.list

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.flickrSearch.image.data.repository.PhotoRepository

class PhotoViewModel @ViewModelInject constructor(
    private val repository: PhotoRepository
) : ViewModel() {

    val Photos = repository.getPhotos("flickr.photos.getRecent","a00fd63a7e10bf71f0f474bbf2b2b8fa",
        "json",1, "date_taken,url_h","dog")
}