package com.example.service_example;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Object;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import java.nio.channels.Channel;

import static com.example.service_example.ChanelClass.ChanelId;

public class ServiceExample extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Intent nIntent=new Intent(this,MainActivity.class);
        //PandingIntent pandingIntent=PandingIntent.getActivity(this,0,nIntent);


        Notification notification=new NotificationCompat.Builder(this, ChanelId)
                .setContentTitle("My notification")
                .setContentText("this is notification")
                .setSmallIcon(R.drawable.ic_android_black_24dp)
                .setContentIntent( PendingIntent.getActivity(this, 0, nIntent, PendingIntent.FLAG_UPDATE_CURRENT)).build();
        startForeground(1,notification);
        return START_NOT_STICKY;


    }
}
