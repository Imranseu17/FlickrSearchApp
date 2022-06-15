package com.flickrSearch.image.domain

import android.content.Context
import com.flickrSearch.image.data.local.PhotoDao
import com.flickrSearch.image.data.remote.PhotoRemoteDataSource
import com.flickrSearch.image.data.remote.PhotoService
import com.flickrSearch.image.data.repository.PhotoRepository
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {


    var BASE_URL = "https://api.flickr.com/services/"

    @Singleton
    @Provides
    fun provideRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(JacksonConverterFactory.create())
        .build()

    @Provides
    fun provideGson(): Gson = GsonBuilder().setLenient()
        .create()

    @Provides
    fun provideCharacterService(retrofit: Retrofit): PhotoService = retrofit.create(PhotoService::class.java)

    @Singleton
    @Provides
    fun provideCharacterRemoteDataSource(photoService: PhotoService) = PhotoRemoteDataSource(photoService)

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext appContext: Context) =
        com.flickrSearch.image.data.local.AppDatabase.getDatabase(appContext)

    @Singleton
    @Provides
    fun provideCharacterDao(db: com.flickrSearch.image.data.local.AppDatabase) = db.PhotoDao()

    @Singleton
    @Provides
    fun provideRepository(remoteDataSource: PhotoRemoteDataSource,
                          localDataSource: PhotoDao) =
        PhotoRepository(remoteDataSource, localDataSource)




}





