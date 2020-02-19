package com.example.myapplication

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.widget.ButtonBarLayout

class MainActivity : AppCompatActivity() {

    private var rabprogress = 0
    private var turprogress = 0


    private var seekBar: SeekBar? = null
    private var seekBar2: SeekBar? = null
    private var btn_start: Button? = null


    //建立Handler物件等待接收訊息
    private val mHandler = Handler(Handler.Callback { msg ->
        when (msg.what) {
            1 -> seekBar!!.progress = rabprogress
        }
        //重複執行到計數器不小於100為止，用Toast顯示兔子勝利
        if (rabprogress >= 100 && turprogress < 100) {
            Toast.makeText(this@MainActivity,
                "兔子勝利", Toast.LENGTH_SHORT).show()
            btn_start!!.isEnabled = true
        }
        true
    })
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //連結xml
        seekBar = findViewById(R.id.seekBar)
        seekBar2 = findViewById(R.id.seekBar2)
        btn_start = findViewById<Button>(R.id.button)
        //開始按鈕監聽事件

        btn_start!!.setOnClickListener  {
            btn_start?.isEnabled = false
            //初始化計數器
            rabprogress = 0
            turprogress = 0
            seekBar!!.progress = 0
            seekBar2!!.progress = 0
            //執行副程式來執行Thread
            runThread()
            //執行副程式來執行runAsyncTask
            runAsyncTask()
        }
    }
    private fun runThread() {
       object : Thread() {
           override fun run() {
               while (rabprogress <=100 && turprogress<100){
                   try {
                       sleep(100)
                   }catch (e: InterruptedException) {
                       e.printStackTrace()
                   }
                   rabprogress += (Math.random() * 3).toInt()

                   val msg = Message()

                   msg.what = 1

                   mHandler.sendMessage(msg)
               }
           }
       }.start()
    }
    private fun runAsyncTask(){
        object : AsyncTask<Void, Int, Boolean>() {
            override fun doInBackground(vararg params: Void?): Boolean? {
                //To change body of created functions use File | Settings | File Templates.
                //publishProgress() 不要用這個
                while (turprogress <= 100 && rabprogress <100) {
                    try {
                        Thread.sleep(100)
                    } catch ( e: InterruptedException) {
                        e.printStackTrace()
                    }
                    //隨機增加計數器0~2的值
                    turprogress += (Math.random() * 3).toInt()
                    //更新進度條，傳入烏龜計數器
                    publishProgress(turprogress)
                }
                return  true
            }
            override fun onProgressUpdate(vararg values: Int?) {
                super.onProgressUpdate(*values)
                //seekBar2!!.progress != values[0]
                values[0]?.let {
                    seekBar2!!.progress = it //寫入計數器地直到SeekBar的進度中
                }
            }
            override fun onPostExecute(result: Boolean?) {

                if (turprogress >=100 && rabprogress <100) {
                    Toast.makeText(this@MainActivity,"烏龜勝利",
                        Toast.LENGTH_SHORT).show()
                    btn_start?.isEnabled = true
                }
            }
        }.execute()
    }

}
