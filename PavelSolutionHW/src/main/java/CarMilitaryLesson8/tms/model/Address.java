package CarMilitaryLesson8.tms.model;

public class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public Address(String city) {
        this.city = city;
    }
}
