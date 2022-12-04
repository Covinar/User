package org.example.data.remote.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
    private String gender;
    private NameDto nameDto = new NameDto();
    private List<StreetDto> street = new ArrayList<>();
    private List<LocationDto> location = new ArrayList<>();
    private  String email;

    public NameDto getNameDto() {
        return nameDto;
    }

    public String getGender() {
        return gender;
    }

    public List<StreetDto> getStreetDto() {
        return street;
    }

    public List<LocationDto> getLocationDto() {
        return location;
    }

    public String getEmail() {
        return email;
    }
}
