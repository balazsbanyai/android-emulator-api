package com.banyaibalazs.shelly;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ShellyService {

    @GET("call/{number}")
    Call<Void> call(@Path("number") String number);
}
