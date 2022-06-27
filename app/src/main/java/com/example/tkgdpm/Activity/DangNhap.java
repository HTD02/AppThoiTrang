package com.example.tkgdpm.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tkgdpm.Fragment.DangKyFragment;
import com.example.tkgdpm.Fragment.DangNhapFragment;
import com.example.tkgdpm.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class DangNhap extends AppCompatActivity {

    private Button btdangnhap, btdangky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        btdangnhap = findViewById(R.id.menu_dang_nhap);
        btdangky = findViewById(R.id.menu_dang_ky);

        getSupportFragmentManager().beginTransaction().replace(R.id.container_dang_nhap,new DangNhapFragment()).commit();
        btdangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btdangky.setBackground(getDrawable(R.color.white));
                btdangnhap.setBackground(getDrawable(R.color.nentextview));
                Fragment fragment = new Fragment();
                fragment = new DangNhapFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.container_dang_nhap,fragment).commit();
            }
        });
        btdangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btdangky.setBackground(getDrawable(R.color.nentextview));
                btdangnhap.setBackground(getDrawable(R.color.white));
                Fragment fragment = new Fragment();
                fragment = new DangKyFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.container_dang_nhap,fragment).commit();
            }
        });

    }
}