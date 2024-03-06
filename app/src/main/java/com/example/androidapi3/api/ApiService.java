package com.example.androidapi3.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    @POST("service_XD/service.svc/GetSessionId")
    Call<ResponseBody> loginUser(@Query("Uid") String uid, @Query("p") String password);
}

