package com.example.lab10;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    public void onCreate() {
        super.onCreate();
        new Thread( new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                    Intent intent = new Intent( MyService.this , MainActivity2.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) ;
                    MyService.this.startActivity(intent);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        return Service.START_NOT_STICKY;
    }
}
