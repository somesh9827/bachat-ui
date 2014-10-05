package com.bachat.models;

import java.sql.Time;
import java.util.List;

/**
 * Created by somesh.shrivastava on 05/10/14.
 */
public class Shop {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCordinate() {
        return cordinate;
    }

    public void setCordinate(String cordinate) {
        this.cordinate = cordinate;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getShopCategory() {
        return ShopCategory;
    }

    public void setShopCategory(String shopCategory) {
        ShopCategory = shopCategory;
    }

    public Time getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(Time openingTime) {
        this.openingTime = openingTime;
    }

    public Time getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(Time closingTime) {
        this.closingTime = closingTime;
    }

    public List<Days> getClosingDays() {
        return closingDays;
    }

    public void setClosingDays(List<Days> closingDays) {
        this.closingDays = closingDays;
    }

    private int id;
    private String ShopName;
    private String Address;
    private String cordinate;
    private int ownerId;
    private String ShopCategory;
    private Time openingTime;
    private Time closingTime;
    private List<Days> closingDays;
}
