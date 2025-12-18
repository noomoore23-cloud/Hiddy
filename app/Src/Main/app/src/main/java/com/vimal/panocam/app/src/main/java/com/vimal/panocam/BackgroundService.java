package com.vimal.panocam;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class BackgroundService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // பின்னணியில் வேலை செய்யும் பகுதி
        Toast.makeText(this, "பின்னணியில் இயங்குகிறது!", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
