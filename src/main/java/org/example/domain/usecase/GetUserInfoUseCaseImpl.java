package org.example.domain.usecase;

import org.example.data.remote.repository.UserInfoRepository;
import org.example.domain.entity.UserEntity;

public class GetUserInfoUseCaseImpl implements GetUserInfoUseCase{
    private final UserInfoRepository repository;

    public GetUserInfoUseCaseImpl(UserInfoRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserEntity getInformation(String api) {
        return repository.getInformation(api);
    }
}
