package com.flickrSearch.image.presentration.PhotoSearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/flickrSearch/image/presentration/PhotoSearch/PhotosearchViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/flickrSearch/image/data/repository/PhotoRepository;", "(Lcom/flickrSearch/image/data/repository/PhotoRepository;)V", "Photos", "Landroidx/lifecycle/LiveData;", "Lcom/flickrSearch/image/usecase/Resource;", "", "Lcom/flickrSearch/image/models/Photo;", "getPhotos", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class PhotosearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.flickrSearch.image.data.repository.PhotoRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.flickrSearch.image.usecase.Resource<java.util.List<com.flickrSearch.image.models.Photo>>> Photos = null;
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public PhotosearchViewModel(@org.jetbrains.annotations.NotNull()
    com.flickrSearch.image.data.repository.PhotoRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.flickrSearch.image.usecase.Resource<java.util.List<com.flickrSearch.image.models.Photo>>> getPhotos() {
        return null;
    }
}