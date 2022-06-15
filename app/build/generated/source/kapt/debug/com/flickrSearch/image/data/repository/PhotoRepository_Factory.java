package com.flickrSearch.image.data.repository;

import com.flickrSearch.image.data.local.PhotoDao;
import com.flickrSearch.image.data.remote.PhotoRemoteDataSource;
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
public final class PhotoRepository_Factory implements Factory<PhotoRepository> {
  private final Provider<PhotoRemoteDataSource> remoteDataSourceProvider;

  private final Provider<PhotoDao> localDataSourceProvider;

  public PhotoRepository_Factory(Provider<PhotoRemoteDataSource> remoteDataSourceProvider,
      Provider<PhotoDao> localDataSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public PhotoRepository get() {
    return newInstance(remoteDataSourceProvider.get(), localDataSourceProvider.get());
  }

  public static PhotoRepository_Factory create(
      Provider<PhotoRemoteDataSource> remoteDataSourceProvider,
      Provider<PhotoDao> localDataSourceProvider) {
    return new PhotoRepository_Factory(remoteDataSourceProvider, localDataSourceProvider);
  }

  public static PhotoRepository newInstance(PhotoRemoteDataSource remoteDataSource,
      PhotoDao localDataSource) {
    return new PhotoRepository(remoteDataSource, localDataSource);
  }
}
