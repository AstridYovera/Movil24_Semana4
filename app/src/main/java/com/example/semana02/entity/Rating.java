package com.example.semana02.entity;

import java.io.Serializable;

public class Rating implements Serializable {
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private double rate;
    private int count;
}
