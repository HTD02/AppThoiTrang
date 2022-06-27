package com.example.tkgdpm.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.tkgdpm.Fragment.LiveFragment;
import com.example.tkgdpm.Fragment.HomeFragment;
import com.example.tkgdpm.Fragment.TaiKhoanFragment;
import com.example.tkgdpm.Fragment.ThongBaoFragment;
import com.example.tkgdpm.Fragment.KhamPhaFragment;
import com.example.tkgdpm.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,new HomeFragment()).commit();
        bottomNavigationView.setSelectedItemId(R.id.bthome);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.bthome:
                        fragment = new HomeFragment();
                        break;
                    case R.id.btlive:
                        fragment = new LiveFragment();
                        break;
                    case R.id.bttinnhan:
                        fragment = new KhamPhaFragment();
                        break;
                    case R.id.btthongbao:
                        fragment = new ThongBaoFragment();
                        break;
                    case R.id.bttaikhoan:
                        fragment = new TaiKhoanFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container_layout,fragment).commit();
                return true;
            }
        });
    }
}