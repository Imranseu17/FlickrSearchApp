package com.flickrSearch.image.data.remote;

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
public final class PhotoRemoteDataSource_Factory implements Factory<PhotoRemoteDataSource> {
  private final Provider<PhotoService> photoServiceProvider;

  public PhotoRemoteDataSource_Factory(Provider<PhotoService> photoServiceProvider) {
    this.photoServiceProvider = photoServiceProvider;
  }

  @Override
  public PhotoRemoteDataSource get() {
    return newInstance(photoServiceProvider.get());
  }

  public static PhotoRemoteDataSource_Factory create(Provider<PhotoService> photoServiceProvider) {
    return new PhotoRemoteDataSource_Factory(photoServiceProvider);
  }

  public static PhotoRemoteDataSource newInstance(PhotoService photoService) {
    return new PhotoRemoteDataSource(photoService);
  }
}
