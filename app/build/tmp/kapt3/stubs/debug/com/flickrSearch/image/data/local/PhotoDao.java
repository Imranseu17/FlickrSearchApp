package com.flickrSearch.image.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\'J\u0018\u0010\f\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\'\u00a8\u0006\r"}, d2 = {"Lcom/flickrSearch/image/data/local/PhotoDao;", "", "getAllPhotos", "Landroidx/lifecycle/LiveData;", "", "Lcom/flickrSearch/image/models/Photo;", "getPhoto", "id", "", "insert", "", "Photo", "insertAll", "app_debug"})
public abstract interface PhotoDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM photo")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.flickrSearch.image.models.Photo>> getAllPhotos();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM photo WHERE id = :id")
    public abstract androidx.lifecycle.LiveData<com.flickrSearch.image.models.Photo> getPhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.Nullable()
    java.util.List<com.flickrSearch.image.models.Photo> Photo);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.Nullable()
    java.util.List<com.flickrSearch.image.models.Photo> Photo);
}