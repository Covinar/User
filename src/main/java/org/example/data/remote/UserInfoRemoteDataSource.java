package org.example.data.remote;

import org.example.data.remote.dto.UserDto;

public interface UserInfoRemoteDataSource {
    UserDto getInformation(String api);
}
