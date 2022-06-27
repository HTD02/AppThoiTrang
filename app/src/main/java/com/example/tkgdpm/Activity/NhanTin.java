package com.example.tkgdpm.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.tkgdpm.Adapter.LienLacAdapter;
import com.example.tkgdpm.DuLieu.DuLienLiecLac;
import com.example.tkgdpm.R;

public class NhanTin extends AppCompatActivity {
    private RecyclerView rcvlienlac;
    private ImageButton btgiohang;
    private Button btthoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhan_tin);

        rcvlienlac = findViewById(R.id.rcv_lien_lac);
        btgiohang = findViewById(R.id.btgiohang_nhantin);
        btthoat = findViewById(R.id.btthoat_nhantin);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(NhanTin.this,LinearLayoutManager.VERTICAL,false);
        rcvlienlac.setLayoutManager(linearLayoutManager);

        LienLacAdapter lienLacAdapter = new LienLacAdapter();
        DuLienLiecLac duLienLiecLac = new DuLienLiecLac();
        lienLacAdapter.SetData(NhanTin.this,duLienLiecLac.getDanhSachLienLac());
        rcvlienlac.setAdapter(lienLacAdapter);

        btgiohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NhanTin.this, GioHang.class);
                startActivity(intent);
            }
        });
        btthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NhanTin.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}