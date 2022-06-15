package com.flickrSearch.image.presentration.PhotoSearch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\u001a\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010(\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006*"}, d2 = {"Lcom/flickrSearch/image/presentration/PhotoSearch/PhotosearchFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/flickrSearch/image/presentration/PhotoSearch/PhotoSearchAdapter$PhotoItemListener;", "()V", "adapter", "Lcom/flickrSearch/image/presentration/PhotoSearch/PhotoSearchAdapter;", "<set-?>", "Lcom/flickrSearch/image/databinding/PhotoSearchFragmentBinding;", "binding", "getBinding", "()Lcom/flickrSearch/image/databinding/PhotoSearchFragmentBinding;", "setBinding", "(Lcom/flickrSearch/image/databinding/PhotoSearchFragmentBinding;)V", "binding$delegate", "Lcom/flickrSearch/image/usecase/AutoClearedValue;", "list", "Ljava/util/ArrayList;", "Lcom/flickrSearch/image/models/Photo;", "viewModel", "Lcom/flickrSearch/image/presentration/PhotoSearch/PhotosearchViewModel;", "getViewModel", "()Lcom/flickrSearch/image/presentration/PhotoSearch/PhotosearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onClickedPhotos", "", "photo", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onViewCreated", "view", "setupObservers", "setupRecyclerView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PhotosearchFragment extends androidx.fragment.app.Fragment implements com.flickrSearch.image.presentration.PhotoSearch.PhotoSearchAdapter.PhotoItemListener {
    private final com.flickrSearch.image.usecase.AutoClearedValue binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.flickrSearch.image.presentration.PhotoSearch.PhotoSearchAdapter adapter;
    private java.util.ArrayList<com.flickrSearch.image.models.Photo> list;
    private java.util.HashMap _$_findViewCache;
    
    public PhotosearchFragment() {
        super();
    }
    
    private final com.flickrSearch.image.databinding.PhotoSearchFragmentBinding getBinding() {
        return null;
    }
    
    private final void setBinding(com.flickrSearch.image.databinding.PhotoSearchFragmentBinding p0) {
    }
    
    private final com.flickrSearch.image.presentration.PhotoSearch.PhotosearchViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupObservers() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onClickedPhotos(@org.jetbrains.annotations.NotNull()
    java.lang.String photo) {
    }
}