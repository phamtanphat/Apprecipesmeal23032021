package com.example.apprecipesmeal.repository;

import com.example.apprecipesmeal.api.ApiRequest;
import com.example.apprecipesmeal.api.RetrofitClient;
import com.example.apprecipesmeal.model.ApiResponse;
import com.example.apprecipesmeal.model.Meal;

import retrofit2.Call;

public class MealRepository {
    private ApiRequest apiRequest;

    public MealRepository(){
        apiRequest = RetrofitClient.getInstance().getApiRequest();
    }

    public Call<ApiResponse<Meal>> getDetailMeal(){
        return apiRequest.getDetailMeal();
    }
}
