package com.proyectosruben.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.widget.Toast;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by User on 05/06/2017.
 */

public class Base extends SQLiteAssetHelper{
    private static final String DATABASE_NAME = "control_vehiculos.db";
    private static final int DATABASE_VERSION = 1;
    public SQLiteDatabase db;
    public Context context;

    public Base(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context=context;
        try {
            db=getWritableDatabase();
            Toast.makeText(this.context,"Entraste",Toast.LENGTH_LONG).show();

        }
        catch (SQLiteException ex){

            Toast.makeText(this.context,ex.getMessage(),Toast.LENGTH_LONG).show();
        }
    }
}
