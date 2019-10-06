package lesson9.example2.domain;

public class Address {
    private final City city;

    public Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}
