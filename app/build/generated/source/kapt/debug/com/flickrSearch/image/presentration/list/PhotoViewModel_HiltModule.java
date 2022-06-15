package com.flickrSearch.image.presentration.list;

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
    topLevelClass = PhotoViewModel.class
)
public interface PhotoViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.flickrSearch.image.presentration.list.PhotoViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(PhotoViewModel_AssistedFactory factory);
}
