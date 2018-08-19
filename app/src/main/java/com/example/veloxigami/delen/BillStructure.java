package com.example.veloxigami.delen;

/**
 * Created by Anil on 19-08-2018.
 */

public class BillStructure {
    private String profession, imgurl, address, status,
            dateAndTime, rate, tax_sgst, tax_cgst, discount, grand_total,
            start_time, end_time, total_time, payment_status, job_info, place;

    public BillStructure() {
    }

    public BillStructure(String profession, String imgurl, String address, String jobstatus, String dateAndTime,
                         String rate, String tax_sgst, String tax_cgst, String discount, String grand_total,
                         String start_time, String end_time, String total_time, String payment_status, String job_info, String place) {
        this.profession = profession;
        this.imgurl = imgurl;
        this.address = address;
        this.status = jobstatus;
        this.dateAndTime = dateAndTime;
        this.rate = rate;
        this.tax_sgst = tax_sgst;
        this.tax_cgst = tax_cgst;
        this.discount = discount;
        this.grand_total = grand_total;
        this.start_time = start_time;
        this.end_time = end_time;
        this.total_time = total_time;
        this.payment_status = payment_status;
        this.job_info = job_info;
        this.place = place;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTax_sgst() {
        return tax_sgst;
    }

    public void setTax_sgst(String tax_sgst) {
        this.tax_sgst = tax_sgst;
    }

    public String getTax_cgst() {
        return tax_cgst;
    }

    public void setTax_cgst(String tax_cgst) {
        this.tax_cgst = tax_cgst;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getGrand_total() {
        return grand_total;
    }

    public void setGrand_total(String grand_total) {
        this.grand_total = grand_total;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getTotal_time() {
        return total_time;
    }

    public void setTotal_time(String total_time) {
        this.total_time = total_time;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public String getJob_info() {
        return job_info;
    }

    public void setJob_info(String job_info) {
        this.job_info = job_info;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
