package com.thio.symphony.Activity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import com.thio.symphony.R;
import com.thio.symphony.R.layout;


public class MainActivity extends AppCompatActivity {

    private ImageView explorer, favorites, playbutton, download, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        // Inisialisasi ImageView
        explorer = findViewById(R.id.explorer);
        favorites = findViewById(R.id.favorites);
        playbutton = findViewById(R.id.playbutton);
        download = findViewById(R.id.download);
        profile = findViewById(R.id.profile);

        // Atur listener untuk setiap ImageView
        explorer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tambahkan kode untuk menangani klik pada Explorer
                navigateToExplorer();
            }
        });

        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tambahkan kode untuk menangani klik pada Favorites
                navigateToFavorites();
            }
        });

        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tambahkan kode untuk menangani klik pada Play Button
                // (Removed the startPlayback method)
            }
        });

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tambahkan kode untuk menangani klik pada Download
                navigateToDownload();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tambahkan kode untuk menangani klik pada Profile
                navigateToProfile();
            }
        });

        // Inisialisasi FloatingActionButton dan atur listener
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tambahkan kode untuk menangani klik pada Floating Action Button
                navigateToDetailMusik();
            }
        });
    }

    // Metode untuk menangani klik pada Explorer
    private void navigateToExplorer() {
        // Implementasikan logika untuk pindah ke layar Explorer
        Intent explorerIntent = new Intent(MainActivity.this, ExplorerActivity.class);
        startActivity(explorerIntent);
    }

    // Metode untuk menangani klik pada Favorites
    private void navigateToFavorites() {
        // Implementasikan logika untuk pindah ke layar Favorites
        Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);
        startActivity(favoritesIntent);
    }

    // Metode untuk menangani klik pada Download
    private void navigateToDownload() {
        // Implementasikan logika untuk pindah ke layar Download
        Intent downloadIntent = new Intent(MainActivity.this, DownloadActivity.class);
        startActivity(downloadIntent);
    }

    // Metode untuk menangani klik pada Profile
    private void navigateToProfile() {
        // Implementasikan logika untuk pindah ke layar Profil
        Intent profileIntent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(profileIntent);
    }

    // Metode untuk menangani klik pada Floating Action Button
    private void navigateToDetailMusik() {
        // Implementasikan logika untuk pindah ke layar DetailMusikActivity
        Intent detailMusikIntent = new Intent(MainActivity.this, DetailMusikActivity.class);
        startActivity(detailMusikIntent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        // We will start writing our code here.
    }

    private void connected() {
        // Then we will write some more code here.
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Aaand we will finish off here.
    }
}
