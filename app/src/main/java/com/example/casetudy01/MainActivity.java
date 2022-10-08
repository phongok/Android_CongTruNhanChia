package com.example.casetudy01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText_hsa = findViewById(R.id.et_hsa);
        EditText editText_hsb = findViewById(R.id.et_hsb);

        Button button_Tong = findViewById(R.id.btn_Tong);
        Button button_Hieu = findViewById(R.id.btn_Hieu);
        Button button_Tich = findViewById(R.id.btn_Tich);
        Button button_Thuong = findViewById(R.id.btn_Thuong);

        TextView textView_KQ = findViewById(R.id.tv_KQ);

        button_Tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editText_hsa.getText().toString());
                int b = Integer.parseInt(editText_hsb.getText().toString());
                int c = a + b;
                textView_KQ.setText("Tổng là: "+c);

            }
        });

        button_Hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editText_hsa.getText().toString());
                int b = Integer.parseInt(editText_hsb.getText().toString());
                int c = a - b;
                textView_KQ.setText("Hiệu là: "+c);

            }
        });

        button_Tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editText_hsa.getText().toString());
                int b = Integer.parseInt(editText_hsb.getText().toString());
                int c = a * b;
                textView_KQ.setText("Tích là: "+c);

            }
        });

        button_Thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editText_hsa.getText().toString());
                int b = Integer.parseInt(editText_hsb.getText().toString());
                int c = a / b;
                textView_KQ.setText("Thương` là: "+c);

            }
        });

    }
}