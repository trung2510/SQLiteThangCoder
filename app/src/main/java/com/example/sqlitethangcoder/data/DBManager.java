package com.example.sqlitethangcoder.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.sqlitethangcoder.model.Student;

public class DBManager extends SQLiteOpenHelper {

    public static final String DATA_NAME = "student_manager";
    public static final String TABLE_NAME = "students";
    public static final int VERSION = 1;
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String ADDRESS = "address";
    public static final String PHONE = "phone";
    public static final String EMAIL = "email";
    private String SQLQuery = "CREATE TABLE " + TABLE_NAME + "(" +
            ID + " INTERGER PRIMARY KEY, " +
            NAME + " TEXT " +
            ADDRESS + " TEXT " +
            PHONE + " TEXT " +
            EMAIL + " TEXT)";

    public DBManager(Context context) {
        super(context, DATA_NAME, null, VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
           db.execSQL(SQLQuery);
    }

    public void addStudent(Student student){
        SQLiteDatabase sqLiteDatabase =this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ID,student.getmId());
        values.put(NAME,student.getmName());
        values.put(ADDRESS,student.getmAddress());
        values.put(PHONE,student.getmNumber());
        values.put(EMAIL,student.getmEmail());
        sqLiteDatabase.insert(TABLE_NAME,null,values);
        sqLiteDatabase.close();
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
