package com.example.apprecipesmeal.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.apprecipesmeal.R;
import com.example.apprecipesmeal.databinding.ActivityMainBinding;
import com.example.apprecipesmeal.model.Meal;
import com.example.apprecipesmeal.repository.MealRepository;
import com.example.apprecipesmeal.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding mMainBinding;
    MainViewModel mMainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mMainBinding.getRoot());


        mMainViewModel = new ViewModelProvider(this, new ViewModelProvider.Factory() {
            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                if (modelClass == MainViewModel.class){
                    return (T) new MainViewModel(new MealRepository());
                }
               return null;
            }
        }).get(MainViewModel.class);

        mMainViewModel.getMeal().observe(this, new Observer<Meal>() {
            @Override
            public void onChanged(Meal meal) {
                Log.d("BBB",meal.toString());
            }
        });

        mMainViewModel.getDetailMeal();

    }
}