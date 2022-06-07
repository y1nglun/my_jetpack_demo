package com.android.my_jetpack_demo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id", typeAffinity = ColumnInfo.INTEGER)
    private int id;

    @ColumnInfo(name = "name", typeAffinity = ColumnInfo.TEXT)
    private String name;

    @ColumnInfo(name = "name", typeAffinity = ColumnInfo.TEXT)
    private String age;

    public User(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Ignore
    public User(int id, String name) {
        this.id = id;
        this.name = name;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
