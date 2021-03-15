package com.makhabatusen.lesson5.data;

import com.makhabatusen.lesson5.data.model.Student;
import com.makhabatusen.lesson5.data.source.local.StudentSource;

import java.util.ArrayList;
import java.util.List;

public class MockData implements StudentSource {
    private static final List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        student.setName(student.getName() + "Mock");
        students.add(student );
    }

    @Override
    public List<Student> getStudents() {
        return students ;
    }
}
