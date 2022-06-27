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
import com.example.tkgdpm.Model.LienLac;
import com.example.tkgdpm.R;

import java.util.List;

public class LienLacAdapter extends RecyclerView.Adapter<LienLacAdapter.LienLacViewHolder>{
    private List<LienLac> lienLacs;
    private Context context;

    public void SetData(Context context, List<LienLac> list){
        this.context = context;
        this.lienLacs = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public LienLacViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lien_lac,parent,false);

        return new LienLacViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LienLacViewHolder holder, int position) {
        LienLac lienLac = lienLacs.get(position);
        if(lienLac == null){
            return;
        }
        Glide.with(context).load(lienLac.getAvt()).into(holder.imageView);
        holder.tvtenlienlac.setText(lienLac.getTen());
        holder.tvtinnhancuoi.setText(lienLac.getTinnhancuoi());
    }


    @Override
    public int getItemCount() {
        if(lienLacs != null){
            return lienLacs.size();
        }
        return 0;
    }

    class LienLacViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView tvtenlienlac,tvtinnhancuoi;
        public LienLacViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.avt_lien_lac);
            tvtenlienlac = itemView.findViewById(R.id.tv_ten_lien_lac);
            tvtinnhancuoi = itemView.findViewById(R.id.tv_ten_tin_nhan_cuoi);
        }
    }
}
