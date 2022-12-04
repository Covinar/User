package org.example.data.remote.repository;

import org.example.data.remote.UserInfoRemoteDataSource;
import org.example.data.remote.dto.UserDto;
import org.example.data.remote.mapper.UserMapper;
import org.example.domain.entity.UserEntity;

public class UserInfoRepositoryImpl implements UserInfoRepository{
    private final UserInfoRemoteDataSource remoteDataSource;
    private final UserMapper mapper;

    public UserInfoRepositoryImpl(UserInfoRemoteDataSource remoteDataSource, UserMapper mapper) {
        this.remoteDataSource = remoteDataSource;
        this.mapper = mapper;
    }

    @Override
    public UserEntity getInformation(String api) {
        UserDto dto = remoteDataSource.getInformation(api);
        return mapper.map(dto);
    }
}
