package com.example.gamerecycle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecylerView extends RecyclerView.Adapter<AdapterRecylerView.ViewHolder> {

    ArrayList<ItemModel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textJudul;
        TextView textTahun;
        TextView textDetail;
        ImageView posterGame;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textJudul = itemView.findViewById(R.id.title_game);
            textTahun = itemView.findViewById(R.id.year_game);
            textDetail = itemView.findViewById(R.id.detail_game);
            posterGame = itemView.findViewById(R.id.game_poster);
        }
    }

    AdapterRecylerView(ArrayList<ItemModel> data) {
        this.dataItem = data;
    }

    @NonNull
    @Override
    public AdapterRecylerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecylerView.ViewHolder holder, int position) {

        TextView text_judul = holder.textJudul;
        TextView text_tahun = holder.textTahun;
        TextView text_detail = holder.textDetail;
        ImageView game_poster = holder.posterGame;

        text_judul.setText(dataItem.get(position).getName());
        text_tahun.setText(dataItem.get(position).getYear());
        text_detail.setText(dataItem.get(position).getDetail());
        game_poster.setImageResource(dataItem.get(position).getPoster());
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

}
