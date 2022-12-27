package com.training.notesapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.training.notesapp.databinding.ActivityNoteDetailBinding;

public class NoteDetailActivity extends AppCompatActivity {

    private ActivityNoteDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNoteDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}