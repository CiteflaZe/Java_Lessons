package consoleAplication.repository;


import consoleAplication.domain.User;

import java.util.List;
import java.util.Optional;

//CRUD
//хранит данные

public interface UserRepository {
    User save(User user);

    Optional<User> findById(Long id);

    User update(Long id, User user);

    Optional<User> deleteById(Long id);

    List<User> getAll();

    Optional<User> findByEmail(String email);


}
