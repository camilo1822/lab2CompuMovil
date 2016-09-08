package com.example.juancarboleda.lab1ui;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import android.database.Cursor;


public class DBHelper  extends SQLiteOpenHelper{
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "Primera", factory, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("create table usuarios(codigo integer primary key,email text,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values(01,'admin@admin.co','admin','admin')");
    db.execSQL("create table lugares(codigo integer primary key,nombre text,descripcion text,temperatura text,sitios text)");
        db.execSQL("insert into lugares values(01,'udea','Universidad publica','caliente','ninguno')");
        db.execSQL("insert into lugares values(02,'nacho','Universidad publica','tibia','ninguno')");
        db.execSQL("insert into lugares values(03,'Parque Berrio','Parque publico','fria','Iglesia')");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("create table usuarios(codigo integer primary key,email text,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values(01,'admin@admin.co','admin','admin')");
        db.execSQL("create table lugares(codigo integer primary key,nombre text,descripcion text,temperatura text,sitios text)");
        db.execSQL("insert into lugares values(01,'udea','Universidad publica','caliente','ninguno')");
        db.execSQL("insert into lugares values(02,'nacho','Universidad publica','tibia','ninguno')");
        db.execSQL("insert into lugares values(03,'Parque Berrio','Parque publico','fria','Iglesia')");
    }

     public ArrayList llenar_lv(){
        ArrayList<String> lista = new ArrayList<>();
        SQLiteDatabase database = this.getWritableDatabase();
        String q = "SELECT * FROM lugares";
        Cursor registros = database.rawQuery(q,null);
        if(registros.moveToFirst()){
            do{
                lista.add(registros.getString(1));
            }while(registros.moveToNext());
        }
        return lista;

    }
}
