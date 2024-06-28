package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class Bai1 extends AppCompatActivity {
    Spinner spinner;
    ArrayList<String> dataSpinner = new ArrayList<>();
    ArrayAdapter<String> adapter;
    String [] data = {"Toan", "Hoa", "Ly", "van"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        spinner = (Spinner) findViewById(R.id.spinner);
        //---------------------------------------------
        dataSpinner.addAll(Arrays.asList(data));
        adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, dataSpinner);
        spinner.setAdapter(adapter);
    }
}