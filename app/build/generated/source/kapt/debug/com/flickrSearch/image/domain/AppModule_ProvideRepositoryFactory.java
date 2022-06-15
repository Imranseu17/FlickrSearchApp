package com.flickrSearch.image.domain;

import com.flickrSearch.image.data.local.PhotoDao;
import com.flickrSearch.image.data.remote.PhotoRemoteDataSource;
import com.flickrSearch.image.data.repository.PhotoRepository;
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
public final class AppModule_ProvideRepositoryFactory implements Factory<PhotoRepository> {
  private final Provider<PhotoRemoteDataSource> remoteDataSourceProvider;

  private final Provider<PhotoDao> localDataSourceProvider;

  public AppModule_ProvideRepositoryFactory(
      Provider<PhotoRemoteDataSource> remoteDataSourceProvider,
      Provider<PhotoDao> localDataSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public PhotoRepository get() {
    return provideRepository(remoteDataSourceProvider.get(), localDataSourceProvider.get());
  }

  public static AppModule_ProvideRepositoryFactory create(
      Provider<PhotoRemoteDataSource> remoteDataSourceProvider,
      Provider<PhotoDao> localDataSourceProvider) {
    return new AppModule_ProvideRepositoryFactory(remoteDataSourceProvider, localDataSourceProvider);
  }

  public static PhotoRepository provideRepository(PhotoRemoteDataSource remoteDataSource,
      PhotoDao localDataSource) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRepository(remoteDataSource, localDataSource), "Cannot return null from a non-@Nullable @Provides method");
  }
}
