package com.flickrSearch.image.data.remote



import com.flickrSearch.image.models.Root
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface PhotoService {

    @Headers( "Content-Type: application/json; charset=utf-8" )
    @GET("rest/")
    suspend fun getAllPhotos(@Query("method") key:String,
                             @Query("api_key") large_area:String,
                             @Query("format")format:String,
                             @Query("nojsoncallback")nojsoncallback:Int,
                             @Query("extras")extras:String,
                             @Query("txt")txt:String)
    :Response<Root>


}