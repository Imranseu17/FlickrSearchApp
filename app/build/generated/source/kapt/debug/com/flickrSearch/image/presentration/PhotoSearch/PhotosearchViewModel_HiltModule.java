package com.flickrSearch.image.presentration.PhotoSearch;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = PhotosearchViewModel.class
)
public interface PhotosearchViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.flickrSearch.image.presentration.PhotoSearch.PhotosearchViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(PhotosearchViewModel_AssistedFactory factory);
}
