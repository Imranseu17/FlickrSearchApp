package com.flickrSearch.image.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.flickrSearch.image.models.Photo


@Dao
interface PhotoDao {

    @Query("SELECT * FROM photo")
    fun getAllPhotos() : LiveData<List<Photo>>

    @Query("SELECT * FROM photo WHERE id = :id")
    fun getPhoto(id: String): LiveData<Photo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertAll(Photo: List<Photo>?)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insert(Photo: List<Photo>?)


}