package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBai1, btnBai2, btnBai3, btnBai4, btnBai5, btnBai6, btnBai7, btnBai8, btnBai9, btnBai10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }
    void addControls() {
        btnBai1 = (Button) findViewById(R.id.btnBai1);
        btnBai2 = (Button) findViewById(R.id.btnBai2);
        btnBai3 = (Button) findViewById(R.id.btnBai3);
        btnBai4 = (Button) findViewById(R.id.btnBai4);
        btnBai5 = (Button) findViewById(R.id.btnBai5);
        btnBai6 = (Button) findViewById(R.id.btnBai6);
        btnBai7 = (Button) findViewById(R.id.btnBai7);
        btnBai8 = (Button) findViewById(R.id.btnBai8);
        btnBai9 = (Button) findViewById(R.id.btnBai9);
        btnBai10 = (Button) findViewById(R.id.btnBai10);
    }
    void addEvents() {
        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai1.class);
                startActivity(intent);
            }
        });
        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai2.class);
                startActivity(intent);
            }
        });
        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai3.class);
                startActivity(intent);
            }
        });
        btnBai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai4.class);
                startActivity(intent);
            }
        });
        btnBai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai5.class);
                startActivity(intent);
            }
        });
        btnBai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai6.class);
                startActivity(intent);
            }
        });
//        btnBai2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, Bai2.class);
//                startActivity(intent);
//            }
//        });
        btnBai8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai8.class);
                startActivity(intent);
            }
        });
//        btnBai4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, Bai4.class);
//                startActivity(intent);
//            }
//        });
//        btnBai5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, Bai5.class);
//                startActivity(intent);
//            }
//        });
    }
}