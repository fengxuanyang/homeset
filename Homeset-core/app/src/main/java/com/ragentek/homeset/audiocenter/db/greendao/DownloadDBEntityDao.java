package com.ragentek.homeset.audiocenter.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DOWNLOAD_DBENTITY".
*/
public class DownloadDBEntityDao extends AbstractDao<DownloadDBEntity, Long> {

    public static final String TABLENAME = "DOWNLOAD_DBENTITY";

    /**
     * Properties of entity DownloadDBEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ToolSize = new Property(1, Long.class, "toolSize", false, "TOOL_SIZE");
        public final static Property CompletedSize = new Property(2, Long.class, "completedSize", false, "COMPLETED_SIZE");
        public final static Property Url = new Property(3, String.class, "url", false, "URL");
        public final static Property SaveDirPath = new Property(4, String.class, "saveDirPath", false, "SAVE_DIR_PATH");
        public final static Property FileName = new Property(5, String.class, "fileName", false, "FILE_NAME");
        public final static Property Type = new Property(6, String.class, "type", false, "TYPE");
        public final static Property DownloadStatus = new Property(7, int.class, "downloadStatus", false, "DOWNLOAD_STATUS");
    }


    public DownloadDBEntityDao(DaoConfig config) {
        super(config);
    }
    
    public DownloadDBEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DOWNLOAD_DBENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TOOL_SIZE\" INTEGER," + // 1: toolSize
                "\"COMPLETED_SIZE\" INTEGER," + // 2: completedSize
                "\"URL\" TEXT NOT NULL ," + // 3: url
                "\"SAVE_DIR_PATH\" TEXT," + // 4: saveDirPath
                "\"FILE_NAME\" TEXT," + // 5: fileName
                "\"TYPE\" TEXT," + // 6: type
                "\"DOWNLOAD_STATUS\" INTEGER NOT NULL );"); // 7: downloadStatus
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DOWNLOAD_DBENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DownloadDBEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long toolSize = entity.getToolSize();
        if (toolSize != null) {
            stmt.bindLong(2, toolSize);
        }
 
        Long completedSize = entity.getCompletedSize();
        if (completedSize != null) {
            stmt.bindLong(3, completedSize);
        }
        stmt.bindString(4, entity.getUrl());
 
        String saveDirPath = entity.getSaveDirPath();
        if (saveDirPath != null) {
            stmt.bindString(5, saveDirPath);
        }
 
        String fileName = entity.getFileName();
        if (fileName != null) {
            stmt.bindString(6, fileName);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(7, type);
        }
        stmt.bindLong(8, entity.getDownloadStatus());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DownloadDBEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long toolSize = entity.getToolSize();
        if (toolSize != null) {
            stmt.bindLong(2, toolSize);
        }
 
        Long completedSize = entity.getCompletedSize();
        if (completedSize != null) {
            stmt.bindLong(3, completedSize);
        }
        stmt.bindString(4, entity.getUrl());
 
        String saveDirPath = entity.getSaveDirPath();
        if (saveDirPath != null) {
            stmt.bindString(5, saveDirPath);
        }
 
        String fileName = entity.getFileName();
        if (fileName != null) {
            stmt.bindString(6, fileName);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(7, type);
        }
        stmt.bindLong(8, entity.getDownloadStatus());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public DownloadDBEntity readEntity(Cursor cursor, int offset) {
        DownloadDBEntity entity = new DownloadDBEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // toolSize
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // completedSize
            cursor.getString(offset + 3), // url
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // saveDirPath
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // fileName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // type
            cursor.getInt(offset + 7) // downloadStatus
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DownloadDBEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setToolSize(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setCompletedSize(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setUrl(cursor.getString(offset + 3));
        entity.setSaveDirPath(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFileName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setType(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDownloadStatus(cursor.getInt(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DownloadDBEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DownloadDBEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DownloadDBEntity entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}