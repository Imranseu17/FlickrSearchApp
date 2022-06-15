package com.flickrSearch.image.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JS\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/flickrSearch/image/data/remote/PhotoService;", "", "getAllPhotos", "Lretrofit2/Response;", "Lcom/flickrSearch/image/models/Root;", "key", "", "large_area", "format", "nojsoncallback", "", "extras", "txt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PhotoService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "rest/")
    @retrofit2.http.Headers(value = {"Content-Type: application/json; charset=utf-8"})
    public abstract java.lang.Object getAllPhotos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "method")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String large_area, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "format")
    java.lang.String format, @retrofit2.http.Query(value = "nojsoncallback")
    int nojsoncallback, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "extras")
    java.lang.String extras, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "txt")
    java.lang.String txt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.flickrSearch.image.models.Root>> continuation);
}