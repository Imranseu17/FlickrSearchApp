package com.flickrSearch.image.presentration.PhotoSearch;

import com.flickrSearch.image.data.repository.PhotoRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PhotosearchViewModel_AssistedFactory_Factory implements Factory<PhotosearchViewModel_AssistedFactory> {
  private final Provider<PhotoRepository> repositoryProvider;

  public PhotosearchViewModel_AssistedFactory_Factory(
      Provider<PhotoRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PhotosearchViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static PhotosearchViewModel_AssistedFactory_Factory create(
      Provider<PhotoRepository> repositoryProvider) {
    return new PhotosearchViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static PhotosearchViewModel_AssistedFactory newInstance(
      Provider<PhotoRepository> repository) {
    return new PhotosearchViewModel_AssistedFactory(repository);
  }
}
