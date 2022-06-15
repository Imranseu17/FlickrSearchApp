package com.flickrSearch.image.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lcom/flickrSearch/image/models/Photos;", "", "page", "", "pages", "perpage", "total", "photo", "", "Lcom/flickrSearch/image/models/Photo;", "(IIIILjava/util/List;)V", "getPage", "()I", "getPages", "getPerpage", "getPhoto", "()Ljava/util/List;", "getTotal", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public final class Photos {
    private final int page = 0;
    private final int pages = 0;
    private final int perpage = 0;
    private final int total = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.flickrSearch.image.models.Photo> photo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.flickrSearch.image.models.Photos copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "page")
    int page, @com.fasterxml.jackson.annotation.JsonProperty(value = "pages")
    int pages, @com.fasterxml.jackson.annotation.JsonProperty(value = "perpage")
    int perpage, @com.fasterxml.jackson.annotation.JsonProperty(value = "total")
    int total, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "photo")
    java.util.List<com.flickrSearch.image.models.Photo> photo) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Photos(@com.fasterxml.jackson.annotation.JsonProperty(value = "page")
    int page, @com.fasterxml.jackson.annotation.JsonProperty(value = "pages")
    int pages, @com.fasterxml.jackson.annotation.JsonProperty(value = "perpage")
    int perpage, @com.fasterxml.jackson.annotation.JsonProperty(value = "total")
    int total, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "photo")
    java.util.List<com.flickrSearch.image.models.Photo> photo) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getPages() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getPerpage() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTotal() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.flickrSearch.image.models.Photo> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.flickrSearch.image.models.Photo> getPhoto() {
        return null;
    }
}