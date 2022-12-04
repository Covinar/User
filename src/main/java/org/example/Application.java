package org.example;

import org.example.data.remote.UserInfoRemoteDataSource;
import org.example.data.remote.UserInfoRemoteDataSourceImpl;
import org.example.data.remote.api.ApiService;
import org.example.data.remote.api.RetrofitClient;
import org.example.data.remote.mapper.UserMapper;
import org.example.data.remote.repository.UserInfoRepository;
import org.example.data.remote.repository.UserInfoRepositoryImpl;
import org.example.domain.usecase.GetUserInfoUseCase;
import org.example.domain.usecase.GetUserInfoUseCaseImpl;
import org.example.presentation.UserScreen;

public class Application {
    public static void main(String[] args) {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        UserMapper mapper = new UserMapper();
        UserInfoRemoteDataSource dataSource = new UserInfoRemoteDataSourceImpl(apiService);
        UserInfoRepository repository = new UserInfoRepositoryImpl(dataSource,mapper);
        GetUserInfoUseCase useCase = new GetUserInfoUseCaseImpl(repository);
        UserScreen userScreen = new UserScreen(useCase);
        userScreen.start();
    }
}