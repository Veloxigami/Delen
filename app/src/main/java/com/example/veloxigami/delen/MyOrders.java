package com.example.veloxigami.delen;

/**
 * Created by Anil on 18-08-2018.
 */

public class MyOrders {
    private String dateAndTime, orderNo, profession, status, cost, url;

    public MyOrders() {
    }

    public MyOrders(String dateAndTime, String orderNo, String profession, String status, String cost, String url) {
        this.dateAndTime = dateAndTime;
        this.orderNo = orderNo;
        this.profession = profession;
        this.status = status;
        this.cost = cost;
        this.url = url;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
