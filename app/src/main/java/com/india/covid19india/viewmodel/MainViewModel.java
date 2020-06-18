package com.india.covid19india.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.india.covid19india.model.APIResponse;
import com.india.covid19india.repository.MainRepository;

public class MainViewModel extends ViewModel {
    private MainRepository mainRepository;

    public MainViewModel() {
        mainRepository = MainRepository.getInstance();
    }

    public LiveData<APIResponse> getCovidDate() {
        return mainRepository.getCovidDate();
    }
}
