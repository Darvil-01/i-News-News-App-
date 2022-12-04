package com.example.inews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splagActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splag);
        getSupportActionBar().hide();


        Thread thread= new Thread(){
            public void run(){
                try {
                    sleep(2000);

                }catch (Exception e){
                    e.printStackTrace();

                }finally {
                    Intent intent=new Intent(splagActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();
    }
}