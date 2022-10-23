package com.example.gmailapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] Mail_Baslik = {"   Google Maps Timeline","   Google Maps Timeline","   Google Maps Timeline","   Google Maps Timeline","   Google Photos","   GAMEPLUS","   Twitch"};
    private String[] Mail_Konu = {" Test YK, Mart Ayı Özetiniz"," Test YK, Şubat Ayı Özetiniz"," Test YK, Ocak Ayı Özetiniz"," Test YK, 2020 yılına ait güncellemeler..."," Google Fotoğraflar deposu..."," Son 1 Hafta!"," Yayın özetiniz hazır"};
    private String[] Mail = {"Bu zaman çizelgesi e-postası...","Bu zaman çizelgesi e-postası...","Bu zaman çizelgesi e-postası...","COVID-19 nedeniyle 2020...","Merhaba Fotoğraflar Logosu için","Sevgili Üyemiz..","Sevgili Üyemiz..","Yayın Süresi 4s 18d Maks. İzleyici 2.147"};
    public TextView textview;
    public TextView textview2;
    public TextView textview3;
    public ListView myListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.textView);
        textview2 = findViewById(R.id.textView2);
        textview3 = findViewById(R.id.textView3);
        myListView = findViewById(R.id.myListView);
        myListView.setAdapter(new BaseAdapter() {

            @Override
            public int getCount() {
                return Mail_Baslik.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null){
                    convertView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.items,parent,false);
                }


                TextView textView = convertView.findViewById(R.id.textView);
                textView.setText(Mail_Baslik[position]);

                TextView textView2 = convertView.findViewById(R.id.textView2);
                textView2.setText(Mail_Konu[position]);

                TextView textView3 = convertView.findViewById(R.id.textView3);
                textView3.setText(Mail[position]);
                return convertView;
            }
        });
    }

}