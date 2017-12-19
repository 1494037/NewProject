package com.example.b10705.newproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DBHelper2 extends SQLiteOpenHelper {

    final static String TAG = "GBHouse";

    public DBHelper2(Context context) {
        super(context, UserContract2.DB_NAME, null, UserContract2.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(TAG, getClass().getName() + ".onCreate()");
        db.execSQL(UserContract2.Users.CREATE_TABLE2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        Log.i(TAG, getClass().getName() + ".onUpgrade()");
        db.execSQL(UserContract2.Users.DELETE_TABLE2);
        onCreate(db);
    }

    public long insertUserByMethod(String name, String add) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(stores.store.KEY_NAMES, name);
        values.put(stores.store.KEY_ADD, add);
        return db.insert(stores.store.TABLE_NAMES, null, values);
    }

    public long insertUserByMethod2(String menu_name, String menu_price, String img, String menu_explanation) {     //picture 스트링 말고
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(UserContract2.Users.KEY_MENU_NAME, menu_name);
        values.put(UserContract2.Users.KEY_MENU_PRICE, menu_price);
        values.put(UserContract2.Users.KEY_PICTURE, img);
        values.put(UserContract2.Users.KEY_MENU_EXPLANATION, menu_explanation);

        return db.insert(UserContract2.Users.TABLE_NAME2, null, values);
    }

    public Cursor getAllUsersBySQL() {
        String sql = "Select * FROM " + UserContract2.Users.TABLE_NAME2;
        return getReadableDatabase().rawQuery(sql, null);
    }

    public Cursor getAllUsersByMethod() {
        SQLiteDatabase db = getReadableDatabase();
        return db.query(UserContract2.Users.TABLE_NAME2, null, null, null, null, null, null);
    }


}