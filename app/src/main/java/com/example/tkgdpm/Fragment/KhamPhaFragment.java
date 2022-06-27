package com.example.tkgdpm.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tkgdpm.Activity.GioHang;
import com.example.tkgdpm.Activity.NhanTin;
import com.example.tkgdpm.Adapter.BangTinAdapter;
import com.example.tkgdpm.DuLieu.DuLieuBangTin;
import com.example.tkgdpm.Model.BangTin;
import com.example.tkgdpm.R;

public class KhamPhaFragment extends Fragment {

    private View view;
    private ImageButton btgiohang,btnhantin;
    RecyclerView rcv_khampha;
    DuLieuBangTin duLieuBangTin = new DuLieuBangTin();
    BangTinAdapter bangTinAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_kham_pha,container,false);


        btnhantin = view.findViewById(R.id.btnhantin_khampha);
        btgiohang = view.findViewById(R.id.btgiohang_khampha);

        rcv_khampha = view.findViewById(R.id.rcv_khampha);
        bangTinAdapter = new BangTinAdapter();
        bangTinAdapter.SetData(getContext(),duLieuBangTin.DuLieu());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rcv_khampha.setLayoutManager(linearLayoutManager);
        rcv_khampha.setAdapter(bangTinAdapter);

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
