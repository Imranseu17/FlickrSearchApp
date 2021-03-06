package com.flickrSearch.image;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.flickrSearch.image.data.local.AppDatabase;
import com.flickrSearch.image.data.local.PhotoDao;
import com.flickrSearch.image.data.remote.PhotoRemoteDataSource;
import com.flickrSearch.image.data.remote.PhotoService;
import com.flickrSearch.image.data.repository.PhotoRepository;
import com.flickrSearch.image.domain.AppModule;
import com.flickrSearch.image.domain.AppModule_ProvideCharacterDaoFactory;
import com.flickrSearch.image.domain.AppModule_ProvideCharacterRemoteDataSourceFactory;
import com.flickrSearch.image.domain.AppModule_ProvideCharacterServiceFactory;
import com.flickrSearch.image.domain.AppModule_ProvideDatabaseFactory;
import com.flickrSearch.image.domain.AppModule_ProvideRepositoryFactory;
import com.flickrSearch.image.domain.AppModule_ProvideRetrofitFactory;
import com.flickrSearch.image.presentration.PhotoSearch.PhotosearchFragment;
import com.flickrSearch.image.presentration.PhotoSearch.PhotosearchViewModel_AssistedFactory;
import com.flickrSearch.image.presentration.PhotoSearch.PhotosearchViewModel_AssistedFactory_Factory;
import com.flickrSearch.image.presentration.activities.MainActivity;
import com.flickrSearch.image.presentration.activities.SplashActivity;
import com.flickrSearch.image.presentration.fullImage.ImageFragment;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerMainApplication_HiltComponents_ApplicationC extends MainApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object photoRemoteDataSource = new MemoizedSentinel();

  private volatile Object appDatabase = new MemoizedSentinel();

  private volatile Object photoDao = new MemoizedSentinel();

  private volatile Object photoRepository = new MemoizedSentinel();

  private volatile Provider<PhotoRepository> provideRepositoryProvider;

  private DaggerMainApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRetrofitFactory.provideRetrofit();
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private PhotoService getPhotoService() {
    return AppModule_ProvideCharacterServiceFactory.provideCharacterService(getRetrofit());
  }

  private PhotoRemoteDataSource getPhotoRemoteDataSource() {
    Object local = photoRemoteDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = photoRemoteDataSource;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideCharacterRemoteDataSourceFactory.provideCharacterRemoteDataSource(getPhotoService());
          photoRemoteDataSource = DoubleCheck.reentrantCheck(photoRemoteDataSource, local);
        }
      }
    }
    return (PhotoRemoteDataSource) local;
  }

  private AppDatabase getAppDatabase() {
    Object local = appDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appDatabase;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          appDatabase = DoubleCheck.reentrantCheck(appDatabase, local);
        }
      }
    }
    return (AppDatabase) local;
  }

  private PhotoDao getPhotoDao() {
    Object local = photoDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = photoDao;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideCharacterDaoFactory.provideCharacterDao(getAppDatabase());
          photoDao = DoubleCheck.reentrantCheck(photoDao, local);
        }
      }
    }
    return (PhotoDao) local;
  }

  private PhotoRepository getPhotoRepository() {
    Object local = photoRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = photoRepository;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRepositoryFactory.provideRepository(getPhotoRemoteDataSource(), getPhotoDao());
          photoRepository = DoubleCheck.reentrantCheck(photoRepository, local);
        }
      }
    }
    return (PhotoRepository) local;
  }

  private Provider<PhotoRepository> getPhotoRepositoryProvider() {
    Object local = provideRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideRepositoryProvider = (Provider<PhotoRepository>) local;
    }
    return (Provider<PhotoRepository>) local;
  }

  @Override
  public void injectMainApplication(MainApplication mainApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MainApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMainApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MainApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MainApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MainApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MainApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MainApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<PhotosearchViewModel_AssistedFactory> photosearchViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private PhotosearchViewModel_AssistedFactory getPhotosearchViewModel_AssistedFactory() {
        return PhotosearchViewModel_AssistedFactory_Factory.newInstance(DaggerMainApplication_HiltComponents_ApplicationC.this.getPhotoRepositoryProvider());
      }

      private Provider<PhotosearchViewModel_AssistedFactory> getPhotosearchViewModel_AssistedFactoryProvider(
          ) {
        Object local = photosearchViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          photosearchViewModel_AssistedFactoryProvider = (Provider<PhotosearchViewModel_AssistedFactory>) local;
        }
        return (Provider<PhotosearchViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("com.flickrSearch.image.presentration.PhotoSearch.PhotosearchViewModel", (Provider) getPhotosearchViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public void injectSplashActivity(SplashActivity splashActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MainApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MainApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectPhotosearchFragment(PhotosearchFragment photosearchFragment) {
        }

        @Override
        public void injectImageFragment(ImageFragment imageFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MainApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MainApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MainApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MainApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MainApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.flickrSearch.image.presentration.PhotoSearch.PhotosearchViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getPhotosearchViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MainApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MainApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.flickrSearch.image.data.repository.PhotoRepository 
        return (T) DaggerMainApplication_HiltComponents_ApplicationC.this.getPhotoRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
