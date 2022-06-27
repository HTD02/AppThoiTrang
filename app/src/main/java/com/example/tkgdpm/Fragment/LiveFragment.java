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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tkgdpm.DuLieu.DuLieuTaiKhoanLive;
import com.example.tkgdpm.Activity.GioHang;
import com.example.tkgdpm.Activity.NhanTin;
import com.example.tkgdpm.R;
import com.example.tkgdpm.Adapter.TaiKhoanLiveAdapter;

public class LiveFragment extends Fragment {

    private View view;
    private ImageButton btgiohang,btnhantin;
    private RecyclerView rcvlive;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_live,container,false);

        rcvlive = view.findViewById(R.id.rcv_live);
        btnhantin = view.findViewById(R.id.btnhantin_live);
        btgiohang = view.findViewById(R.id.btgiohang_live);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        rcvlive.setLayoutManager(gridLayoutManager);

        TaiKhoanLiveAdapter taiKhoanLiveAdapter = new TaiKhoanLiveAdapter();

        DuLieuTaiKhoanLive duLieuTaiKhoanLive = new DuLieuTaiKhoanLive();
        taiKhoanLiveAdapter.SetData(getContext(),duLieuTaiKhoanLive.getListTaiKhoanLive());
        rcvlive.setAdapter(taiKhoanLiveAdapter);

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
