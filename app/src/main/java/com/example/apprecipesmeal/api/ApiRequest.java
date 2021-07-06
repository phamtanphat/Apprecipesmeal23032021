package com.example.apprecipesmeal.api;

import com.example.apprecipesmeal.model.ApiResponse;
import com.example.apprecipesmeal.model.Meal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {

    @GET("apimeal/detail.php?id=2")
    Call<ApiResponse<Meal>> getDetailMeal();
}
