package com.example.lorrainegarcia.rein.Network;

import com.example.lorrainegarcia.rein.model.car;
import com.example.lorrainegarcia.rein.model.feedback;
import com.example.lorrainegarcia.rein.model.location;
import com.example.lorrainegarcia.rein.model.report;
import com.example.lorrainegarcia.rein.model.user;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface API {

    String base_url = "http://192.168.254.103/api/";

    @POST("register")
    Call<user> register (@Body  user user);

    @POST("login")
    Call<user> login (@Body user user);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("CreateCars")
    Call<car> click (@Header("Authorization")String value, @Body car Car);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("CreateReports")
    Call<report> submit(@Header("Authorization")String value, @Body report Report);


    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("CreateFeedback")
    Call<feedback> submit(@Header("Authorization")String value, @Body feedback Feedbacks);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("CreateLocation")
    Call<location> AddLocation(@Header("Authorization") String value, @Body location Locations);



    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("Transactions")
    Call<report> transaction(@Header("Authorization")String value,@Body report Report);


    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("token")
    Call<user> send( @Body user user);


    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("UpdateReport")
    Call<report> update(@Header("Authorization")String value,@Body report Report);

    @FormUrlEncoded
    @POST("ViewCars")
    Call<List<car>> Viewcar(@Header("Authorization")String value, @Field("userID") int userID);

}
