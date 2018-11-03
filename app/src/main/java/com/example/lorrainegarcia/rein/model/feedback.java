package com.example.lorrainegarcia.rein.model;

import java.sql.Timestamp;

public class feedback {

    private String review;
    private Timestamp DateSubmitted;

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Timestamp getDateSubmitted() {
        return DateSubmitted;
    }

    public void setDateSubmitted(Timestamp dateSubmitted) {
        DateSubmitted = dateSubmitted;
    }

    public feedback(String review) {
        this.review = review;
    }
}



