package com.flickrSearch.image.domain;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\nH\u0007J\u0010\u0010\u001d\u001a\n \u001e*\u0004\u0018\u00010\u00130\u0013H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001f"}, d2 = {"Lcom/flickrSearch/image/domain/AppModule;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "setBASE_URL", "(Ljava/lang/String;)V", "provideCharacterDao", "Lcom/flickrSearch/image/data/local/PhotoDao;", "db", "Lcom/flickrSearch/image/data/local/AppDatabase;", "provideCharacterRemoteDataSource", "Lcom/flickrSearch/image/data/remote/PhotoRemoteDataSource;", "photoService", "Lcom/flickrSearch/image/data/remote/PhotoService;", "provideCharacterService", "retrofit", "Lretrofit2/Retrofit;", "provideDatabase", "appContext", "Landroid/content/Context;", "provideGson", "Lcom/google/gson/Gson;", "provideRepository", "Lcom/flickrSearch/image/data/repository/PhotoRepository;", "remoteDataSource", "localDataSource", "provideRetrofit", "kotlin.jvm.PlatformType", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.flickrSearch.image.domain.AppModule INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String BASE_URL = "https://api.flickr.com/services/";
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    public final void setBASE_URL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.flickrSearch.image.data.remote.PhotoService provideCharacterService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.flickrSearch.image.data.remote.PhotoRemoteDataSource provideCharacterRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.flickrSearch.image.data.remote.PhotoService photoService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.flickrSearch.image.data.local.AppDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.flickrSearch.image.data.local.PhotoDao provideCharacterDao(@org.jetbrains.annotations.NotNull()
    com.flickrSearch.image.data.local.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.flickrSearch.image.data.repository.PhotoRepository provideRepository(@org.jetbrains.annotations.NotNull()
    com.flickrSearch.image.data.remote.PhotoRemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.flickrSearch.image.data.local.PhotoDao localDataSource) {
        return null;
    }
}