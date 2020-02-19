package com.example.thread_and_asynctask;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int rabprogress = 0, turprogress = 0;

    private SeekBar seekBar, seekBar2;
    private Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //連結xml
        seekBar = findViewById(R.id.seekBar);
        seekBar2 = findViewById(R.id.seekBar2);
        btn_start = findViewById(R.id.button);
        //開始按鈕監聽事件
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_start.setEnabled(false);
                //初始化計數器
                rabprogress = 0;
                turprogress = 0;
                seekBar.setProgress(0);
                seekBar2.setProgress(0);

                //執行副程式來執行Thread
                runThread();
                //執行副程式來執行runAsyncTask
                runAsyncTask();
            }
        });
    }
    private  void runThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(rabprogress<=100 && turprogress<=100){
                    try{
                        Thread.sleep(100);//延遲0.1秒
                        //隨機增加計數器0~2的值
                        rabprogress += (int)(Math.random()*3);
                        //建立Message物件
                        Message msg = new Message();
                        //加入代號
                        msg.what = 1;
                        //透過sendMessage傳送訊息
                        mHandler.sendMessage(msg);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start(); //啟動 Thread
    }
    //建立Handler物件等待接收訊息
    private Handler mHandler = new Handler(new Handler.Callback()
    {
        @Override
        public boolean handleMessage(@NonNull Message msg) {
            switch(msg.what){
                case 1:
                    seekBar.setProgress(rabprogress);
                    break;
            }
            //重複執行到計數器不小於100為止，用Toast顯示兔子勝利
            if(rabprogress >=100 && turprogress<100){
                Toast.makeText(MainActivity.this,
                        "兔子勝利", Toast.LENGTH_SHORT).show();
                btn_start.setEnabled(true);
            }
            return false;
        }
    });
    private void runAsyncTask() {

        new AsyncTask<Void, Integer, Boolean>() {
            @Override
            protected Boolean doInBackground(Void... voids) {
                //重複執行到計數器不小於100為止
                while (turprogress <= 100 && rabprogress < 100) {
                    try {
                        Thread.sleep(100);

                        turprogress += (int) (Math.random() * 3);

                        publishProgress(turprogress);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return true;
            }

            @Override
            protected void onProgressUpdate(Integer... values) {
                super.onProgressUpdate(values);
                //寫入計數器地直到SeekBar的進度中
                seekBar2.setProgress(values[0]);
            }

            @Override
            protected void onPostExecute(Boolean aBoolean) {
                super.onPostExecute(aBoolean);
                //用Toast顯示烏龜勝利
                if (turprogress >= 100 && rabprogress < 100) {
                    Toast.makeText(MainActivity.this,
                            "烏龜勝利", Toast.LENGTH_SHORT).show();
                    btn_start.setEnabled(true);
                }
            }
        }.execute();
    }
}
