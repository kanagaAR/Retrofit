package com.india.covid19india.model;

public class State {
    public final String key;
    public final String name;

    public State(String key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
