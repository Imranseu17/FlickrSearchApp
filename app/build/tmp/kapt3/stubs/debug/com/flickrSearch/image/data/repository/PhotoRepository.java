package com.flickrSearch.image.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JH\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/flickrSearch/image/data/repository/PhotoRepository;", "", "remoteDataSource", "Lcom/flickrSearch/image/data/remote/PhotoRemoteDataSource;", "localDataSource", "Lcom/flickrSearch/image/data/local/PhotoDao;", "(Lcom/flickrSearch/image/data/remote/PhotoRemoteDataSource;Lcom/flickrSearch/image/data/local/PhotoDao;)V", "getPhotos", "Landroidx/lifecycle/LiveData;", "Lcom/flickrSearch/image/usecase/Resource;", "", "Lcom/flickrSearch/image/models/Photo;", "method", "", "api_key", "format", "nojsoncallback", "", "extras", "txt", "app_debug"})
public final class PhotoRepository {
    private final com.flickrSearch.image.data.remote.PhotoRemoteDataSource remoteDataSource = null;
    private final com.flickrSearch.image.data.local.PhotoDao localDataSource = null;
    
    @javax.inject.Inject()
    public PhotoRepository(@org.jetbrains.annotations.NotNull()
    com.flickrSearch.image.data.remote.PhotoRemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.flickrSearch.image.data.local.PhotoDao localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.flickrSearch.image.usecase.Resource<java.util.List<com.flickrSearch.image.models.Photo>>> getPhotos(@org.jetbrains.annotations.NotNull()
    java.lang.String method, @org.jetbrains.annotations.NotNull()
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    java.lang.String format, int nojsoncallback, @org.jetbrains.annotations.NotNull()
    java.lang.String extras, @org.jetbrains.annotations.NotNull()
    java.lang.String txt) {
        return null;
    }
}