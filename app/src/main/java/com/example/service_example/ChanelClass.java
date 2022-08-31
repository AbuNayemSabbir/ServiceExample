package com.example.service_example;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class ChanelClass extends Application {
    public static final String ChanelId="MyChanel";

    @Override
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O);
        {
            NotificationChannel serviceChannel=new NotificationChannel(
                    ChanelId, "service example",
                    NotificationManager.IMPORTANCE_DEFAULT
            );

            NotificationManager notificationManager=getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(serviceChannel);
        }
    }
}
