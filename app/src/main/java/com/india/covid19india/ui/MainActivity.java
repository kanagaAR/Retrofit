package com.india.covid19india.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.india.covid19india.R;
import com.india.covid19india.model.CaseByState;
import com.india.covid19india.model.State;
import com.india.covid19india.utils.Utils;
import com.india.covid19india.utils.ViewModelFactory;
import com.india.covid19india.viewmodel.MainViewModel;
import com.india.covid19india.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayAdapter<State> stateAdapter;
    private List<CaseByState> caseByStates;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainViewModel = new ViewModelProvider(this, new ViewModelFactory()).get(MainViewModel.class);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        stateAdapter = new ArrayAdapter<>(this, R.layout.spinner_text, Utils.getStates());
        stateAdapter.setDropDownViewResource(R.layout.spinner_dropdown_text);
        binding.ddState.setAdapter(stateAdapter);
        binding.ddState.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                State State = (State) parent.getSelectedItem();
                if (caseByStates != null) {
                    for (CaseByState caseByState : caseByStates) {
                        if (caseByState.statecode.equalsIgnoreCase(State.key)) {
                            setData(caseByState);
                        }
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        binding.tryAgain.setOnClickListener(v -> {
            getCovidDetail();
        });

        getCovidDetail();
    }

    private void getCovidDetail() {
        binding.failed.setVisibility(View.GONE);
        binding.data.setVisibility(View.GONE);
        binding.loading.setVisibility(View.VISIBLE);
        mainViewModel.getCovidDate()
                .observe(this, apiResponse -> {
                    if (apiResponse != null) {
                        caseByStates = apiResponse.getStatewise();
                        setData(caseByStates.get(0));
                        binding.loading.setVisibility(View.GONE);
                        binding.failed.setVisibility(View.GONE);
                        binding.data.setVisibility(View.VISIBLE);
                    } else {
                        binding.loading.setVisibility(View.GONE);
                        binding.data.setVisibility(View.GONE);
                        binding.failed.setVisibility(View.VISIBLE);
                    }
                });
    }

    private void setData(CaseByState data) {
        binding.date.setText("As on " + data.lastupdatedtime);
        binding.confirmed.setText(data.confirmed);
        binding.active.setText(data.active);
        binding.death.setText(data.deaths);
        binding.recovered.setText(data.recovered);
    }
}