package com.example.hallgato.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Franciska Cseleszki
 */

public class DBHandler {

    public final static String DB_NAME="MY_DB";
    public final static int DB_VERSION=1;
    public final static String TABLE_USERS="users";


    protected DBHelper dbHelper;

    public DBHandler(Context context){
        dbHelper=new DBHelper(context);
    }

    public void addUser(String name){
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("name",name);
        db.insert(TABLE_USERS,null,values);
        db.close();
    }



    public class DBHelper extends SQLiteOpenHelper{

        public DBHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE "+TABLE_USERS+" (" +
                    "_id    	INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name   	VARCHAR(250)" +
					          "password	VARCHAR(250)" +
                    ")");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            db.execSQL("DROP TABLE IF EXISTS "+TABLE_USERS);
            onCreate(db);
        }
    }

}
