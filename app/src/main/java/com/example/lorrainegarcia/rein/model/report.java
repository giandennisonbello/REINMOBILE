package com.example.lorrainegarcia.rein.model;

import java.sql.Date;
import java.sql.Timestamp;


public class report {

    private String ID;

    private String partner;

    private int userID;
    private String assistant;
    private String instruction;
    private String servicetype;
    private String image;
    private Double Lat;
    private Double Lon;
    private String comment;
    private String addcharge;
    private String totalservice;
    private String status;

    private Timestamp DateSubmitted;
    private Timestamp DateUpdated;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }


    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getLat() {
        return Lat;
    }

    public void setLat(Double lat) {
        Lat = lat;
    }

    public Double getLon() {
        return Lon;
    }

    public void setLon(Double lon) {
        Lon = lon;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAddcharge() {
        return addcharge;
    }

    public void setAddcharge(String addcharge) {
        this.addcharge = addcharge;
    }

    public String getTotalservice() {
        return totalservice;
    }

    public void setTotalservice(String totalservice) {
        this.totalservice = totalservice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getDateSubmitted() {
        return DateSubmitted;
    }

    public void setDateSubmitted(Timestamp dateSubmitted) {
        DateSubmitted = dateSubmitted;
    }

    public Timestamp getDateUpdated() {
        return DateUpdated;
    }

    public void setDateUpdated(Timestamp dateUpdated) {
        DateUpdated = dateUpdated;
    }

    public report(int userID,String partner, String assistant, String servicetype, String image,  String comment, String addcharge, String totalservice, String status) {
        this.userID = userID;
        this.partner = partner;
        this.assistant = assistant;
        this.servicetype = servicetype;
        this.image = image;
        this.comment = comment;
        this.addcharge = addcharge;
        this.totalservice = totalservice;
        this.status = status;
    }

    public report(int userID,String instruction, String servicetype, Double lat, Double lon, String totalservice, String status) {
        this.userID = userID;
        this.instruction = instruction;
        this.servicetype = servicetype;
        Lat = lat;
        Lon = lon;
        this.totalservice = totalservice;
        this.status = status;
    }

    public report(String ID) {
        this.ID = ID;
    }

    public report(String ID,String servicetype, String addcharge, String totalservice, String status) {
        this.ID = ID;
        this.servicetype = servicetype;
        this.addcharge = addcharge;
        this.totalservice = totalservice;
        this.status = status;
    }


}



