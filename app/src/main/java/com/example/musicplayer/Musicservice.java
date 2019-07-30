package com.example.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class Musicservice extends Service {
    MediaPlayer mediaPlayer;
    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.song);

    }


    public Musicservice() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("playing","playing..");

        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);


    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        mediaPlayer.stop();
    }

    @Override
    public IBinder onBind(Intent intent) {

        // TODO: Return the communication channel to the service.
        return null;
    }
}
