package hometask11.service;

import hometask11.domain.User;
import hometask11.exception.EntityNotFoundRuntimeException;
import hometask11.exception.ServerErrorRuntimeException;

import java.util.Objects;

public class UserServiceImpl implements UserService {
    @Override
    public User findById(Long id) {
        if(Objects.isNull(id)){
            throw new ServerErrorRuntimeException("Id was null which caused server error 500");
        }
        if (id == 1) {
            return new User();
        }
        throw new EntityNotFoundRuntimeException("User with such id was not found 404");
    }
}
