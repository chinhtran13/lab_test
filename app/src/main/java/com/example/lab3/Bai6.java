package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class Bai6 extends AppCompatActivity {
    EditText edtSp, edtMa;
    Spinner spin;
    Button btnNhap;
    ListView lv;
    ArrayList<String> dataLV = new ArrayList<>();
    ArrayList<String> dataSpin = new ArrayList<>();
    ArrayAdapter<String> adapterLV;
    ArrayAdapter<String> adapterSpin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai6);

        addControls();

        // Dummy data for Spinner
        dataSpin.add("1 - SamSung");
        dataSpin.add("2 - Iphone");
        dataSpin.add("3 - IPad");

        // Set up Spinner adapter
        adapterSpin = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, dataSpin);
        adapterSpin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapterSpin);

        // Set up ListView adapter
        adapterLV = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataLV);
        lv.setAdapter(adapterLV);

        addEvents();
    }

    void addControls() {
        edtSp = findViewById(R.id.edtSp);
        edtMa = findViewById(R.id.edtMa);
        spin = findViewById(R.id.spin);
        btnNhap = findViewById(R.id.btnNhap);
        lv = findViewById(R.id.lv);
    }

    void addEvents() {
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedSpinnerItem = spin.getSelectedItem().toString();

                // Lấy số đầu tiên từ mục được chọn trong Spinner
                String loai = selectedSpinnerItem.substring(0, 1); // Lấy chỉ số đầu tiên

                String edtSpText = edtSp.getText().toString().trim();
                String edtMaText = edtMa.getText().toString().trim();

                // Tạo dữ liệu mới để thêm vào dataLV
                String newData = edtMaText + " - " + edtSpText;

                dataLV.add(loai);
                dataLV.add(newData);

                // Cập nhật ListView
                adapterLV.notifyDataSetChanged();
            }
        });
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedSpinnerItem = dataSpin.get(i); // Lấy mục được chọn từ dataSpin
                String loai = selectedSpinnerItem.substring(0, 1); // Lấy chỉ số đầu tiên
                filterData(loai);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    void filterData(String category) {
        ArrayList<String> filteredList = new ArrayList<>();

        // Lọc dữ liệu dựa trên loại sản phẩm được chọn từ Spinner
        for (String item : dataLV) {
            if (item.startsWith(category)) {
                filteredList.add(item);
            }
        }

        // Xóa dữ liệu hiện tại trong dataLV và thêm dữ liệu đã lọc vào
        dataLV.clear();
        dataLV.addAll(filteredList);

        // Cập nhật ListView
        adapterLV.notifyDataSetChanged();
    }
}
