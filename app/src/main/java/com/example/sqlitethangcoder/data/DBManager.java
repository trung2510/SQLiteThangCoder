package com.example.sqlitethangcoder.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.sqlitethangcoder.model.Student;

public class DBManager{


    public final String TAG = "a";
    public static final String DATA_NAME = "student_manager";
    public static final String TABLE_NAME = "students";
    public static final int VERSION = 1;
    public static final String ID = "_id";
    public static final String NAME = "name";
    public static final String ADDRESS = "address";
    public static final String PHONE = "phone";
    public static final String EMAIL = "email";
    private SQLiteDatabase sqLiteDatabase;
    private String SQLQuery = "CREATE TABLE IF NOT EXISTS students(_id INTEGER PRIMARY KEY AUTOINCREMENT,name NVARCHAR,address NVARCHAR,phone NVARCHAR,email NVARCHAR)";

    public DBManager(Context context) {
        OpenHelper openHelper=new OpenHelper(context);
       sqLiteDatabase=openHelper.getWritableDatabase();
    }

    public class OpenHelper extends SQLiteOpenHelper {
        public OpenHelper( Context context) {
            super(context, DATA_NAME, null, VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(SQLQuery);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }


    public long addStudent(Student student) {
        ContentValues values = new ContentValues();
        values.put(NAME, student.getmName());
        values.put(ADDRESS, student.getmAddress());
        values.put(PHONE, student.getmNumber());
        values.put(EMAIL, student.getmEmail());

        return sqLiteDatabase.insert(TABLE_NAME, null, values);
    }

}
