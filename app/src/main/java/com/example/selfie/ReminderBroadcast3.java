package com.example.selfie;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;


    public class ReminderBroadcast3 extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context,"reminder")
                    .setTimeoutAfter(60)
                    .setSmallIcon(R.drawable.ic)
                    .setContentTitle("Camera Reminder")
                    .setContentText("Let's take a selfie, beauty!")
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT);

            NotificationManagerCompat notiManager= NotificationManagerCompat.from(context);
            notiManager.notify(200,builder.build());
        }
    }

