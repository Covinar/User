package org.example.presentation;

import org.example.domain.usecase.GetUserInfoUseCase;

public class UserScreen {
    private final GetUserInfoUseCase useCase;

    public UserScreen(GetUserInfoUseCase useCase) {
        this.useCase = useCase;
    }
    public void start(){
        System.out.println(useCase.getInformation("api"));
    }
}
