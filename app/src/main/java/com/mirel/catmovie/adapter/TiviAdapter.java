package com.mirel.catmovie.adapter;

import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;




import com.mirel.catmovie.R;
import com.mirel.catmovie.data.TiviLoc;
import com.mirel.catmovie.UI.activity.TiviDetail;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;




import java.util.ArrayList;

public class TiviAdapter extends RecyclerView.Adapter<TiviAdapter.MyViewHolder> {

    private Activity activity;
    private ArrayList<TiviLoc> tiviLocArrayList;

    public TiviAdapter(Activity activity) {
        this.activity = activity;
    }

    private ArrayList<TiviLoc> getTvArrayList() {
        return tiviLocArrayList;
    }
/////////////////////////////////////////////////////////////
    public void setTvArrayList(ArrayList<TiviLoc> tvArrayList) {
        this.tiviLocArrayList = tvArrayList;
    }


    @NonNull
    @Override
    public TiviAdapter.MyViewHolder onCreateViewHolder(
            @NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                /////////////////////////////////////////////////
                .inflate(R.layout.tipe_rv, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull TiviAdapter.MyViewHolder holder, int i
    ) {
        holder.des_tivi.setText(tiviLocArrayList.get(i).getDek());

        holder.judul_tivi.setText(tiviLocArrayList.get(i).getjudul());

        holder.gambar_tv.setImageResource(tiviLocArrayList.get(i).getgmbar());

        holder.itemView.setOnClickListener(v -> {
                Intent intent = new Intent(activity, TiviDetail.class);
                intent.putExtra(TiviDetail.EXTRA_TIVI, getTvArrayList().get(i).getidtivi());
                activity.startActivity(intent);
        });

    }
//////////////////////////////////////////////////////
    @Override
    public int getItemCount() {


        return tiviLocArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView des_tivi;
        TextView judul_tivi;
        ImageView gambar_tv;
/////////////////////////////////////////////
        MyViewHolder(View view) {
            super(view);

            des_tivi = itemView.findViewById(R.id.tv_dek);
            judul_tivi = itemView.findViewById(R.id.tv_judul);

            gambar_tv = itemView.findViewById(R.id.iv_gambar);

        }
    }
}
