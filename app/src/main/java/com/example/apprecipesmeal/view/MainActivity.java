package com.example.apprecipesmeal.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.example.apprecipesmeal.R;
import com.example.apprecipesmeal.databinding.ActivityMainBinding;
import com.example.apprecipesmeal.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding mMainBinding;
    MainViewModel mMainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mMainBinding.getRoot());

        mMainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

    }
}