package com.example.tkgdpm.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tkgdpm.Adapter.ItemTrongGioAdapter;
import com.example.tkgdpm.DuLieu.DuLieuSanPham;
import com.example.tkgdpm.Interface.IOnClickListener;
import com.example.tkgdpm.Interface.IOnLongClickListener;
import com.example.tkgdpm.Model.SanPham;
import com.example.tkgdpm.R;

public class GioHang extends AppCompatActivity {

    private RecyclerView rvc_giohang;
    private ItemTrongGioAdapter itemTrongGioAdapter;
    private DuLieuSanPham duLieuSanPham;
    private Button btmua, btmuasamtiep;
    private ImageButton btxoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);
        rvc_giohang = findViewById(R.id.rcv_giohang);

        btmua = findViewById(R.id.btmua_giohang);
        btxoa = findViewById(R.id.btxoa_giohang);
        btmuasamtiep = findViewById(R.id.btmuasamtiep_giohang);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(GioHang.this,1);
        rvc_giohang.setLayoutManager(gridLayoutManager);
        duLieuSanPham = new DuLieuSanPham();

        itemTrongGioAdapter = new ItemTrongGioAdapter(GioHang.this, new IOnLongClickListener() {
            @Override
            public void itemOnLongClickListener(int vitri) {
                ShowDialogXoaItem(Gravity.CENTER,R.string.xoaitem);
            }
        },
                new IOnClickListener() {
                    @Override
                    public void ItemSanPhamOnCLick(SanPham sanPham) {
                        Intent i = new Intent(GioHang.this, ThongTinSanPham.class);
                        i.putExtra("sanpham",sanPham);
                        startActivity(i);
                    }
                });

        itemTrongGioAdapter.SetData(duLieuSanPham.listTongHop());
        rvc_giohang.setAdapter(itemTrongGioAdapter);


        btmua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogMuaHang(Gravity.CENTER);
            }
        });
        btxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowDialogXoaItem(Gravity.CENTER,R.string.xoatatca);
            }
        });
        btmuasamtiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GioHang.this, GiaoDienTungLoaiSanPham.class);
                startActivity(intent);
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

        EditText edten , edsdt, eddiachi;
         edten = dialog.findViewById(R.id.ed_ten_dialog_mua);
         edsdt = dialog.findViewById(R.id.ed_sdt_dialog_mua);
         eddiachi = dialog.findViewById(R.id.ed_diachi_dialog_mua);
        Button bthuy, btmua2;
        bthuy = dialog.findViewById(R.id.bt_huy_dialog);
        btmua2 = dialog.findViewById(R.id.bt_mua_dialog);
//
        bthuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        btmua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edten.getText().toString().isEmpty() ||
                        eddiachi.getText().toString().isEmpty() ||
                        edsdt.getText().toString().isEmpty()){
                    Toast.makeText(GioHang.this,"Hãy nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(GioHang.this,"Đã thêm vào hàng chờ vận chuyển",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    void ShowDialogXoaItem(int vitri,int tieude){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_xoa_item);

        Window window = dialog.getWindow();
        if(window == null){
            return;
        }

        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        WindowManager.LayoutParams windownAtributes = window.getAttributes();
        windownAtributes.gravity = vitri;
        window.setAttributes(windownAtributes);

        dialog.setCancelable(true);

        Button bthuy, btxoa;
        TextView tvtieude;
        bthuy = dialog.findViewById(R.id.bthuy_dialog_xoa);
        btxoa = dialog.findViewById(R.id.btxoa_dialog_xoa);
        tvtieude = dialog.findViewById(R.id.tieude_dialog);

        tvtieude.setText(tieude);

        bthuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        btxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GioHang.this, "Đã xóa khỏi danh sách",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}