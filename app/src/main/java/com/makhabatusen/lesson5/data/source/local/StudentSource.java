package com.makhabatusen.lesson5.data.source.local;

import com.makhabatusen.lesson5.data.model.Student;

import java.util.List;

public interface StudentSource {
    void addStudent(Student student);
    List<Student> getStudents();
}
