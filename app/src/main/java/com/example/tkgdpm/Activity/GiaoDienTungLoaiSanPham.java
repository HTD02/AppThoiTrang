package com.example.tkgdpm.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.tkgdpm.Adapter.SanPhamAdapter;
import com.example.tkgdpm.DuLieu.DuLieuSanPham;
import com.example.tkgdpm.Interface.IOnClickListener;
import com.example.tkgdpm.Model.SanPham;
import com.example.tkgdpm.R;

public class GiaoDienTungLoaiSanPham extends AppCompatActivity {

    private RecyclerView rcv_tatca;
    private SanPhamAdapter sanPhamAdapter;
    private DuLieuSanPham duLieuSanPham;
    private IOnClickListener iOnClickListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien_tung_loai_san_pham);

        rcv_tatca = findViewById(R.id.rcv_tatca);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(GiaoDienTungLoaiSanPham.this,2);
        rcv_tatca.setLayoutManager(gridLayoutManager);

        iOnClickListener = new IOnClickListener() {
            @Override
            public void ItemSanPhamOnCLick(SanPham sanPham) {
            }
        };
        sanPhamAdapter = new SanPhamAdapter(GiaoDienTungLoaiSanPham.this, new IOnClickListener() {
            @Override
            public void ItemSanPhamOnCLick(SanPham sanPham) {
                Intent i = new Intent(GiaoDienTungLoaiSanPham.this, ThongTinSanPham.class);
                i.putExtra("sanpham",sanPham);
                startActivity(i);
            }
        });
        duLieuSanPham = new DuLieuSanPham();
        sanPhamAdapter.SetData(duLieuSanPham.listTongHop());
        rcv_tatca.setAdapter(sanPhamAdapter);
    }
}