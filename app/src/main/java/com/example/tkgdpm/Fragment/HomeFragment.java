package com.example.tkgdpm.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tkgdpm.Activity.GiaoDienTungLoaiSanPham;
import com.example.tkgdpm.Interface.IOnClickListener;
import com.example.tkgdpm.Activity.NhanTin;
import com.example.tkgdpm.R;
import com.example.tkgdpm.Model.SanPham;
import com.example.tkgdpm.Adapter.SanPhamAdapter;
import com.example.tkgdpm.DuLieu.DuLieuSanPham;

import com.example.tkgdpm.Activity.ThongTinSanPham;

public class HomeFragment extends Fragment {

    private View view;
    private RecyclerView rcv_san_pham;
    private ImageButton btnhantin_home;
    private SanPhamAdapter sanPhamAdapter;
    private DuLieuSanPham duLieuSanPham;
    private ImageView flip_img1,flip_img2,flip_img3,
            tatca,quannam,quannu,aonam,aonu,vay,giay,kinh;
    SearchView searchView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home,container,false);

        rcv_san_pham = view.findViewById(R.id.rcv_san_pham);
        tatca = view.findViewById(R.id.tatca);
        btnhantin_home = view.findViewById(R.id.btnhantin_home);
        searchView = view.findViewById(R.id.search);

        flip_img1 = view.findViewById(R.id.flip_img1);
        flip_img2 = view.findViewById(R.id.flip_img2);
        flip_img3 = view.findViewById(R.id.flip_img3);

        quannam = view.findViewById(R.id.quannam);
        quannu = view.findViewById(R.id.quannu);
        aonam = view.findViewById(R.id.aonam);
        aonu = view.findViewById(R.id.aonu);
        vay = view.findViewById(R.id.vay);
        giay = view.findViewById(R.id.giay);
        kinh = view.findViewById(R.id.kinh);

        Glide.with(this)
                .load("https://file.hstatic.net/200000054912/collection/shirt_adf7cdd0a4fc42e9921bfac9bf51221b.jpg")
                .into(flip_img1);
        Glide.with(this)
                .load("https://theme.hstatic.net/200000232953/1000728047/14/collection_banner.jpg?v=77")
                .into(flip_img2);
        Glide.with(this)
                .load("https://file.hstatic.net/200000182297/file/web-01_2a2dd2b1c4ad4628933282029c21e017.jpg")
                .into(flip_img3);

        Glide.with(this)
                .load("https://play-lh.googleusercontent.com/Gzwk-ZmTIr2ehCXsOj_P95L5k1vE1C-ulMb8oYFQTKOHvnGK8enJgDy8MbwdjRRP3Po")
                .into(tatca);

        Glide.with(this)
                .load("https://salt.tikicdn.com/cache/400x400/ts/product/d3/84/57/114db6d8b5e118d761e6ce469204947e.jpg")
                .into(quannam);

        Glide.with(this)
                .load("https://lzd-img-global.slatic.net/g/p/03f57017556a6a33316a87078a7f6b0e.jpg_400x400.jpg")
                .into(quannu);

        Glide.with(this)
                .load("https://img.alicdn.com/imgextra/i2/3175423297/O1CN01BOGrrV1aE4QJxA8WD_!!3175423297.jpg_400x400.jpg")
                .into(aonam);

        Glide.with(this)
                .load("https://i.pinimg.com/474x/41/ca/85/41ca8500292340f181563b1cb70e978d.jpg")
                .into(aonu);

        Glide.with(this)
                .load("https://cdn-epkha.nitrocdn.com/EKBKQDnSTVcAnQFFImAvzkeyQXZgvJLl/assets/static/optimized/rev-307c79c/wp-content/uploads/2022/03/chan-vay-chu-a-400x400.jpg")
                .into(vay);

        Glide.with(this)
                .load("https://salt.tikicdn.com/cache/400x400/ts/product/5a/f5/e6/c7ce1d67db3e2c799739756d7be14f64.jpg")
                .into(giay);

        Glide.with(this)
                .load("https://giadungaz.com/wp-content/uploads/2022/01/2f4cbdedcd3d660d505942f637969ff6-400x400.jpg")
                .into(kinh);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        rcv_san_pham.setLayoutManager(gridLayoutManager);

        sanPhamAdapter = new SanPhamAdapter(getContext(), new IOnClickListener() {
            @Override
            public void ItemSanPhamOnCLick(SanPham sanPham) {
                Intent i = new Intent(getContext(), ThongTinSanPham.class);
                i.putExtra("sanpham",sanPham);
                startActivity(i);
            }
        });
        rcv_san_pham.hasFixedSize();
        duLieuSanPham = new DuLieuSanPham();
        sanPhamAdapter.SetData(duLieuSanPham.listTongHop());
        rcv_san_pham.setAdapter(sanPhamAdapter);

        tatca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), GiaoDienTungLoaiSanPham.class);
                startActivity(intent);
            }
        });
        btnhantin_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), NhanTin.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
