package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Bai4 extends AppCompatActivity {
    GridView gv;
    ArrayList<NationalFlag> data = new ArrayList<>();
    CusAdapterNationalFlag adapterNationalFlag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        gv = (GridView) findViewById(R.id.gv);
        gv.setNumColumns(2);
        //-------------------------------------

        initData();
        adapterNationalFlag = new CusAdapterNationalFlag(this, R.layout.layout_item_flag_code_zip_national, data);
        gv.setAdapter(adapterNationalFlag);
    }
    void initData(){
        NationalFlag nationalFlag = new NationalFlag(R.drawable.vietnam_icon, 9482193, "Viet Nam");
        data.add(nationalFlag);
        nationalFlag = new NationalFlag(R.drawable.french_icon, 6253521, "French");
        data.add(nationalFlag);
        nationalFlag = new NationalFlag(R.drawable.italy_icon, 13145325, "Italy");
        data.add(nationalFlag);
        nationalFlag = new NationalFlag(R.drawable.laos_icon, 876868, "Laos");
        data.add(nationalFlag);
    }
    //hello
}