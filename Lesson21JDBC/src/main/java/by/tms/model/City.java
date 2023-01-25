package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class City {
    private Long id;
    private String name;

    public City(String name) {
        this.name = name;
    }
}

