package com.example.apitesting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class GoogleActivity2 extends AppCompatActivity {
    TextView text;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google2);
        text = findViewById(R.id.te2);


    }

    @Override
    protected void onResume() {
        super.onResume();
        this.registerReceiver(receiver,new IntentFilter("com.example.broadcast.MY_NOTIFICATION"));
    }

    BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String data = intent.getStringExtra("data");
            Toast.makeText(context, "" + data, Toast.LENGTH_SHORT).show();

        }
    };

        @Override
        protected void onPause() {
            super.onPause();
            this.unregisterReceiver(receiver);
        }

}











