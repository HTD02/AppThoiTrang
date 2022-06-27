package com.example.tkgdpm.Activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.tkgdpm.Adapter.BangTinAdapter;
import com.example.tkgdpm.DuLieu.DuLieuBangTin;
import com.example.tkgdpm.R;

public class Shop extends AppCompatActivity {
    private Button btxemtatca, btthich, bttheodoi;
    RecyclerView rcv_bangtinshop;
    DuLieuBangTin duLieuBangTin = new DuLieuBangTin();
    BangTinAdapter bangTinAdapter;
    ImageView anhshop,avtshop,anhmau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);


        btxemtatca = findViewById(R.id.btxemtatca_shop);
        btthich = findViewById(R.id.btthich_shop);
        bttheodoi = findViewById(R.id.bttheodoi_shop);
        rcv_bangtinshop = findViewById(R.id.rcv_bangtin_shop);
        anhshop = findViewById(R.id.anh_shop);
        avtshop = findViewById(R.id.avt_shop);
        anhmau = findViewById(R.id.anhmau_shop);

        Glide.with(this)
                .load("https://file.hstatic.net/200000054912/collection/shirt_adf7cdd0a4fc42e9921bfac9bf51221b.jpg")
                .into(anhshop);
        Glide.with(this)
                .load("https://theme.hstatic.net/200000232953/1000728047/14/collection_banner.jpg?v=77")
                .into(avtshop);
        Glide.with(this)
                .load("https://theme.hstatic.net/200000232953/1000728047/14/collection_banner.jpg?v=77")
                .into(anhmau);

        bangTinAdapter = new BangTinAdapter();
        bangTinAdapter.SetData(Shop.this,duLieuBangTin.DuLieu());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Shop.this,RecyclerView.VERTICAL,false);
        rcv_bangtinshop.setLayoutManager(linearLayoutManager);
        rcv_bangtinshop.setAdapter(bangTinAdapter);

        btxemtatca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shop.this, GiaoDienTungLoaiSanPham.class);
                startActivity(intent);
            }
        });
        btthich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btthich.getText() =="Like"){
                    btthich.setText("Liked");
                }else{
                    btthich.setText("Like");
                }
            }
        });
        bttheodoi.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if(bttheodoi.getText() =="Follow"){
                    bttheodoi.setText("Following");
                    bttheodoi.setBackground(getDrawable(R.drawable.dang_theo_doi));
                    bttheodoi.setTextColor(getColor(R.color.red));
                }else{
                    bttheodoi.setBackground(getDrawable(R.drawable.theo_doi));
                    bttheodoi.setTextColor(getColor(R.color.white));
                    bttheodoi.setText("Follow");
                }
            }
        });
    }
}