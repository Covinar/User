package org.example.data.remote.repository;

import org.example.domain.entity.UserEntity;

public interface UserInfoRepository {
    UserEntity getInformation(String api);
}
