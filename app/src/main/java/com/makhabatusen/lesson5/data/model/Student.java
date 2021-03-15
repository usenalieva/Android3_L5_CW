package com.makhabatusen.lesson5.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "students")
public class Student {
    @PrimaryKey (autoGenerate = true)
    private int id;
    private String name;
    private  int age;
    @ColumnInfo(name = "course_id")
    private int courseId;

    public Student(int id, String name, int age, int courseId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " ";
    }
}
