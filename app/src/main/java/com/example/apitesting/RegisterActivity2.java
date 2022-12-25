package com.example.apitesting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity2 extends AppCompatActivity implements View.OnClickListener {
    TextView signin;
    EditText emailtxt , phonetxt, usernametxt;
    String email , phone, name;
    Button Register;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        signin = findViewById(R.id.bottomtext);
        emailtxt = findViewById(R.id.email);
        phonetxt = findViewById(R.id.phone);
        usernametxt = findViewById(R.id.username);
        aSwitch = findViewById(R.id.swwjw);


        Register = findViewById(R.id.register12);
        signin.setOnClickListener(this);
        Register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if( v == signin){
            Toast.makeText(this, "Move to Sign in page", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(RegisterActivity2.this , MainActivity.class);
            startActivity(intent);
        }

        if( v == Register){
            name = usernametxt.getText().toString().trim();
            email = emailtxt.getText().toString().trim();
            phone = phonetxt.getText().toString().trim();

            if (usernametxt.getText().toString().trim().isEmpty() || name.length() == 0) {
                Toast.makeText(getApplicationContext(), "Enter the username", Toast.LENGTH_SHORT).show();
                usernametxt.setError("Enter the Username");
                usernametxt.requestFocus();
            }
            if (emailtxt.getText().toString().trim().isEmpty() || email.length() == 0 || !email.matches(getString(R.string.emailpattern))) {
                emailtxt.setError("Enter the Email");
                emailtxt.requestFocus();
                Toast.makeText(getApplicationContext(), "Enter the email", Toast.LENGTH_SHORT).show();
            }
            else if (phonetxt.getText().toString().trim().isEmpty() || phone.length() == 0 || !phone.matches(getString(R.string.phoneExp))) {
                Toast.makeText(getApplicationContext(), "Enter the phone no", Toast.LENGTH_SHORT).show();
                phonetxt.setError("Enter the valid Phone ");
                phonetxt.requestFocus();
            }

            else if(!aSwitch.isChecked()){
                Toast.makeText(this, "Please accept terms and condition", Toast.LENGTH_SHORT).show();

            }
            else{
                data();
                new DialogFragment().show(getFragmentManager(),"Tag");


            }


        }

    }

    private void data() {
        new MyView().Register(name,email,phone).observe(this, new Observer<Root>() {
            @Override
            public void onChanged(Root root) {
                if(root != null){
                    Toast.makeText(RegisterActivity2.this, ""+root.getMessage(), Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}