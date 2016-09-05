package com.example.juancarboleda.lab1ui;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper  extends SQLiteOpenHelper{
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("create table usuarios(codigo integer primary key,email text,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values(01,'admin@admin.co','admin','admin')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("create table usuarios(codigo integer primary key,email text,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values(01,'admin@admin.co','admin','admin')");
    }
}
