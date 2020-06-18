package com.india.covid19india.repository;

import androidx.lifecycle.MutableLiveData;

import com.india.covid19india.api.APIClient;
import com.india.covid19india.api.APIService;
import com.india.covid19india.model.APIResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainRepository {
    private APIService apiService;
    private static MainRepository mainRepository;

    public static MainRepository getInstance() {
        if (mainRepository == null) {
            mainRepository = new MainRepository();
        }
        return mainRepository;
    }

    public MutableLiveData<APIResponse> getCovidDate() {
        MutableLiveData<APIResponse> liveData = new MutableLiveData<>();
        Call<APIResponse> call = APIClient.getAPIService().getCovid19Response();
        call.enqueue(new Callback<APIResponse>() {
            @Override
            public void onResponse(Call<APIResponse> call, Response<APIResponse> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        liveData.setValue(response.body());
                    }
                } else {
                    liveData.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<APIResponse> call, Throwable t) {
                liveData.setValue(null);
            }
        });
        return liveData;
    }

}
