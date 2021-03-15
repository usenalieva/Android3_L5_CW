package com.makhabatusen.lesson5.data.frameworks.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.makhabatusen.lesson5.data.model.Course;
import com.makhabatusen.lesson5.data.model.Student;
import com.makhabatusen.lesson5.data.frameworks.room.temp_tables.StudentCourse;

import java.util.List;

@Dao
public interface StudentsDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE )
    void insertStudent(Student student);

    @Delete
    void removeStudent(Student student);

    @Update
    void updateStudent (Student student);

    @Query("SELECT * FROM  students")
    List<Student>  getAllStudents();


    @Insert (onConflict = OnConflictStrategy.REPLACE )
    void insertCourse(Course course);

    @Query("SELECT * FROM students")
    List<StudentCourse> getStudentCourses();

}
