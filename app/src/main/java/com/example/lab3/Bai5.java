package com.example.lab3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class Bai5 extends AppCompatActivity {
    Spinner spinner;
    ArrayList<Language> languages = new ArrayList<>();
    CusAdapterSpinnerLanguage adapterLVLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);
        spinner = (Spinner) findViewById(R.id.spinner);
        //---------------------------------------------
        initData();

        adapterLVLanguage = new CusAdapterSpinnerLanguage(this, R.layout.layout_item_language, languages);
        spinner.setAdapter(adapterLVLanguage);

    }
    void initData(){
        Language language = new Language(R.drawable.csap_icon, "C# language");
        languages.add(language);
        language = new Language(R.drawable.html, "HTML language");
        languages.add(language);
        language = new Language(R.drawable.php, "PHP language");
        languages.add(language);
        language = new Language(R.drawable.xml, "XML language");
        languages.add(language);
    }
}