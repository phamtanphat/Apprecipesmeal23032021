package com.example.apprecipesmeal.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.apprecipesmeal.R;
import com.example.apprecipesmeal.databinding.ActivityMainBinding;
import com.example.apprecipesmeal.model.Meal;
import com.example.apprecipesmeal.repository.MealRepository;
import com.example.apprecipesmeal.viewmodel.MainViewModel;

import java.util.Objects;

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
                mMainBinding.textViewNameMeal.setText(meal.getName());
                mMainBinding.textViewKCalCalories.setText(meal.getCalo());
                mMainBinding.textViewGamCarBo.setText(meal.getCarbo());
                mMainBinding.textViewGamProtein.setText(meal.getProtein());
                mMainBinding.textViewContentIngredients.setText(meal.getIngredient().replace("\\r\\n","\r\n"));
                mMainBinding.textViewContentRecipePreparation.setText(meal.getInstruction().replace("\\\\r\\\\n","\r\n"));
                Glide.with(MainActivity.this)
                        .load("https://phatdroid94.000webhostapp.com/" + meal.getImage())
                        .into(mMainBinding.circleImage);
            }
        });

        mMainViewModel.getDetailMeal();

    }
}