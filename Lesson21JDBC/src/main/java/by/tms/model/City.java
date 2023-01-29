package by.tms.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class City {
    private Long cityId;
    private String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public City(Long cityId) {
        this.cityId = cityId;
    }
}

