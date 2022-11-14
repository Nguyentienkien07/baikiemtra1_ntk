package com.example.thbaikiemtra1_04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CasiAdapter extends RecyclerView.Adapter<CasiAdapter.UserViewHolder>{

    private Context mContext;
    private List<Casi> mListCasi;


    public CasiAdapter(Context mContext) {
        this.mContext = mContext;
    }
    public void setData(List<Casi> list){
        this.mListCasi = list;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_casi,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        Casi casi = mListCasi.get(position);
        if (casi == null) {
            return;
        }


        holder.img_name.setImageResource(casi.getResourceId());
        holder.tvName.setText(casi.getName());
        holder.tvnghedanh.setText(casi.getNghedanh());
        holder.tvquocgia.setText(casi.getQuocgia());
        holder.tvsosao.setText(casi.getSao());
    }

    @Override
    public int getItemCount() {
        if (mListCasi != null) {
            return mListCasi.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private ImageView img_name;
        private TextView tvName, tvnghedanh, tvquocgia, tvsosao;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            img_name = itemView.findViewById(R.id.img1);
            tvName = itemView.findViewById(R.id.nametext);
            tvnghedanh = itemView.findViewById(R.id.namenghedanh);
            tvquocgia = itemView.findViewById(R.id.quocgia);
            tvnghedanh = itemView.findViewById(R.id.sao);

        }
    }
}

