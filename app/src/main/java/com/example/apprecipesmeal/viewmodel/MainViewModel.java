package com.example.apprecipesmeal.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.apprecipesmeal.model.ApiResponse;
import com.example.apprecipesmeal.model.Meal;
import com.example.apprecipesmeal.repository.MealRepository;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {
    private MealRepository mealRepository;
    private MutableLiveData<Meal> dataDetailMeal;

    public MainViewModel(MealRepository mealRepository){
        this.mealRepository = mealRepository;
    }

    public void getDetailMeal(){
        mealRepository
                .getDetailMeal()
                .enqueue(new Callback<ApiResponse<Meal>>() {
                    @Override
                    public void onResponse(Call<ApiResponse<Meal>> call, Response<ApiResponse<Meal>> response) {
                        ApiResponse<Meal> result = response.body();
                        if (result.data != null){
                            dataDetailMeal.setValue(result.data);
                        }
                    }

                    @Override
                    public void onFailure(Call<ApiResponse<Meal>> call, Throwable t) {

                    }
                });
    }

}