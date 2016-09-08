package com.example.juancarboleda.lab1ui;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class IngresarActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
        et1= (EditText) findViewById(R.id.etid);
        et2= (EditText) findViewById(R.id.etnombre);
        et3= (EditText) findViewById(R.id.etdescri);
        et4= (EditText) findViewById(R.id.ettemp);
        et5= (EditText) findViewById(R.id.etsitios);
    }

    public void ingreso(View view){

        DBHelper admin=new DBHelper(this,"instituto",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String codigo=et1.getText().toString();
        String nombre=et2.getText().toString();
        String descripcion=et3.getText().toString();
        String temperatura=et4.getText().toString();
        String sitios=et5.getText().toString();

        ContentValues values=new ContentValues();
        values.put("codigo",codigo);
        values.put("nombre",nombre);
        values.put("descripcion",descripcion);
        values.put("temperatura",temperatura);
        values.put("sitios",sitios);

        db.insert("lugares",null,values);
        db.close();

        Intent ven=new Intent(this,MainActivity.class);
        startActivity(ven);

    }

    public void cancelar(View view){
        finish();

    }
}
