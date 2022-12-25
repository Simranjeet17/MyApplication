package com.example.apitesting;

import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyView extends ViewModel {
    ApiInterface apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);

    private MutableLiveData<Root> mutableLiveData = new MutableLiveData<>();


    public LiveData<Root>Login(String phone){
        Call<Root>call = apiInterface.login_Api(phone);
        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                if(response != null){
                    mutableLiveData.postValue(response.body());
                }
                else{
                    mutableLiveData.postValue(null);
                }

            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                mutableLiveData.postValue(null);

            }
        }
       );
        return  mutableLiveData;
    }

    private MutableLiveData<Root>mutableLiveData2 = new MutableLiveData<>();

    public LiveData<Root>Register(String name, String email, String phone) {
        Call<Root> call = apiInterface.register_Api(name, email, phone);
        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                if (response != null) {
                    mutableLiveData2.postValue(response.body());
                }
                else {
                    mutableLiveData2.postValue(null);
                }
            }

            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                mutableLiveData2.postValue(null);
            }
        });
        return mutableLiveData2;
    }

    // get api
    private MutableLiveData<Modal>mutableLiveData3 = new MutableLiveData<>();

    public LiveData<Modal>data(){
        Call<Modal> call = apiInterface.get_data();
        call.enqueue(new Callback<Modal>() {
            @Override
            public void onResponse(Call<Modal> call, Response<Modal> response) {
                if(response != null){
                    mutableLiveData3.setValue(response.body());
                }
                else{
                    mutableLiveData3.setValue(null);
                }

            }

            @Override
            public void onFailure(Call<Modal> call, Throwable t) {
                mutableLiveData3.setValue(null);

            }
        });
        return mutableLiveData3;
    }
}
