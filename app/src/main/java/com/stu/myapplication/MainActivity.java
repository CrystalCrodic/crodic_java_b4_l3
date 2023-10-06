package com.stu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtMSSV, txtName, txtNgaySinh;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMSSV = findViewById(R.id.txtMSSV);
        txtName = findViewById(R.id.txtName);
        txtNgaySinh = findViewById(R.id.txtNgaySinh);
        btnAdd = findViewById(R.id.btnAdd);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SinhVien sv = new SinhVien(Integer.parseInt(txtMSSV.getText().toString()), txtName.getText().toString(), txtNgaySinh.getText().toString());
                Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
                myIntent.putExtra("SinhVien", sv);
                startActivity(myIntent);
            }
        });

    }
}