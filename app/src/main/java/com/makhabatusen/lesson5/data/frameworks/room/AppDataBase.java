package com.makhabatusen.lesson5.data.frameworks.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.makhabatusen.lesson5.data.frameworks.room.dao.StudentsDao;
import com.makhabatusen.lesson5.data.model.Course;
import com.makhabatusen.lesson5.data.model.Student;

@Database(entities = {Student.class, Course.class }, version = 5)

public abstract class AppDataBase  extends RoomDatabase {
   public abstract StudentsDao studentsDao();
}
