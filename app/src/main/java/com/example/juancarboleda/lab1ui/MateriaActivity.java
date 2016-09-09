package com.example.juancarboleda.lab1ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MateriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materia);
    }

    public void volver2(View v){
        Intent ven=new Intent(this,Main2Activity.class);
        startActivity(ven);
    }
}
