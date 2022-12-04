package org.example.domain.usecase;

import org.example.domain.entity.UserEntity;

public interface GetUserInfoUseCase {
    UserEntity getInformation(String api);
}
