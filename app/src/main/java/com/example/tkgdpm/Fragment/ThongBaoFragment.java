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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tkgdpm.Activity.GioHang;
import com.example.tkgdpm.Activity.NhanTin;
import com.example.tkgdpm.R;
import com.example.tkgdpm.Adapter.ThongBaoAdapter;
import com.example.tkgdpm.DuLieu.DuLieuThongBao;

public class ThongBaoFragment extends Fragment {

    public View view;
    public RecyclerView rcv_thong_bao;
    private ImageButton btgiohang,btnhantin;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_thong_bao,container,false);

        rcv_thong_bao = view.findViewById(R.id.rcv_thong_bao);
        btnhantin = view.findViewById(R.id.btnhantin_thongbao);
        btgiohang = view.findViewById(R.id.btgiohang_thongbao);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rcv_thong_bao.setLayoutManager(linearLayoutManager);

        DuLieuThongBao duLieuThongBao = new DuLieuThongBao();
        ThongBaoAdapter thongBaoAdapter = new ThongBaoAdapter();
        thongBaoAdapter.SetData(duLieuThongBao.DuLieu());

        rcv_thong_bao.setAdapter(thongBaoAdapter);


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
