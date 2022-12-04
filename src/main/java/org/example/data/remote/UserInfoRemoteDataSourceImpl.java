package org.example.data.remote;

import org.example.data.remote.api.ApiService;
import org.example.data.remote.dto.UserDto;

import java.io.IOException;

public class UserInfoRemoteDataSourceImpl implements UserInfoRemoteDataSource{
    private final ApiService apiService;

    public UserInfoRemoteDataSourceImpl(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public UserDto getInformation(String api) {
        UserDto dto = null;
        try {
            dto = apiService.getInformation(api).execute().body();
            return dto;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
