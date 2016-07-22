package com.zyuternity.demosourcetree;

import java.util.List;

/**
 * Created by ZYuTernity on 7/22/2016.
 */
public class JSONCustomerHistoryItem {
    private String billCreatedTime;
    private String stylistName;
    private String skinnerName;
    private String rating;
    private List<JSONCustomerHistoryService> services;

    public String getBillCreatedTime() {
        return billCreatedTime;
    }

    public void setBillCreatedTime(String billCreatedTime) {
        this.billCreatedTime = billCreatedTime;
    }

    public String getStylistName() {
        return stylistName;
    }

    public void setStylistName(String stylistName) {
        this.stylistName = stylistName;
    }

    public String getSkinnerName() {
        return skinnerName;
    }

    public void setSkinnerName(String skinnerName) {
        this.skinnerName = skinnerName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public List<JSONCustomerHistoryService> getServices() {
        return services;
    }

    public void setServices(List<JSONCustomerHistoryService> services) {
        this.services = services;
    }
}
