package org.example.data.remote.dto;

public class LocationDto {
    private StreetDto streetDto = new StreetDto();
    private TimezoneDto timezoneDto = new TimezoneDto();
    private CoordinatesDto coordinatesDto =new CoordinatesDto();
    private String city;
    private String state;
    private String country;
    private int postcode;

    public StreetDto getStreetDto() {
        return streetDto;
    }

    public TimezoneDto getTimezoneDto() {
        return timezoneDto;
    }

    public CoordinatesDto getCoordinatesDto() {
        return coordinatesDto;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getPostcode() {
        return postcode;
    }
}
