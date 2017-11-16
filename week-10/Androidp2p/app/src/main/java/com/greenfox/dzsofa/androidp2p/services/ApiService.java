package com.greenfox.dzsofa.androidp2p.services;

import com.greenfox.dzsofa.androidp2p.models.Message;
import com.greenfox.dzsofa.androidp2p.models.MessageResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by dzsofa on 2017.11.16..
 */

public interface ApiService {
    @GET("/api/messages")
    Call<MessageResponse> getMessages();

    @POST("/api/messages")
    Call<StatusResponse> postMessage(@Body Message message);
}