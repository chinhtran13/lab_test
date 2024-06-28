package com.example.lab3;

import static com.example.lab3.R.drawable.literature_icon;
import static com.example.lab3.R.drawable.math_mathmematics_icon;
import static com.example.lab3.R.drawable.physics_presentation_teacher_icon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Bai2 extends AppCompatActivity {
    Spinner spinner;
    ArrayList<MonHoc> dataSpinner = new ArrayList<>();
    CusAdapterSpinnerMonHoc adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        spinner = (Spinner) findViewById(R.id.spinner);
        //---------------------------------------------
        initData();
        adapter = new CusAdapterSpinnerMonHoc(this, R.layout.layout_item_spinner_mon_hoc, dataSpinner);
        spinner.setAdapter(adapter);

        addEvents();
    }
    void addEvents(){
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), dataSpinner.get(i).getTenMonHoc(), Toast.LENGTH_SHORT);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    void initData(){
        MonHoc monHoc = new MonHoc(math_mathmematics_icon, "Toan");
        dataSpinner.add(monHoc);

        monHoc = new MonHoc(literature_icon, "Van");
        dataSpinner.add(monHoc);

        monHoc = new MonHoc(physics_presentation_teacher_icon, "Ly");
        dataSpinner.add(monHoc);
    }
}