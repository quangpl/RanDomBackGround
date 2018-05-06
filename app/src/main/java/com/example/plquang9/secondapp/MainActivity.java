package com.example.plquang9.secondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
LinearLayout lin;
Switch s;
ArrayList<Integer> mang;
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lin=(LinearLayout) findViewById(R.id.linear);
     mang=new ArrayList<>();
     mang.add(R.drawable.a);
     mang.add(R.drawable.b);
     mang.add(R.drawable.c);
     mang.add(R.drawable.d);
     Random rd=new Random();
     int vt=rd.nextInt(mang.size());
     lin.setBackgroundResource(mang.get(vt));
     s=(Switch) findViewById(R.id.switch1);
     s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
         @Override
         public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
             if(isChecked)
                 Toast.makeText(MainActivity.this,"Đã bật WIFI",Toast.LENGTH_SHORT).show();
             Toast.makeText(MainActivity.this,"Đã tắt WIFI",Toast.LENGTH_SHORT).show();
         }
     });
    }
}
