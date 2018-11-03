package com.example.lorrainegarcia.rein.model;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;

public class car {

    @SerializedName("CarID")
    private int CarID;
    @SerializedName("userID")
    private int userID;
    @SerializedName("PlateNo")
    private String PlateNo;
    @SerializedName("CarType")
    private String CarType;
    @SerializedName("Color")
    private String Color;
    @SerializedName("Model")
    private String Model;
    @SerializedName("YearModel")
    private String YearModel;
    @SerializedName("Brand")
    private String Brand;
    @SerializedName("Battery")
    private String Battery;
    @SerializedName("Tire")
    private String Tire;
    @SerializedName("DateCreated")
    private Timestamp DateCreated;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCarID() {
        return CarID;
    }

    public void setCarID(int carID) {
        CarID = carID;
    }

    public String getPlateNo() {
        return PlateNo;
    }

    public void setPlateNo(String plateNo) {
        PlateNo = plateNo;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String carType) {
        CarType = carType;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getYearModel() {
        return YearModel;
    }

    public void setYearModel(String yearModel) {
        YearModel = yearModel;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getBattery() {
        return Battery;
    }

    public void setBattery(String battery) {
        Battery = battery;
    }

    public String getTire() {
        return Tire;
    }

    public void setTire(String tire) {
        Tire = tire;
    }

    public Timestamp getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        DateCreated = dateCreated;
    }

    public car(int userID, String plateNo, String carType, String color, String model, String yearModel, String brand, String battery, String tire) {
        this.userID = userID;
        PlateNo = plateNo;
        CarType = carType;
        Color = color;
        Model = model;
        YearModel = yearModel;
        Brand = brand;
        Battery = battery;
        Tire = tire;
    }

    public car(int userID) {
        this.userID = userID;
    }
}
