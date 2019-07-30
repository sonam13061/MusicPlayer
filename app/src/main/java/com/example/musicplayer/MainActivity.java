package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button play,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=findViewById(R.id.play);
        stop=findViewById(R.id.stop);
       final Intent intent=new Intent(MainActivity.this,Musicservice.class);
        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startService(intent);

            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(intent);

            }
        });
    }
}
