package org.example.data.remote.mapper;

import org.example.data.remote.dto.UserDto;
import org.example.domain.entity.UserEntity;

public class UserMapper {
    public UserEntity map(UserDto dto){
        UserEntity entity = new UserEntity(dto.getGender(), dto.getNameDto().getTitle(),
                dto.getNameDto().getFirst(), dto.getNameDto().getLast(), dto.getStreetDto().get(0).getNumber(),
                dto.getStreetDto().get(0).getName(),dto.getLocationDto().get(0).getCity(),
                dto.getLocationDto().get(0).getState(),dto.getLocationDto().get(0).getCountry(),
                dto.getLocationDto().get(0).getPostcode(),dto.getLocationDto().get(0).getCoordinatesDto().getLatitude(),
                dto.getLocationDto().get(0).getCoordinatesDto().getLongitude(),
                dto.getLocationDto().get(0).getTimezoneDto().getOffset(),
                dto.getLocationDto().get(0).getTimezoneDto().getDescription(),
                dto.getEmail()
                );
        return entity;
    }
}
