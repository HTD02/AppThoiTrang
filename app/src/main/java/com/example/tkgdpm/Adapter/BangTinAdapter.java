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
import com.example.tkgdpm.Model.BangTin;
import com.example.tkgdpm.Model.TaiKhoanLive;
import com.example.tkgdpm.R;

import java.util.List;

public class BangTinAdapter extends RecyclerView.Adapter<BangTinAdapter.BangTinViewHolder>{

    private List<BangTin> bangTinList;
    private Context context;

    public void SetData(Context context,List<BangTin> list){
        this.context = context;
        this.bangTinList = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public BangTinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bang_tin,parent,false);

        return new BangTinViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BangTinViewHolder holder, int position) {
        BangTin bangTin = bangTinList.get(position);
        if(bangTin == null){
            return;
        }
        Glide.with(context).load(bangTin.getAnh()).into(holder.anh);
        Glide.with(context).load(bangTin.getAvt()).into(holder.avt);
        holder.ten.setText(bangTin.getTen());
        holder.diachi.setText(bangTin.getDiachi());
        holder.tieude.setText(bangTin.getNoidung());
    }

    @Override
    public int getItemCount() {
        if (bangTinList != null){
            return bangTinList.size();
        }
        return 0;
    }

    class BangTinViewHolder extends RecyclerView.ViewHolder{
        public ImageView avt, anh;
        public TextView ten,diachi,tieude;
        public BangTinViewHolder(@NonNull View itemView) {
            super(itemView);

            avt = itemView.findViewById(R.id.avt_bangtin);
            anh = itemView.findViewById(R.id.anh_bangtin);
            ten = itemView.findViewById(R.id.ten_bangtin);
            diachi = itemView.findViewById(R.id.diachi_bangtin);
            tieude = itemView.findViewById(R.id.tieude_bangtin);
        }
    }
}
