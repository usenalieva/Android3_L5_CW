package com.makhabatusen.lesson5.data.repo;

import com.makhabatusen.lesson5.data.model.Student;
import com.makhabatusen.lesson5.data.source.local.StudentSource;

import java.util.List;

public class StudentRepository {
    private StudentSource studentSource;

    public StudentRepository(StudentSource studentSource) {
        this.studentSource = studentSource;
    }

    public void addStudent(Student student) {
        studentSource.addStudent(student );
    }

    public List<Student> getStudents(){
        return studentSource.getStudents();
    }
}
