package com.india.covid19india.model;


import java.util.List;

public class APIResponse {
    private List<CaseByTime> cases_time_series;
    private List<CaseByState> statewise;
    private List<Tested> tested;

    public APIResponse(List<CaseByTime> cases_time_series, List<CaseByState> statewise, List<Tested> tested) {
        this.cases_time_series = cases_time_series;
        this.statewise = statewise;
        this.tested = tested;
    }

    public List<CaseByTime> getCases_time_series() {
        return cases_time_series;
    }

    public List<CaseByState> getStatewise() {
        return statewise;
    }

    public List<Tested> getTested() {
        return tested;
    }

    @Override
    public String toString() {
        return "APIResponse{" +
                "cases_time_series=" + cases_time_series +
                ", statewise=" + statewise +
                ", tested=" + tested +
                '}';
    }
}
