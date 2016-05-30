package org.college.android.itomer.recyclerviewdemo;


public class Song {
    String name;
    String artist;
    String duration;
    String lyrics;
    int albumResID;

    //ALT-INSERT->Generate Constructor Using Fields->Select all the Fields
    public Song(String name, String artist,
                String duration, String lyrics,
                int albumResID) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.lyrics = lyrics;
        this.albumResID = albumResID;
    }
}
