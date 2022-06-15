package com.flickrSearch.image.data.remote

import javax.inject.Inject

class PhotoRemoteDataSource @Inject constructor(
    private val photoService: PhotoService
): BaseDataSource() {

    suspend fun getPhotoList(method:String, api_key:String, format:String,
                             nojsoncallback:Int,extras:String, txt:String) =
        getResult { photoService.getAllPhotos(method,api_key,format,nojsoncallback,extras, txt) }

}