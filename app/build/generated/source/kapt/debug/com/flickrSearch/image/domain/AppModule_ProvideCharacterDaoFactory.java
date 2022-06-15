package com.flickrSearch.image.domain;

import com.flickrSearch.image.data.local.AppDatabase;
import com.flickrSearch.image.data.local.PhotoDao;
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
public final class AppModule_ProvideCharacterDaoFactory implements Factory<PhotoDao> {
  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideCharacterDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public PhotoDao get() {
    return provideCharacterDao(dbProvider.get());
  }

  public static AppModule_ProvideCharacterDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideCharacterDaoFactory(dbProvider);
  }

  public static PhotoDao provideCharacterDao(AppDatabase db) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideCharacterDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
