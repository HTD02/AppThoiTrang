package com.example.tkgdpm.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tkgdpm.R;
import com.example.tkgdpm.Model.ThongBao;

import java.util.List;

public class ThongBaoAdapter extends RecyclerView.Adapter<ThongBaoAdapter.ThongBaoViewHolder>{
    public List<ThongBao> thongBaos;
    public void SetData(List<ThongBao> list){
        this.thongBaos = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ThongBaoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_thong_bao,parent,false);
        return new ThongBaoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThongBaoViewHolder holder, int position) {
        ThongBao thongBao = thongBaos.get(position);
        if(thongBao == null){
            return;
        }
        holder.tv_noidung.setText(thongBao.noidung);
        holder.tv_tieude.setText(thongBao.tieude);
    }

    @Override
    public int getItemCount() {
        if(thongBaos != null){
            return thongBaos.size();
        }
        return 0;
    }

    class ThongBaoViewHolder extends RecyclerView.ViewHolder{
        public TextView tv_tieude,tv_noidung;
        public ThongBaoViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_tieude = itemView.findViewById(R.id.tv_tieu_de_thong_bao);
            tv_noidung = itemView.findViewById(R.id.tv_noi_dung_thong_bao);
        }
    }
}
