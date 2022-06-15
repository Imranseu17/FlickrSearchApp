package com.flickrSearch.image.data.repository

import com.flickrSearch.image.data.local.PhotoDao
import com.flickrSearch.image.data.remote.PhotoRemoteDataSource
import com.flickrSearch.image.usecase.performGetOperation
import javax.inject.Inject

class PhotoRepository @Inject constructor(
    private val remoteDataSource: PhotoRemoteDataSource,
    private val localDataSource: PhotoDao
) {


    fun getPhotos(method:String, api_key:String, format:String,
                  nojsoncallback:Int,extras:String, txt:String) = performGetOperation(
        databaseQuery = { localDataSource.getAllPhotos() },
        networkCall = { remoteDataSource.getPhotoList(method, api_key, format, nojsoncallback, extras, txt) },
        saveCallResult = { localDataSource.insertAll(it.photos.photo)})

}