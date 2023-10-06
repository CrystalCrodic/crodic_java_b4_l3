package com.stu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity2 extends AppCompatActivity {

    TextView tw1, tw2, tw3;

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tw1 = findViewById(R.id.twMSSV);
        tw2 = findViewById(R.id.twName);
        tw3 = findViewById(R.id.twNgaySinh);
        btnBack = findViewById(R.id.btnBack);

        Intent myIntent = getIntent();
        SinhVien sv = (SinhVien) myIntent.getSerializableExtra("SinhVien");
        tw1.setText("MSVV: "+String.valueOf(sv.getMSSV()));
        tw2.setText("Họ Tên: " + sv.getHoTen());
        tw3.setText("Ngày Sinh: "+ sv.getNgaySinh());

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}