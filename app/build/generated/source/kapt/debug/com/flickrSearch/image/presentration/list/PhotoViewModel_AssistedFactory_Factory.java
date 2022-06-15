package com.flickrSearch.image.presentration.list;

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
public final class PhotoViewModel_AssistedFactory_Factory implements Factory<PhotoViewModel_AssistedFactory> {
  private final Provider<PhotoRepository> repositoryProvider;

  public PhotoViewModel_AssistedFactory_Factory(Provider<PhotoRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PhotoViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static PhotoViewModel_AssistedFactory_Factory create(
      Provider<PhotoRepository> repositoryProvider) {
    return new PhotoViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static PhotoViewModel_AssistedFactory newInstance(Provider<PhotoRepository> repository) {
    return new PhotoViewModel_AssistedFactory(repository);
  }
}
