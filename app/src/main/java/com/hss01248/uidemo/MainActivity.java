package com.hss01248.uidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.hss01248.ui.pop.list.PopList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPop = findViewById(R.id.btn_pop);
    }

    public void poplist(View view) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add("test pop-"+i);
        }
        PopList.showPop(this, btnPop.getMeasuredWidth(), btnPop, list, new PopList.OnItemClickListener() {
            @Override
            public void onClick(int position, String str) {
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
            }
        });

    }
}