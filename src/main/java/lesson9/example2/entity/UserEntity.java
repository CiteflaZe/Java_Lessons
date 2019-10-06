package lesson9.example2.entity;

public class UserEntity {
    private final AddressEntity addressEntity;

    public UserEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }
}
