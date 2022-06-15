package com.flickrSearch.image.data.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.flickrSearch.image.models.Photo;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class PhotoDao_Impl implements PhotoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Photo> __insertionAdapterOfPhoto;

  public PhotoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPhoto = new EntityInsertionAdapter<Photo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `photo` (`id`,`owner`,`secret`,`server`,`farm`,`title`,`ispublic`,`isfriend`,`isfamily`,`datetaken`,`datetakengranularity`,`datetakenunknown`,`urlH`,`heightH`,`widthH`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Photo value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getOwner() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOwner());
        }
        if (value.getSecret() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSecret());
        }
        if (value.getServer() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getServer());
        }
        stmt.bindLong(5, value.getFarm());
        if (value.getTitle() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTitle());
        }
        stmt.bindLong(7, value.getIspublic());
        stmt.bindLong(8, value.getIsfriend());
        stmt.bindLong(9, value.getIsfamily());
        if (value.getDatetaken() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDatetaken());
        }
        stmt.bindLong(11, value.getDatetakengranularity());
        if (value.getDatetakenunknown() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getDatetakenunknown());
        }
        if (value.getUrlH() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getUrlH());
        }
        if (value.getHeightH() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getHeightH());
        }
        if (value.getWidthH() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, value.getWidthH());
        }
      }
    };
  }

  @Override
  public void insertAll(final List<Photo> Photo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPhoto.insert(Photo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final List<Photo> Photo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPhoto.insert(Photo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Photo>> getAllPhotos() {
    final String _sql = "SELECT * FROM photo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"photo"}, false, new Callable<List<Photo>>() {
      @Override
      public List<Photo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOwner = CursorUtil.getColumnIndexOrThrow(_cursor, "owner");
          final int _cursorIndexOfSecret = CursorUtil.getColumnIndexOrThrow(_cursor, "secret");
          final int _cursorIndexOfServer = CursorUtil.getColumnIndexOrThrow(_cursor, "server");
          final int _cursorIndexOfFarm = CursorUtil.getColumnIndexOrThrow(_cursor, "farm");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfIspublic = CursorUtil.getColumnIndexOrThrow(_cursor, "ispublic");
          final int _cursorIndexOfIsfriend = CursorUtil.getColumnIndexOrThrow(_cursor, "isfriend");
          final int _cursorIndexOfIsfamily = CursorUtil.getColumnIndexOrThrow(_cursor, "isfamily");
          final int _cursorIndexOfDatetaken = CursorUtil.getColumnIndexOrThrow(_cursor, "datetaken");
          final int _cursorIndexOfDatetakengranularity = CursorUtil.getColumnIndexOrThrow(_cursor, "datetakengranularity");
          final int _cursorIndexOfDatetakenunknown = CursorUtil.getColumnIndexOrThrow(_cursor, "datetakenunknown");
          final int _cursorIndexOfUrlH = CursorUtil.getColumnIndexOrThrow(_cursor, "urlH");
          final int _cursorIndexOfHeightH = CursorUtil.getColumnIndexOrThrow(_cursor, "heightH");
          final int _cursorIndexOfWidthH = CursorUtil.getColumnIndexOrThrow(_cursor, "widthH");
          final List<Photo> _result = new ArrayList<Photo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Photo _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpOwner;
            if (_cursor.isNull(_cursorIndexOfOwner)) {
              _tmpOwner = null;
            } else {
              _tmpOwner = _cursor.getString(_cursorIndexOfOwner);
            }
            final String _tmpSecret;
            if (_cursor.isNull(_cursorIndexOfSecret)) {
              _tmpSecret = null;
            } else {
              _tmpSecret = _cursor.getString(_cursorIndexOfSecret);
            }
            final String _tmpServer;
            if (_cursor.isNull(_cursorIndexOfServer)) {
              _tmpServer = null;
            } else {
              _tmpServer = _cursor.getString(_cursorIndexOfServer);
            }
            final int _tmpFarm;
            _tmpFarm = _cursor.getInt(_cursorIndexOfFarm);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final int _tmpIspublic;
            _tmpIspublic = _cursor.getInt(_cursorIndexOfIspublic);
            final int _tmpIsfriend;
            _tmpIsfriend = _cursor.getInt(_cursorIndexOfIsfriend);
            final int _tmpIsfamily;
            _tmpIsfamily = _cursor.getInt(_cursorIndexOfIsfamily);
            final String _tmpDatetaken;
            if (_cursor.isNull(_cursorIndexOfDatetaken)) {
              _tmpDatetaken = null;
            } else {
              _tmpDatetaken = _cursor.getString(_cursorIndexOfDatetaken);
            }
            final int _tmpDatetakengranularity;
            _tmpDatetakengranularity = _cursor.getInt(_cursorIndexOfDatetakengranularity);
            final String _tmpDatetakenunknown;
            if (_cursor.isNull(_cursorIndexOfDatetakenunknown)) {
              _tmpDatetakenunknown = null;
            } else {
              _tmpDatetakenunknown = _cursor.getString(_cursorIndexOfDatetakenunknown);
            }
            final String _tmpUrlH;
            if (_cursor.isNull(_cursorIndexOfUrlH)) {
              _tmpUrlH = null;
            } else {
              _tmpUrlH = _cursor.getString(_cursorIndexOfUrlH);
            }
            final Integer _tmpHeightH;
            if (_cursor.isNull(_cursorIndexOfHeightH)) {
              _tmpHeightH = null;
            } else {
              _tmpHeightH = _cursor.getInt(_cursorIndexOfHeightH);
            }
            final Integer _tmpWidthH;
            if (_cursor.isNull(_cursorIndexOfWidthH)) {
              _tmpWidthH = null;
            } else {
              _tmpWidthH = _cursor.getInt(_cursorIndexOfWidthH);
            }
            _item = new Photo(_tmpId,_tmpOwner,_tmpSecret,_tmpServer,_tmpFarm,_tmpTitle,_tmpIspublic,_tmpIsfriend,_tmpIsfamily,_tmpDatetaken,_tmpDatetakengranularity,_tmpDatetakenunknown,_tmpUrlH,_tmpHeightH,_tmpWidthH);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Photo> getPhoto(final String id) {
    final String _sql = "SELECT * FROM photo WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"photo"}, false, new Callable<Photo>() {
      @Override
      public Photo call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOwner = CursorUtil.getColumnIndexOrThrow(_cursor, "owner");
          final int _cursorIndexOfSecret = CursorUtil.getColumnIndexOrThrow(_cursor, "secret");
          final int _cursorIndexOfServer = CursorUtil.getColumnIndexOrThrow(_cursor, "server");
          final int _cursorIndexOfFarm = CursorUtil.getColumnIndexOrThrow(_cursor, "farm");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfIspublic = CursorUtil.getColumnIndexOrThrow(_cursor, "ispublic");
          final int _cursorIndexOfIsfriend = CursorUtil.getColumnIndexOrThrow(_cursor, "isfriend");
          final int _cursorIndexOfIsfamily = CursorUtil.getColumnIndexOrThrow(_cursor, "isfamily");
          final int _cursorIndexOfDatetaken = CursorUtil.getColumnIndexOrThrow(_cursor, "datetaken");
          final int _cursorIndexOfDatetakengranularity = CursorUtil.getColumnIndexOrThrow(_cursor, "datetakengranularity");
          final int _cursorIndexOfDatetakenunknown = CursorUtil.getColumnIndexOrThrow(_cursor, "datetakenunknown");
          final int _cursorIndexOfUrlH = CursorUtil.getColumnIndexOrThrow(_cursor, "urlH");
          final int _cursorIndexOfHeightH = CursorUtil.getColumnIndexOrThrow(_cursor, "heightH");
          final int _cursorIndexOfWidthH = CursorUtil.getColumnIndexOrThrow(_cursor, "widthH");
          final Photo _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpOwner;
            if (_cursor.isNull(_cursorIndexOfOwner)) {
              _tmpOwner = null;
            } else {
              _tmpOwner = _cursor.getString(_cursorIndexOfOwner);
            }
            final String _tmpSecret;
            if (_cursor.isNull(_cursorIndexOfSecret)) {
              _tmpSecret = null;
            } else {
              _tmpSecret = _cursor.getString(_cursorIndexOfSecret);
            }
            final String _tmpServer;
            if (_cursor.isNull(_cursorIndexOfServer)) {
              _tmpServer = null;
            } else {
              _tmpServer = _cursor.getString(_cursorIndexOfServer);
            }
            final int _tmpFarm;
            _tmpFarm = _cursor.getInt(_cursorIndexOfFarm);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final int _tmpIspublic;
            _tmpIspublic = _cursor.getInt(_cursorIndexOfIspublic);
            final int _tmpIsfriend;
            _tmpIsfriend = _cursor.getInt(_cursorIndexOfIsfriend);
            final int _tmpIsfamily;
            _tmpIsfamily = _cursor.getInt(_cursorIndexOfIsfamily);
            final String _tmpDatetaken;
            if (_cursor.isNull(_cursorIndexOfDatetaken)) {
              _tmpDatetaken = null;
            } else {
              _tmpDatetaken = _cursor.getString(_cursorIndexOfDatetaken);
            }
            final int _tmpDatetakengranularity;
            _tmpDatetakengranularity = _cursor.getInt(_cursorIndexOfDatetakengranularity);
            final String _tmpDatetakenunknown;
            if (_cursor.isNull(_cursorIndexOfDatetakenunknown)) {
              _tmpDatetakenunknown = null;
            } else {
              _tmpDatetakenunknown = _cursor.getString(_cursorIndexOfDatetakenunknown);
            }
            final String _tmpUrlH;
            if (_cursor.isNull(_cursorIndexOfUrlH)) {
              _tmpUrlH = null;
            } else {
              _tmpUrlH = _cursor.getString(_cursorIndexOfUrlH);
            }
            final Integer _tmpHeightH;
            if (_cursor.isNull(_cursorIndexOfHeightH)) {
              _tmpHeightH = null;
            } else {
              _tmpHeightH = _cursor.getInt(_cursorIndexOfHeightH);
            }
            final Integer _tmpWidthH;
            if (_cursor.isNull(_cursorIndexOfWidthH)) {
              _tmpWidthH = null;
            } else {
              _tmpWidthH = _cursor.getInt(_cursorIndexOfWidthH);
            }
            _result = new Photo(_tmpId,_tmpOwner,_tmpSecret,_tmpServer,_tmpFarm,_tmpTitle,_tmpIspublic,_tmpIsfriend,_tmpIsfamily,_tmpDatetaken,_tmpDatetakengranularity,_tmpDatetakenunknown,_tmpUrlH,_tmpHeightH,_tmpWidthH);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
