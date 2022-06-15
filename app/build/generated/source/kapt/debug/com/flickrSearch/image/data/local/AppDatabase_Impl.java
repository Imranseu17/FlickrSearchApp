package com.flickrSearch.image.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile PhotoDao _photoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `photo` (`id` TEXT NOT NULL, `owner` TEXT NOT NULL, `secret` TEXT NOT NULL, `server` TEXT NOT NULL, `farm` INTEGER NOT NULL, `title` TEXT NOT NULL, `ispublic` INTEGER NOT NULL, `isfriend` INTEGER NOT NULL, `isfamily` INTEGER NOT NULL, `datetaken` TEXT NOT NULL, `datetakengranularity` INTEGER NOT NULL, `datetakenunknown` TEXT NOT NULL, `urlH` TEXT, `heightH` INTEGER, `widthH` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f4d62088c455c5beba3c56ce888c53dd')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `photo`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPhoto = new HashMap<String, TableInfo.Column>(15);
        _columnsPhoto.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("owner", new TableInfo.Column("owner", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("secret", new TableInfo.Column("secret", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("server", new TableInfo.Column("server", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("farm", new TableInfo.Column("farm", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("ispublic", new TableInfo.Column("ispublic", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("isfriend", new TableInfo.Column("isfriend", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("isfamily", new TableInfo.Column("isfamily", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("datetaken", new TableInfo.Column("datetaken", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("datetakengranularity", new TableInfo.Column("datetakengranularity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("datetakenunknown", new TableInfo.Column("datetakenunknown", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("urlH", new TableInfo.Column("urlH", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("heightH", new TableInfo.Column("heightH", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoto.put("widthH", new TableInfo.Column("widthH", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPhoto = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPhoto = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPhoto = new TableInfo("photo", _columnsPhoto, _foreignKeysPhoto, _indicesPhoto);
        final TableInfo _existingPhoto = TableInfo.read(_db, "photo");
        if (! _infoPhoto.equals(_existingPhoto)) {
          return new RoomOpenHelper.ValidationResult(false, "photo(com.flickrSearch.image.models.Photo).\n"
                  + " Expected:\n" + _infoPhoto + "\n"
                  + " Found:\n" + _existingPhoto);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f4d62088c455c5beba3c56ce888c53dd", "882bb9758bb7ba8c758f76f6b48eab6c");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "photo");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `photo`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(PhotoDao.class, PhotoDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public PhotoDao PhotoDao() {
    if (_photoDao != null) {
      return _photoDao;
    } else {
      synchronized(this) {
        if(_photoDao == null) {
          _photoDao = new PhotoDao_Impl(this);
        }
        return _photoDao;
      }
    }
  }
}
