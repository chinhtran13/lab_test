package com.example.lab3;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CusAdapterNationalFlag extends BaseAdapter {
    ArrayList<NationalFlag> data = new ArrayList<>();
    LayoutInflater inflater;
    int layoutItem;
    Context context;
    public CusAdapterNationalFlag(Context context, int layoutItem, ArrayList<NationalFlag> data) {
        this.context = context;
        this.layoutItem = layoutItem;
        this.data = data;
        this.inflater = LayoutInflater.from(context); // Sử dụng context để lấy LayoutInflater
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        NationalFlag nationalFlag = data.get(i);
        View itemView = convertView;

        ViewHolder holder;
        if (itemView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(layoutItem, viewGroup, false);

            holder = new ViewHolder();
            holder.imgIcon = itemView.findViewById(R.id.imgIcon);
            holder.tvName = itemView.findViewById(R.id.tvName);
            holder.tvCodeZip = itemView.findViewById(R.id.tvCodeZip);

            itemView.setTag(holder);
        } else {
            holder = (ViewHolder) itemView.getTag();
        }

        holder.imgIcon.setImageResource(nationalFlag.getImgIcon());
        holder.tvName.setText(nationalFlag.getNameNational());
        holder.tvCodeZip.setText("Population: " + nationalFlag.getCodeZip());

        return itemView;
    }

    static class ViewHolder {
        ImageView imgIcon;
        TextView tvName;
        TextView tvCodeZip;
    }
}
