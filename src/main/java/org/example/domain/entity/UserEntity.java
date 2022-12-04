package org.example.domain.entity;

import java.util.List;

public class UserEntity {
    private final String gender;
    private final String title;
    private final String first;
    private final String last;
    private final int number;
    private final String name;
    private final String city;
    private final String state;
    private final String country;
    private final int postcode;
    private final double latitude;
    private final double longitude;
    private final double offset;
    private final List<String> description;
    private final String email;

    public UserEntity(String gender, String title,
                      String first, String last, int number,
                      String name, String city, String state,
                      String country, int postcode, double latitude,
                      double longitude, double offset,
                      List<String> description, String email) {
        this.gender = gender;
        this.title = title;
        this.first = first;
        this.last = last;
        this.number = number;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postcode = postcode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.offset = offset;
        this.description = description;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "gender='" + gender + '\'' +
                ", title='" + title + '\'' +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postcode=" + postcode +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", offset=" + offset +
                ", description=" + description +
                ", email='" + email + '\'' +
                '}';
    }
}
