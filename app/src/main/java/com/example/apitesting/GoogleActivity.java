package com.example.apitesting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoogleActivity extends AppCompatActivity implements View.OnClickListener{
    // create new instance of localBroadcastManager

    EditText phone;
    Button senddata;
    String data;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        phone = findViewById(R.id.editTextPhone );
        senddata = findViewById(R.id.button);
        // need activity
        senddata.setOnClickListener(this);
        phone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if( v == senddata){
            String data = phone.getText().toString().trim();
            Intent intent = new Intent(GoogleActivity.this, GoogleActivity2.class);

            intent.setAction("com.example.broadcast.MY_NOTIFICATION");
            intent.putExtra("data",data);
            this.sendBroadcast(intent);
            startActivity(intent);

        }

    }
}