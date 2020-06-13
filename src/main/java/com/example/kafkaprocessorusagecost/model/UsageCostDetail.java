package com.example.kafkaprocessorusagecost.model;

public class UsageCostDetail {

    private String userId;
    private double dataCost;
    private double callCost;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getDataCost() {
        return dataCost;
    }

    public void setDataCost(double dataCost) {
        this.dataCost = dataCost;
    }

    public double getCallCost() {
        return callCost;
    }

    public void setCallCost(double callCost) {
        this.callCost = callCost;
    }
}
