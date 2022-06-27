package com.example.tkgdpm.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.tkgdpm.Model.SanPham;
import com.example.tkgdpm.R;

public class ThongTinSanPham extends AppCompatActivity {

    private ImageView imageView, avtshop,avtcmt;
    private TextView tvgiasp,tvtensp,tvtinhtrang,tv_tenShop;
    private Button btxemshop, btmua, bt_mauden,bt_mautrang,bt_mautim,bt_mauxanh;
    private ImageButton btgiohang, bttim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_san_pham);

        imageView = findViewById(R.id.imageanhSanPham);
        tvgiasp = findViewById(R.id.tvgiaSanPham);
        tv_tenShop = findViewById(R.id.tv_tenShop);
        tvtinhtrang= findViewById(R.id.tvtinhtrangSanPham);
        tvtensp = findViewById(R.id.tvtenSanPham);
        btxemshop = findViewById(R.id.btxem_shop);
        btmua = findViewById(R.id.btdatmua_atvxemthongtin);
        btgiohang = findViewById(R.id.btgiohang_thongtin);
        bttim = findViewById(R.id.imgbt_tim);

        avtshop = findViewById(R.id.avtshop_ttsp);
        avtcmt = findViewById(R.id.avt_cmt);

        Glide.with(this)
                .load("https://salt.tikicdn.com/cache/400x400/ts/product/d3/84/57/114db6d8b5e118d761e6ce469204947e.jpg")
                .into(avtshop);
        Glide.with(this)
                .load("https://lzd-img-global.slatic.net/g/p/03f57017556a6a33316a87078a7f6b0e.jpg_400x400.jpg")
                .into(avtcmt);

        bt_mauden = findViewById(R.id.bt_mauden);
        bt_mautrang = findViewById(R.id.bt_mautrang);
        bt_mautim = findViewById(R.id.bt_mautim);
        bt_mauxanh = findViewById(R.id.bt_mauxanh);

        Intent intent = getIntent();
        SanPham sanPham = (SanPham) intent.getSerializableExtra("sanpham");

        Glide.with(this).load(sanPham.getAnh()).into(imageView);
        tvtensp.setText(sanPham.getTen());
        tvgiasp.setText(sanPham.getGia());
        tv_tenShop.setText(sanPham.getShop());
        tvtinhtrang.setText(sanPham.getTinhtrang());

        btxemshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThongTinSanPham.this, Shop.class);
                startActivity(intent);
            }
        });
        btmua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogMuaHang(Gravity.CENTER);
            }
        });
        btgiohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ThongTinSanPham.this, GioHang.class);
                startActivity(intent1);
            }
        });
        bttim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_mauden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_mauden.setWidth(10);
                bt_mauden.setHeight(10);
                bt_mauden.setBackground(getDrawable(R.drawable.mau_duoc_chon));
            }
        });
    }
    public void showDialogMuaHang(int vitri){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_mua_hang);

        Window window = dialog.getWindow();
        if(window == null){
            return;
        }

        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        WindowManager.LayoutParams windowAttributes = window.getAttributes();
        windowAttributes.gravity = vitri;
        window.setAttributes(windowAttributes);

        dialog.setCancelable(false);//ấn ra bên ngoài không tắt được

//        EditText edten = dialog.findViewById(R.id.ed_ten_dialog_mua);
//        EditText edsdt = dialog.findViewById(R.id.ed_sdt_dialog_mua);
//        EditText eddiachi = dialog.findViewById(R.id.ed_diachi_dialog_mua);
        Button bthuy = dialog.findViewById(R.id.bt_huy_dialog);
//        Button btmua = dialog.findViewById(R.id.bt_mua_dialog);
//
        bthuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}