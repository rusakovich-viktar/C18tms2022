package Task1.model;//адрес(страна, город)

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Address {
    private String country;
    private String city;

    public String getCity() {
        return city;
    }
}
