package com.training.notesapp.model.room;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.training.notesapp.model.Note;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Note.class}, version = 1)
public abstract class NotesDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();

    private static NotesDatabase INSTANCE;
    private final static String DB_NAME = "notes_db";
    public static final ExecutorService databaseWriteExecutor = Executors.newSingleThreadExecutor();
    public static final Handler handler = new Handler(Looper.getMainLooper());

    public static synchronized NotesDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context, NotesDatabase.class, DB_NAME).build();
        }
        return INSTANCE;
    }
}
