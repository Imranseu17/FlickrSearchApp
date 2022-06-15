package com.flickrSearch.image.presentration.PhotoSearch;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.flickrSearch.image.data.repository.PhotoRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class PhotosearchViewModel_AssistedFactory implements ViewModelAssistedFactory<PhotosearchViewModel> {
  private final Provider<PhotoRepository> repository;

  @Inject
  PhotosearchViewModel_AssistedFactory(Provider<PhotoRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public PhotosearchViewModel create(SavedStateHandle arg0) {
    return new PhotosearchViewModel(repository.get());
  }
}
