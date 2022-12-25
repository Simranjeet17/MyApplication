package com.example.apitesting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class homeActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Myadapter myadapter;
    List<Modal.PostAllDatum> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recyclerview);

        ApiInterface apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);

        Call<Modal>call = apiInterface.get_data();

        call.enqueue(new Callback<Modal>() {
            @Override
            public void onResponse(Call<Modal> call, Response<Modal> response) {
                if( response != null){
                    Toast.makeText(homeActivity.this, ""+response.body().getMessage(), Toast.LENGTH_SHORT).show();
                   list.addAll(response.body().getPostAllData());
                   myadapter = new Myadapter(list,getApplicationContext());
                   recyclerView.setAdapter(myadapter);
                }

            }

            @Override
            public void onFailure(Call<Modal> call, Throwable t) {
                Toast.makeText(homeActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}