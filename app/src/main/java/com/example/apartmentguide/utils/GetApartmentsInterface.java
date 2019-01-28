package com.example.apartmentguide.utils;

import com.example.apartmentguide.models.ApartmentBuilding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface GetApartmentsInterface {
    @GET("/michaelzyc9/ApartmentGuide/master/app/src/main/apartments.json")
    Call<List<ApartmentBuilding>> getApartments();
}