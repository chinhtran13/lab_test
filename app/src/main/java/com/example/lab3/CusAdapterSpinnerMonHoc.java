package com.example.lab3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.view.menu.MenuView;

import java.util.ArrayList;
import java.util.Iterator;

public class CusAdapterSpinnerMonHoc extends BaseAdapter {
    LayoutInflater inflater;
    int layoutItem;
    ArrayList<MonHoc> dataMonHoc = new ArrayList<>();

    public CusAdapterSpinnerMonHoc(Activity context, int layoutItem, ArrayList<MonHoc> dataMonHoc) {
        this.inflater = context.getLayoutInflater();
        this.layoutItem = layoutItem;
        this.dataMonHoc = dataMonHoc;
    }

    @Override
    public int getCount() {
        return dataMonHoc.size();
    }

    @Override
    public Object getItem(int i) {
        return dataMonHoc.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MonHoc monHoc = dataMonHoc.get(i);
        View itemView = inflater.inflate(layoutItem, null, true);

        ImageView imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
        imgIcon.setImageResource(monHoc.getImgIcon());

        TextView tvTen = (TextView) itemView.findViewById(R.id.tvTen);
        tvTen.setText(monHoc.getTenMonHoc());
        return itemView;
    }
}


