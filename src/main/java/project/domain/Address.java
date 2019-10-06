package project.domain;
import project.Menu;

import java.util.Objects;

public class Address {
    private final String city;
    private final String streetName;
    private final Integer houseNumber;
    private final Integer apartmentNumber;

    public Address(String city, String streetName, Integer houseNumber, Integer apartmentNumber) {
        this.city = city;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreetName() {
        return streetName;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public Integer getApartmentNumber() {
        return apartmentNumber;
    }

    @Override
    public String toString() {
        if (Objects.isNull(apartmentNumber)) {
            return "{" + city + " " + houseNumber + " " + streetName + "}";
        } else {
            return "{" + city + " " + houseNumber + " " + streetName + Menu.bundle.getString("address.apartment") + " " + apartmentNumber + "}";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(streetName, address.streetName) &&
                Objects.equals(houseNumber, address.houseNumber) &&
                Objects.equals(apartmentNumber, address.apartmentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, streetName, houseNumber, apartmentNumber);
    }
}
