package by.tms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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