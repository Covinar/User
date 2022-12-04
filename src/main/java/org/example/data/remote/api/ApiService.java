package org.example.data.remote.api;

import org.example.data.remote.dto.UserDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("/{api}")
    Call<UserDto> getInformation(@Path(value = "api", encoded = true) String api);}
