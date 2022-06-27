package com.example.tkgdpm.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tkgdpm.Interface.IOnClickListener;
import com.example.tkgdpm.R;
import com.example.tkgdpm.Model.SanPham;

import java.util.List;

public class SanPhamAdapter extends RecyclerView.Adapter<SanPhamAdapter.SanPhamViewHolder>{
    public Context context;
    public IOnClickListener iOnClickListener;
    public List<SanPham> sanPhams;

    public void SetData(List<SanPham> list){
        this.sanPhams = list;
        notifyDataSetChanged();
    }
    public SanPhamAdapter(Context context, IOnClickListener iOnClickListener) {
        this.context = context;
        this.iOnClickListener = iOnClickListener;
    }

    @NonNull
    @Override
    public SanPhamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_san_pham,parent,false);

        return new SanPhamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SanPhamViewHolder holder, int position) {
        SanPham sanPham = sanPhams.get(position);
        if(sanPham == null){
            return;
        }
        holder.tvten.setText(sanPham.getTen());
        holder.tvgia.setText(sanPham.getGia());
        holder.tvdaban.setText(sanPham.getTinhtrang());
        Glide.with(context).load(sanPham.getAnh()).into(holder.image);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iOnClickListener.ItemSanPhamOnCLick(sanPham);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(sanPhams != null){
            return sanPhams.size();
        }
        return 0;
    }

    class SanPhamViewHolder extends RecyclerView.ViewHolder{
        private ImageView image;
        private TextView tvgia,tvten,tvdaban;
        public SanPhamViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            tvgia = itemView.findViewById(R.id.tvgia);
            tvten = itemView.findViewById(R.id.tvten);
            tvdaban = itemView.findViewById(R.id.tvdaban);
        }
    }
}
