package com.flickrSearch.image.domain;

import com.flickrSearch.image.data.remote.PhotoRemoteDataSource;
import com.flickrSearch.image.data.remote.PhotoService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideCharacterRemoteDataSourceFactory implements Factory<PhotoRemoteDataSource> {
  private final Provider<PhotoService> photoServiceProvider;

  public AppModule_ProvideCharacterRemoteDataSourceFactory(
      Provider<PhotoService> photoServiceProvider) {
    this.photoServiceProvider = photoServiceProvider;
  }

  @Override
  public PhotoRemoteDataSource get() {
    return provideCharacterRemoteDataSource(photoServiceProvider.get());
  }

  public static AppModule_ProvideCharacterRemoteDataSourceFactory create(
      Provider<PhotoService> photoServiceProvider) {
    return new AppModule_ProvideCharacterRemoteDataSourceFactory(photoServiceProvider);
  }

  public static PhotoRemoteDataSource provideCharacterRemoteDataSource(PhotoService photoService) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideCharacterRemoteDataSource(photoService), "Cannot return null from a non-@Nullable @Provides method");
  }
}
