package org.example.data.remote.dto;

import java.util.List;

public class TimezoneDto {
    private double offset;
    private List<String> description;

    public double getOffset() {
        return offset;
    }

    public List<String> getDescription() {
        return description;
    }
}
