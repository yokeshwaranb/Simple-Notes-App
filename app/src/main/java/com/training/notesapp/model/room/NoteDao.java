package com.training.notesapp.model.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.training.notesapp.model.Note;

import java.util.List;

@Dao
public interface NoteDao {
    @Query("SELECT * FROM Notes")
    List<Note> getAllNotes();

    @Query("SELECT * FROM Notes WHERE id = :noteId")
    List<Note> getNoteById(String noteId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insetOrUpdateNote(Note note);
}
