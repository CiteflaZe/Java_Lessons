package lesson8.example.model;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User save(User user) {
        return null;
    }

    //Map
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }
}
