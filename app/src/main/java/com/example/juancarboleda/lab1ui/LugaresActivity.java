package com.example.juancarboleda.lab1ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LugaresActivity extends AppCompatActivity {

	ListView lv;
    ArrayList<String> lista;
    ArrayAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);
        lv = (ListView) findViewById(R.id.lista);
        DBHelper db = new DBHelper(getApplicationContext(),null,null,1);
        lista = db.llenar_lv();
        adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1,lista);
        lv.setAdapter(adaptador);
    }

    public void registro2(View v){
        Intent ven=new Intent(this,IngresarActivity.class);
        startActivity(ven);
    }
}
