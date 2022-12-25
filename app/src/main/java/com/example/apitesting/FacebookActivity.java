package com.example.apitesting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Notification;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class FacebookActivity extends AppCompatActivity {
    BottomNavigationView Bottom_nav;
    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction ft = fm.beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        Bottom_nav = findViewById(R.id.bottom_navigation);
        Bottom_nav.setOnItemSelectedListener(Bottom_listener);
        Bottom_nav.setOnItemReselectedListener(listener);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.mainframe,new HomeFragment()).addToBackStack("hello").commit();
        }
    }

    NavigationBarView.OnItemSelectedListener Bottom_listener = new NavigationBarView.OnItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.home1:
                    Toast.makeText(FacebookActivity.this, "home", Toast.LENGTH_SHORT).show();
                    result(new HomeFragment());
                    break;

                case R.id.category:
                    Toast.makeText(FacebookActivity.this, "category", Toast.LENGTH_SHORT).show();
                    result(new CategoryFragment());
                    break;

                case R.id.notification:
                    Toast.makeText(FacebookActivity.this, "notification", Toast.LENGTH_SHORT).show();
                    result(new NotificationFragment());
                    break;


                case R.id.account:
                    Toast.makeText(FacebookActivity.this, "account", Toast.LENGTH_SHORT).show();
                    result(new AccountFragment());
                    break;

                case R.id.cart:
                    Toast.makeText(FacebookActivity.this, "cart", Toast.LENGTH_SHORT).show();
                    result(new CartFragment());
                    break;
            }
            return true;
        }
    };

    void result(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.mainframe, fragment).addToBackStack(null).commit();
    }

    NavigationBarView.OnItemReselectedListener listener = new NavigationBarView.OnItemReselectedListener() {
        @Override
        public void onNavigationItemReselected(@NonNull MenuItem item) {
           switch(item.getItemId()){
               case R.id.home1:

                   fm.popBackStack("Root",FragmentManager.POP_BACK_STACK_INCLUSIVE);
                   break;
           }

        }
    };

}