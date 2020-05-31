package com.bi183.wardhiana.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit;
    public static final String BASE_URL = "https://wardhiana.000webhostapp.com/api-buku/api/"; //link untuk api buku
    public static final String IMAGE_URL = "https://wardhiana.000webhostapp.com/api-buku/images/"; //link untuk sampul buku

    public static Retrofit getRetrofitInstance(){
        if (retrofit==null){
            try {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        return retrofit;
    }
}