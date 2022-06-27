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
import com.example.tkgdpm.Interface.IOnLongClickListener;
import com.example.tkgdpm.R;
import com.example.tkgdpm.Model.SanPham;

import java.util.List;

public class ItemTrongGioAdapter extends RecyclerView.Adapter<ItemTrongGioAdapter.ItemTrongGioViewHolder>{

    private List<SanPham> sanPhams;
    public Context context;
    private IOnLongClickListener iOnLongClickListener;
    private IOnClickListener iOnClickListener;

    public void SetData(List<SanPham> list){
        this.sanPhams = list;
        notifyDataSetChanged();
    }
    public ItemTrongGioAdapter (Context context, IOnLongClickListener iOnLongClickListener1, IOnClickListener iOnClickListener){
        this.context = context;
        this.iOnLongClickListener = iOnLongClickListener1;
        this.iOnClickListener = iOnClickListener;
    }

    @NonNull
    @Override
    public ItemTrongGioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_san_pham_trong_gio,parent,false);

        return new ItemTrongGioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemTrongGioViewHolder holder, int position) {
        int p = position;
        SanPham sanPham = sanPhams.get(position);
        if(sanPham == null){
            return;
        }

        Glide.with(context).load(sanPham.getAnh()).into(holder.imageView);
        holder.tvgia.setText(sanPham.getGia());
        holder.tvten.setText(sanPham.getTen());
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                iOnLongClickListener.itemOnLongClickListener(p);
                return false;
            }
        });
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

    class ItemTrongGioViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView tvten, tvgia;
        public ItemTrongGioViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image2);
            tvten = itemView.findViewById(R.id.tv_ten_san_pham2);
            tvgia = itemView.findViewById(R.id.tv_gia_san_pham2);
        }
    }
}
