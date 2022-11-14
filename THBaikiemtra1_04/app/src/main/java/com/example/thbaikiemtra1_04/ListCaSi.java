package com.example.thbaikiemtra1_04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class ListCaSi extends AppCompatActivity {
    private RecyclerView rcvCasi;
    private  CasiAdapter casiAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ca_si);

        rcvCasi = findViewById(R.id.rcv_casi);
        casiAdapter =new CasiAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCasi.setLayoutManager(linearLayoutManager);

        casiAdapter.setData(getListCasi());
        rcvCasi.setAdapter(casiAdapter);
    }
    private List<Casi> getListCasi(){
        List<Casi> list =new ArrayList<>();
        list.add(new Casi(R.drawable.cs1, "Nguyễn Thanh Tùng", "Sơn tùng MTP", "Việt Nam", "5 sao" ));
        list.add(new Casi(R.drawable.cs2, "Nguyễn Văn Đen", "Đen Vâu", "Việt Nam", "5 sao" ));
        list.add(new Casi(R.drawable.cs2, "Nguyễn Hoàng Sơn", "Sobin Hoàng Sơn", "Việt Nam", "4 sao" ));
        return list;
    }
}