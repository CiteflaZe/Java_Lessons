package lesson9.example2;

import lesson9.example2.domain.Address;
import lesson9.example2.domain.City;
import lesson9.example2.domain.User;
import lesson9.example2.entity.AddressEntity;
import lesson9.example2.entity.CityEntity;
import lesson9.example2.entity.UserEntity;

import java.util.Objects;
import java.util.Optional;

public class UserEntityMapper {
    User mapUserEntityToUser(UserEntity userEntity){
        if(Objects.isNull(userEntity)){
            return null;
        }
        AddressEntity addressEntity = userEntity.getAddressEntity();
        if(addressEntity == null){
            return new User(null);
        }
        CityEntity cityEntity = addressEntity.getCityEntity();
        if(cityEntity == null){
            return new User(new Address(null));
        }
        String name = cityEntity.getName();
        return new User(new Address(new City(name)));

    }

    public UserEntity mapUserToUserEntity(User user){
        String nameC =  Optional.ofNullable(user)
                .map(u->u.getAddress())
                .map(address->address.getCity())
                .map(city->city.getName())
                .orElse(null);

        return new UserEntity(new AddressEntity(new CityEntity(nameC)));
    }
}
