package com.flickrSearch.image.presentration.PhotoSearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB/\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB\u0005\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u001e\u0010\u001c\u001a\u00020\u00152\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/flickrSearch/image/presentration/PhotoSearch/PhotoSearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/flickrSearch/image/presentration/PhotoSearch/PhotoViewHolder;", "Landroid/widget/Filterable;", "context", "Landroid/content/Context;", "items", "Ljava/util/ArrayList;", "Lcom/flickrSearch/image/models/Photo;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/flickrSearch/image/presentration/PhotoSearch/PhotoSearchAdapter$PhotoItemListener;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/flickrSearch/image/presentration/PhotoSearch/PhotoSearchAdapter$PhotoItemListener;)V", "()V", "itemList", "itemListFilter", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "PhotoItemListener", "app_debug"})
public final class PhotoSearchAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.flickrSearch.image.presentration.PhotoSearch.PhotoViewHolder> implements android.widget.Filterable {
    private java.util.ArrayList<com.flickrSearch.image.models.Photo> itemList;
    private java.util.ArrayList<com.flickrSearch.image.models.Photo> itemListFilter;
    private android.content.Context context;
    private com.flickrSearch.image.presentration.PhotoSearch.PhotoSearchAdapter.PhotoItemListener listener;
    
    public PhotoSearchAdapter() {
        super();
    }
    
    public PhotoSearchAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.flickrSearch.image.models.Photo> items, @org.jetbrains.annotations.NotNull()
    com.flickrSearch.image.presentration.PhotoSearch.PhotoSearchAdapter.PhotoItemListener listener) {
        super();
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.flickrSearch.image.models.Photo> items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.flickrSearch.image.presentration.PhotoSearch.PhotoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.flickrSearch.image.presentration.PhotoSearch.PhotoViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/flickrSearch/image/presentration/PhotoSearch/PhotoSearchAdapter$PhotoItemListener;", "", "onClickedPhotos", "", "photo", "", "app_debug"})
    public static abstract interface PhotoItemListener {
        
        public abstract void onClickedPhotos(@org.jetbrains.annotations.NotNull()
        java.lang.String photo);
    }
}