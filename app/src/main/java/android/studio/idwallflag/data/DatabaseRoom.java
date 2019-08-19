package android.studio.idwallflag.data;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;
import android.studio.idwallflag.models.CategoryResponse;

import java.net.PortUnreachableException;

/*
@android.arch.persistence.room.Database(entities = {CategoryResponse.class}, version = 1, exportSchema = false)
@TypeConverters({Converters.class})

public abstract class DatabaseRoom extends RoomDatabase {

    public abstract CategoryResponseDao categoryResponseDao();

    private static volatile DatabaseRoom INSTANCE;

    public static DatabaseRoom getDatabaseRoom(final Context context){
        if (INSTANCE == null){
            synchronized (DatabaseRoom.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            DatabaseRoom.class,
                            "sqlite_room_db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }



}

*/
