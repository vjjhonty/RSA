package com.example.jhonty.rsaproject;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jhonty on 07-Jul-16.
 */
public class Database extends SQLiteOpenHelper {

    public  Database(Context context, String name, SQLiteDatabase.CursorFactory factory,int version)
    {
        super(context, name, factory, version);
    }

    public  Database(Context context, String name, SQLiteDatabase.CursorFactory factory,int version,DatabaseErrorHandler errorHandler)
    {
        super(context, name,factory,version,errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table reg(ID integer Primary Key AUTOINCREMENT, Name varchar(70),Address varchar(100),Email varchar(100),Phone int,Password varchar(20))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
