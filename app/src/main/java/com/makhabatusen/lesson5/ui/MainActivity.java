package com.makhabatusen.lesson5.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.makhabatusen.lesson5.R;
import com.makhabatusen.lesson5.data.model.Course;
import com.makhabatusen.lesson5.data.model.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student student1 = new Student(1, "Student 1", 20, 3);
        Course course1 = new Course(3,"Android 3", 20);
        Student student2 = new Student(2, "Student 2", 20, 4);
        Course course2 = new Course(4,"Python", 25);


        App.studentRepository.addStudent(student1);
        App.studentRepository.addStudent(student2);
        log(App.studentRepository.getStudents().toString());

    }

    private void log(String msg) {
        Log.e("TAG", msg);
    }
}