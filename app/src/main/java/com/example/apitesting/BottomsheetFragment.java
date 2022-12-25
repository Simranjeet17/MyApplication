package com.example.apitesting;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class BottomsheetFragment extends BottomSheetDialogFragment {
    EditText phonetext;
    Button submit;
    String phone;
    TextView text , text2;
    LottieAnimationView animationView, animationView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottomsheet, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        phonetext = view.findViewById(R.id.phonetext);
        submit = view.findViewById(R.id.submit);
        animationView = view.findViewById(R.id.animationView);
        animationView2 = view.findViewById(R.id.animationView2);
        text = view.findViewById(R.id.title);
        text2 = view.findViewById(R.id.title2);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 phone = phonetext.getText().toString().trim();

                if(phonetext.getText().toString().trim().isEmpty() || phone.length() ==0 || !phone.matches(getString(R.string.phoneExp)) ){
                    Toast.makeText(getContext(), "Enter the phone no", Toast.LENGTH_SHORT).show();
                    phonetext.setError("Please Enter Valid Phone Number!");
                    phonetext.requestFocus();
                }
                else {
                    info();



                }


            }

            private void info() {

                new MyView().Login(phone).observe(requireActivity(), new Observer<Root>() {
                    @Override
                    public void onChanged(Root root) {
                        if(root != null){

                            text.setVisibility(View.GONE);
                            animationView.setVisibility(View.GONE);
                            phonetext.setVisibility(View.GONE);
                            submit.setVisibility(View.GONE);

                            animationView2.setVisibility(View.VISIBLE);
                            text2.setText("Login Successfully!");
                            Toast.makeText(getContext(), ""+root.getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });


    }


}