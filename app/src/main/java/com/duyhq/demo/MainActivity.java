package com.duyhq.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList.add(new Student(123, "Anna"));
        studentList.add(new Student(124, "Bob"));

        StudentsAdapter studentsAdapter = new StudentsAdapter(studentList);

        RecyclerView recyclerView = findViewById(R.id.recyler_view);

        recyclerView.setAdapter(studentsAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

//    public void showSnackBar(View view){
//        Snackbar sb = Snackbar.make(view, "Hello", Snackbar.LENGTH_SHORT);
//
//        sb.show();
//    }
}