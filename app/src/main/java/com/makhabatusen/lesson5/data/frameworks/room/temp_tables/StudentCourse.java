package com.makhabatusen.lesson5.data.frameworks.room.temp_tables;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.makhabatusen.lesson5.data.model.Course;
import com.makhabatusen.lesson5.data.model.Student;

import java.util.List;

public class StudentCourse {

    @Embedded
    public Student student;

    @Relation(entityColumn = "id", parentColumn = "course_id")
    public List<Course> courses;


    @Override
    public String  toString() {
        return "StudentCourse{" +
                "student=" + student +
                ", courses=" + courses +
                '}';
    }
}
