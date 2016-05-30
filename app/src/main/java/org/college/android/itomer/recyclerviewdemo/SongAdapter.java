package org.college.android.itomer.recyclerviewdemo;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongViewHolder>{
    ArrayList<Song> songs = new ArrayList<>();
    LayoutInflater inflater;

    public SongAdapter(LayoutInflater inflater){
        this.inflater = inflater;
        for (int i = 0; i < 100; i++) {
            songs.add(new Song("Hello", "Adele", "4:23", "The Song Lyrics", R.drawable.adele));
            songs.add(new Song("Nothing Like You", "Rihanna", "4:53", "The Song Lyrics", R.drawable.rihanna));
            songs.add(new Song("שיר על השכן", "Keren Peles", "3:25", "The Song Lyrics", R.drawable.keren));
            songs.add(new Song("אתמול היה טוב", "שלמה ארצי", "8:57", "The Song Lyrics", R.drawable.shlomo));
        }}

    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View songView = inflater.inflate(R.layout.song_layout, parent, false);

        return new SongViewHolder(songView);
    }



    //
    @Override
    public void onBindViewHolder(SongViewHolder songViewHolder,
                                 int position) {
        Song s = songs.get(position);


        songViewHolder.tvArtist.setText(s.artist);
        songViewHolder.tvSongName.setText(s.name);
        songViewHolder.tvDuration.setText(s.duration);
        songViewHolder.ivAlbum.setImageResource(s.albumResID);
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }
}


class SongViewHolder extends RecyclerView.ViewHolder{
    TextView tvSongName;
    TextView tvDuration;
    TextView tvArtist;
    ImageView ivAlbum;

    public SongViewHolder(View view) {
        super(view);
        tvSongName = (TextView) view.findViewById(R.id.tvSongName);
        tvDuration = (TextView) view.findViewById(R.id.tvDuration);
        tvArtist = (TextView) view.findViewById(R.id.tvArtist);
        ivAlbum = (ImageView) view.findViewById(R.id.ivAlbum);
    }
}
