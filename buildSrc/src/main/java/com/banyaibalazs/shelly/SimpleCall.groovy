package com.banyaibalazs.shelly

import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback

public abstract class SimpleCall<T> implements Call<T> {

    @Override
    void enqueue(Callback<T> callback) {

    }

    @Override
    boolean isExecuted() {
        return false
    }

    @Override
    void cancel() {

    }

    @Override
    boolean isCanceled() {
        return false
    }

    @Override
    Call<T> clone() {
        return null
    }

    @Override
    Request request() {
        return null
    }
}
