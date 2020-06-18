package com.india.covid19india.api;

import com.india.covid19india.model.APIResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("data.json")
    Call<APIResponse> getCovid19Response();
}
