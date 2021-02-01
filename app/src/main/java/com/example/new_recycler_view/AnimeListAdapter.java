package com.example.new_recycler_view;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimeListAdapter extends RecyclerView.Adapter<AnimeListAdapter.ViewHolder> {

    private List<Anime> animeList;
    private Context context;

    public AnimeListAdapter(List<Anime> animeList, Context context) {
        this.animeList = animeList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView photo;
        public TextView title, desc, genre, year;

        public ViewHolder(View view) {
            super(view);

            photo =view.findViewById(R.id.photo);
            title =view.findViewById(R.id.title);
            desc =view.findViewById(R.id.desc);
            genre =view.findViewById(R.id.genre);
            year =view.findViewById(R.id.year);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_main, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int position) {
        Anime item = animeList.get(position);

        viewHolder.photo.setImageResource(item.getPhoto());
        viewHolder.title.setText(item.getTitle());
        viewHolder.desc.setText("Type: "+ item.getDesc());
        viewHolder.genre.setText("Genre: "+item.getGenre());
        viewHolder.year.setText(item.getYear());
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }
}