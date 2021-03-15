package com.makhabatusen.lesson5.data.model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity  (tableName = "courses")
public class Course {
    @PrimaryKey
    private int id;
    private String name;
    @ColumnInfo(name = "students_number")
    private int studentsNum;

    public Course(int id, String name, int studentsNum) {
        this.id = id;
        this.name = name;
        this.studentsNum = studentsNum;
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

    public int getStudentsNum() {
        return studentsNum;
    }

    public void setStudentsNum(int studentsNum) {
        this.studentsNum = studentsNum;
    }

    @Override
    public String toString() {
        return name + "  ";
    }
}
