package com.example.lorrainegarcia.rein.Network;

import android.media.session.MediaSession;

import com.example.lorrainegarcia.rein.Token;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiBuilder {

    private static API api = null;

    private  static OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor(){
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request newRequest = chain.request().newBuilder()
                    .addHeader( "Authorization", "Bearer " + Token.share_value)
                    .build();
            return chain.proceed(newRequest);
        }
    }).build();


    private static API getAPIWH(){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-mm-dd HH:mm:ss").create();

        Retrofit.Builder builder = new Retrofit.Builder()
                .client(client)
                .baseUrl(api.base_url)
                .addConverterFactory(GsonConverterFactory.create(gson));

        Retrofit retrofit = builder.build();

        api = retrofit.create(API.class);
        return api;
    }

    private static API getAPI(){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-mm-dd HH:mm:ss").create();

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(api.base_url)
                .addConverterFactory(GsonConverterFactory.create(gson));

        Retrofit retrofits = builder.build();

        api = retrofits.create(API.class);

        return api;
    }
    public static API getApiObjects(){

        return (api != null

                ? api
                : getAPI());
    }
    public static API getApiObjectWH(){

        return (api != null
                ? api
                : getAPIWH());
    }
}
