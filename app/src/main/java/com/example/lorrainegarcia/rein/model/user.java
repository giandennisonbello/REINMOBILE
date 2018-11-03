package com.example.lorrainegarcia.rein.model;

import org.w3c.dom.Text;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;

public class user {

    private int id;
    private int UserTypeID;

    private String LastName;
    private String FirstName;
    private String MobileNo;
    private String BirthDay;
    private String Address;
    private String City;
    private String ZipCode;

    private String Email;
    private String password;
    private String CPassword;
    private String Status;
    private String token;
    private Timestamp DateCreated;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserTypeID() {
        return UserTypeID;
    }

    public void setUserTypeID(int userTypeID) {
        UserTypeID = userTypeID;
    }



    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCPassword() {
        return CPassword;
    }

    public void setCPassword(String CPassword) {
        this.CPassword = CPassword;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Timestamp getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        DateCreated = dateCreated;
    }

    public user(int userTypeID, String lastName, String firstName, String mobileNo, String birthDay, String address, String city, String zipCode, String email, String password, String CPassword, String status) {
        UserTypeID = userTypeID;
        LastName = lastName;
        FirstName = firstName;
        MobileNo = mobileNo;
        BirthDay = birthDay;
        Address = address;
        City = city;
        ZipCode = zipCode;
        Email = email;
        this.password = password;
        this.CPassword = CPassword;
        Status = status;
    }

    public user(String email, String password) {
        this.Email = email;
        this.password = password;
   }

    public user(int id, String token) {
        this.token = token;
        this.id = id;
    }

    public user(int id) {
        this.id = id;
    }
}
