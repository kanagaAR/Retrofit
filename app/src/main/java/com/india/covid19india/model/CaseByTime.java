package com.india.covid19india.model;

public class CaseByTime {
    public final String dailyconfirmed;
    public final String dailydeceased;
    public final String dailyrecovered;
    public final String date;
    public final String totalconfirmed;
    public final String totaldeceased;
    public final String totalrecovered;

    public CaseByTime(String dailyconfirmed, String dailydeceased, String dailyrecovered, String date, String totalconfirmed, String totaldeceased, String totalrecovered) {
        this.dailyconfirmed = dailyconfirmed;
        this.dailydeceased = dailydeceased;
        this.dailyrecovered = dailyrecovered;
        this.date = date;
        this.totalconfirmed = totalconfirmed;
        this.totaldeceased = totaldeceased;
        this.totalrecovered = totalrecovered;
    }

    @Override
    public String toString() {
        return "CaseByTime{" +
                "dailyconfirmed='" + dailyconfirmed + '\'' +
                ", dailydeceased='" + dailydeceased + '\'' +
                ", dailyrecovered='" + dailyrecovered + '\'' +
                ", date='" + date + '\'' +
                ", totalconfirmed='" + totalconfirmed + '\'' +
                ", totaldeceased='" + totaldeceased + '\'' +
                ", totalrecovered='" + totalrecovered + '\'' +
                '}';
    }
}
