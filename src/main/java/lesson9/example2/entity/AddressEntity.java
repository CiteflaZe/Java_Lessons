package lesson9.example2.entity;

public class AddressEntity {
    private final CityEntity cityEntity;

    public AddressEntity(CityEntity cityEntity) {
        this.cityEntity = cityEntity;
    }

    public CityEntity getCityEntity() {
        return cityEntity;
    }
}
