package hometask4.remake.domain;

import java.util.Objects;

public class Address {
    private final String streetName;
    private final Integer houseNumber;
    private final Integer apartmentNumber;

    public Address(String streetName, Integer houseNumber, Integer apartmentNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
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
            return "{" + houseNumber + streetName + "}";
        } else {
            return "{" + houseNumber + streetName + ", Apt " + apartmentNumber + "}";
        }
    }
}
