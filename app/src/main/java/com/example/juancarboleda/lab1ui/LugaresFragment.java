package com.example.juancarboleda.lab1ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.app.ListActivity;
import android.view.Menu;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.ref.SoftReference;
import java.util.ArrayList;




/**
 * A simple {@link Fragment} subclass.
 */
public class LugaresFragment extends Fragment {

	/*private DbAdapter dbAdapter;
    private Cursor cursor;
    private CursorAdapter lugaresAdapter ;
    private ListView lista;*/

    ListView lv;
    ArrayList<String> lista;
    ArrayAdapter adaptador;

    public LugaresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lugares, container, false);

    }

   

}
