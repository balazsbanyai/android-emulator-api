package com.banyaibalazs.shelly;

import java.io.IOException;

import okhttp3.HttpUrl;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 * Created by bbanyai on 19/11/16.
 */
public class ShellyImpl implements Shelly {

    /**
     * in the android emulator 10.0.2.2 points to the host machine
     * */
    public static final String HOST_OF_EMULATOR = "10.0.2.2";

    @Override
    public void connect() {

    }

    @Override
    public void callMe(String number) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(new HttpUrl.Builder()
                        .port(5656)
                        .host(HOST_OF_EMULATOR)
                        .scheme("http")
                        .build())
                .build();

        ShellyService service = retrofit.create(ShellyService.class);

        Call<Void> call = service.call(number);
        try {
            call.execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
