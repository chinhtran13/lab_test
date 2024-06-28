package com.example.lab3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CusAdapterSpinnerLanguage extends BaseAdapter {
    LayoutInflater inflater;
    int layoutItem;
    ArrayList<Language> dataSpinner = new ArrayList<>();

    public CusAdapterSpinnerLanguage(Activity context, int layoutItem, ArrayList<Language> dataSpinner) {
        this.inflater = context.getLayoutInflater();
        this.layoutItem = layoutItem;
        this.dataSpinner = dataSpinner;
    }

    @Override
    public int getCount() {
        return dataSpinner.size();
    }

    @Override
    public Object getItem(int i) {
        return dataSpinner.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Language language = dataSpinner.get(i);
        View viewItem = inflater.inflate(layoutItem, null, true);

        ImageView anh = (ImageView) viewItem.findViewById(R.id.imgIcon);
        TextView ten = (TextView) viewItem.findViewById(R.id.tvTen);
        anh.setImageResource(language.getImgIcon());
        ten.setText(language.getTvTen());

        return viewItem;
    }
}
