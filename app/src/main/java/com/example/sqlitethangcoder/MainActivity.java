package com.example.sqlitethangcoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.sqlitethangcoder.data.DBManager;
import com.example.sqlitethangcoder.model.Student;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtNumber;
    private EditText edtAddress;
    private EditText edtEmail;
    private Button btnSave;
    private ListView lvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        final DBManager dbManager = new DBManager(this);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Student student = createStudent();
//                if(student != null){
//                    Log.e("I", dbManager.addStudent(student)+"");
//                }else {
//                    Log.e("I", "NULL");
//                }

                Log.e("I", dbManager.addStudent(new Student("123","123","32","3123","ewqew"))+"");
            }
        });
    }

    private Student createStudent() {
        String name = edtName.getText().toString();
        String phone = edtNumber.getText().toString();
        String address = edtAddress.getText().toString();
        String email = edtEmail.getText().toString();
        Student student = new Student(name,phone,address,email);
        return student;
    }

    private void AnhXa() {
        edtName = (EditText) findViewById(R.id.edtName);
        edtNumber = (EditText) findViewById(R.id.edtNumber);
        edtAddress = (EditText) findViewById(R.id.edtAddress);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        btnSave = (Button) findViewById(R.id.btnSave);
        lvView = (ListView) findViewById(R.id.lvView);

    }
}
