package com.example.a4th_year_mobile_timetable_application;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("/posts")
    Call<List<Posts>> getPosts();
}
