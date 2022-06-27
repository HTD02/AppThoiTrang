package com.example.tkgdpm.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tkgdpm.Activity.GioHang;
import com.example.tkgdpm.Activity.NhanTin;
import com.example.tkgdpm.R;

public class TaiKhoanFragment extends Fragment {

    private ImageButton btgiohang,btnhantin;
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tai_khoan,container,false);
        btnhantin = view.findViewById(R.id.btnhantin_taikhoan);
        btgiohang = view.findViewById(R.id.btgiohang_taikhoan);

        btgiohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), GioHang.class);
                startActivity(intent);
            }
        });
        btnhantin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), NhanTin.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
