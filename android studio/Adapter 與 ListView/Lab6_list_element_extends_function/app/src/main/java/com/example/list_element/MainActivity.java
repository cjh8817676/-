package com.example.list_element;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Data{
        int photo; //圖片id
        String name; //名稱
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] transNameArray = new String[]{"腳踏車","機車","汽車","巴士"};
        int[] transPhotoIdArray = new int[] {R.drawable.trans1,R.drawable.trans2
        ,R.drawable.trans3,R.drawable.trans4};

        Data[] transData = new Data[transNameArray.length];
        for (int i=0;i<transData.length;i++){
            transData[i] = new Data();
            transData[i].name = transNameArray[i];
            transData[i].photo = transPhotoIdArray[i];
        }

        MyAdapter transAdapter = new MyAdapter(transData,R.layout.trans_list);

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setAdapter(transAdapter);

        final String[] messageArray = new String[] {"訊息1","訊息2","訊息3","訊息4","訊息5","訊息6"};

        ArrayAdapter<String> messageAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,messageArray);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(messageAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openOptionsDialog(parent.getItemAtPosition(position).toString());
            }
        });

        String[] cubeeNameArray = new String[]{"哭哭","發抖","再見","生氣","昏倒","竊笑"
                ,"很棒","你好","驚嚇","大笑"};

        int[] cubeePhotoIdArray = new int[] {R.drawable.cubee1,R.drawable.cubee2
                ,R.drawable.cubee3,R.drawable.cubee4,R.drawable.cubee5,R.drawable.cubee6
                ,R.drawable.cubee7,R.drawable.cubee8,R.drawable.cubee9,R.drawable.cubee10
        };
        Data[] cubeeData = new Data[cubeeNameArray.length];
        for (int i=0;i<cubeeData.length;i++){
            cubeeData[i] = new Data();
            cubeeData[i].name = cubeeNameArray[i];
            cubeeData[i].photo = cubeePhotoIdArray[i];
        }

        MyAdapter cubeeAdapter = new MyAdapter(cubeeData,R.layout.cubee_list);

        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(cubeeAdapter);
        gridView.setNumColumns(3);

    }
    // 對話框所執行的 function
    private void openOptionsDialog(String xMessage) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setView(R.layout.all_announcement);
        dialog.setTitle("對話框的標題");
        // 承接傳過來的字串，顯示在對話框之中
        dialog.setMessage(xMessage);
        // 設定 PositiveButton 也就是一般 確定 或 OK 的按鈕
        dialog.setPositiveButton("確認", new DialogInterface.OnClickListener() {
            public void onClick( DialogInterface dialoginterface, int i) {
                // 當使用者按下確定鈕後所執行的動作
            }
        } );
        //設定 NegativeButton 也就是一般 取消 或 Cancel 的按鈕
        dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            public void onClick( DialogInterface dialoginterface, int i) {
                // 當使用者按下 取消鈕 後所執行的動作
                openOptionsDialog("你要按確定鈕才能結束唷");
            }
        });
        dialog.show();
    } //EOF openOptionsDialog
    public class  MyAdapter extends BaseAdapter {

        private  MainActivity.Data[] data;
        private int view;

        public  MyAdapter (MainActivity.Data[] data, int view){
            this.data = data;
            this.view = view;
        }

        @Override
        public  int getCount() {
            return data.length;
        }
        @Override
        public Object getItem(int position){
            return data[position];
        }
        @Override
        public long getItemId(int position){
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){


            convertView = getLayoutInflater().inflate(view,parent,false);
            TextView name = convertView.findViewById(R.id.name);
            name.setText(data[position].name);
            ImageView imageView = convertView.findViewById(R.id.imageView);
            imageView.setImageResource(data[position].photo);
            return convertView;
        }

    }
}
