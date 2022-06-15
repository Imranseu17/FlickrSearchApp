package com.flickrSearch.image.domain;

import android.content.Context;
import com.flickrSearch.image.data.local.AppDatabase;
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
public final class AppModule_ProvideDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> appContextProvider;

  public AppModule_ProvideDatabaseFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideDatabase(appContextProvider.get());
  }

  public static AppModule_ProvideDatabaseFactory create(Provider<Context> appContextProvider) {
    return new AppModule_ProvideDatabaseFactory(appContextProvider);
  }

  public static AppDatabase provideDatabase(Context appContext) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideDatabase(appContext), "Cannot return null from a non-@Nullable @Provides method");
  }
}
