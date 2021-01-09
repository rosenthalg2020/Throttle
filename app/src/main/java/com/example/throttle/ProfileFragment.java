package com.example.throttle;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class ProfileFragment extends Fragment {




    //take settings button to SettingsPage
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstance){


        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        Button settingsBtn = (Button)v.findViewById(R.id.p_settingsBtn);
        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),SettingsPage.class);
                startActivity(intent);
            }
        });
        return v;



    }



}

