package com.flickrSearch.image.domain;

import com.flickrSearch.image.data.remote.PhotoService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideCharacterServiceFactory implements Factory<PhotoService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideCharacterServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PhotoService get() {
    return provideCharacterService(retrofitProvider.get());
  }

  public static AppModule_ProvideCharacterServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideCharacterServiceFactory(retrofitProvider);
  }

  public static PhotoService provideCharacterService(Retrofit retrofit) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideCharacterService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
