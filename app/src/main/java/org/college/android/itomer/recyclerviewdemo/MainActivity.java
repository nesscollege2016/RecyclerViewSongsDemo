package org.college.android.itomer.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SongAdapter adapter = new SongAdapter(getLayoutInflater());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.songRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public ArrayList<Song> getSongsFromService() {
        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            songs.add(new Song("Hello", "Adele", "4:23", "The Song Lyrics", R.drawable.adele));
            songs.add(new Song("Nothing Like You", "Rihanna", "4:53", "The Song Lyrics", R.drawable.rihanna));
            songs.add(new Song("שיר על השכן", "Keren Peles", "3:25", "The Song Lyrics", R.drawable.keren));
            songs.add(new Song("אתמול היה טוב", "שלמה ארצי", "8:57", "The Song Lyrics", R.drawable.shlomo));
        }
        return songs;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
