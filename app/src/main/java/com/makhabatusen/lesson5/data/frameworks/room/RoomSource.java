package com.makhabatusen.lesson5.data.frameworks.room;

import com.makhabatusen.lesson5.data.model.Student;
import com.makhabatusen.lesson5.data.source.local.StudentSource;
import com.makhabatusen.lesson5.ui.App;

import java.util.List;

public class  RoomSource  implements StudentSource {
    @Override
    public void addStudent(Student student) {
        App.roomDB.studentsDao().insertStudent(student);
    }

    @Override
    public List<Student> getStudents() {
        return App.roomDB.studentsDao().getAllStudents();
    }
}
