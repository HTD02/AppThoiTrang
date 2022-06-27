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
import com.example.tkgdpm.R;
import com.example.tkgdpm.Model.TaiKhoanLive;

import java.util.List;

public class TaiKhoanLiveAdapter extends RecyclerView.Adapter<TaiKhoanLiveAdapter.TaiKhoanLiveViewHolder>{

    private List<TaiKhoanLive> taiKhoanLives;
    private Context context;

    public void SetData(Context context,List<TaiKhoanLive> list){
        this.context = context;
        this.taiKhoanLives = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public TaiKhoanLiveViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_live,parent,false);

        return new TaiKhoanLiveViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaiKhoanLiveViewHolder holder, int position) {
        TaiKhoanLive taiKhoanLive = taiKhoanLives.get(position);
        if(taiKhoanLive == null){
            return;
        }
        Glide.with(context).load(taiKhoanLive.getAnh()).into(holder.imglive);
        Glide.with(context).load(taiKhoanLive.getAvt()).into(holder.imgavtlive);
        holder.tvtenlive.setText(taiKhoanLive.getTen());
        holder.tvtieudelive.setText(taiKhoanLive.getTieude());
    }

    @Override
    public int getItemCount() {
        if (taiKhoanLives != null){
            return taiKhoanLives.size();
        }
        return 0;
    }

    class TaiKhoanLiveViewHolder extends RecyclerView.ViewHolder{
        public ImageView imglive, imgavtlive;
        public TextView tvtenlive,tvtieudelive;
        public TaiKhoanLiveViewHolder(@NonNull View itemView) {
            super(itemView);

            imglive = itemView.findViewById(R.id.img_live);
            imgavtlive = itemView.findViewById(R.id.img_avt_live);
            tvtenlive = itemView.findViewById(R.id.tv_ten_live);
            tvtieudelive = itemView.findViewById(R.id.tv_tieu_de_live);
        }
    }
}
