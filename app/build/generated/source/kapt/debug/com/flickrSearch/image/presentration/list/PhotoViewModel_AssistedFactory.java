package com.flickrSearch.image.presentration.list;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.flickrSearch.image.data.repository.PhotoRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class PhotoViewModel_AssistedFactory implements ViewModelAssistedFactory<PhotoViewModel> {
  private final Provider<PhotoRepository> repository;

  @Inject
  PhotoViewModel_AssistedFactory(Provider<PhotoRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public PhotoViewModel create(SavedStateHandle arg0) {
    return new PhotoViewModel(repository.get());
  }
}
