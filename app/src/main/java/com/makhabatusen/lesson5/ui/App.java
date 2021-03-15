package com.makhabatusen.lesson5.ui;

import android.app.Application;

import androidx.room.Room;

import com.makhabatusen.lesson5.data.MockData;
import com.makhabatusen.lesson5.data.frameworks.room.AppDataBase;
import com.makhabatusen.lesson5.data.frameworks.room.RoomSource;
import com.makhabatusen.lesson5.data.repo.StudentRepository;

public class App extends Application {
    public static StudentRepository studentRepository;
    public static AppDataBase roomDB;

    @Override
    public void onCreate() {
        super.onCreate();
        studentRepository =  new StudentRepository(new RoomSource());

        roomDB = Room.databaseBuilder(
                this,
                AppDataBase.class,
                "app _database"
        )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
    }
}
