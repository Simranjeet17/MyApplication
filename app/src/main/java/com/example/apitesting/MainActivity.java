package com.example.apitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   EditText email , password;
   Button login;
   ImageView Pbtn , facbtn, Gbtn;
   TextView register , forgot;
   final BottomSheetDialogFragment bottomSheetDialogFragment = new BottomsheetFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.passsword);
        login = findViewById(R.id.login1);
        Pbtn = findViewById(R.id.phonee);
        Gbtn = findViewById(R.id.google);
        facbtn = findViewById(R.id.facebookk);
        register = findViewById(R.id.text21);

         Pbtn.setOnClickListener(this);
         register.setOnClickListener(this);
         login.setOnClickListener(this);
         Gbtn.setOnClickListener(this);
         facbtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if( v == Pbtn){
            new BottomsheetFragment().show(getSupportFragmentManager(),"tag");
        }
        if(v == login){
            Intent intent = new Intent(MainActivity.this, homeActivity.class);
            startActivity(intent);
        }

        if( v == register){
            Toast.makeText(this, "Move to RegisterPage", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,RegisterActivity2.class);
            startActivity(intent);
        }
        if( v == Gbtn){
            Toast.makeText(this, "Move to Google page", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,GoogleActivity.class);
            startActivity(intent);
        }
        if(v == facbtn){
            Toast.makeText(this, "Move to Google page", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,FacebookActivity.class);
            startActivity(intent);

        }
    }
}