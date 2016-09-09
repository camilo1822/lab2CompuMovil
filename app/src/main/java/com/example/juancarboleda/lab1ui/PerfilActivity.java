package com.example.juancarboleda.lab1ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.content.Intent;


public class PerfilActivity extends AppCompatActivity {

	String name;
	String correo;
	TextView nombreTxt;
	TextView correoTxt;
    ArrayAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
     	nombreTxt = (TextView) findViewById(R.id.txtNombre);
     	correoTxt = (TextView) findViewById(R.id.txtCorreo);
        DBHelper db = new DBHelper(getApplicationContext(),null,null,1);
        name = db.llenar_nm();
        correo = db.llenar_cr();
        nombreTxt.setText(name);
        correoTxt.setText(correo);
    }

     public void volver3(View v){
        Intent ven=new Intent(this,Main2Activity.class);
        startActivity(ven);
    }
}
