package consoleAplication.repository;

import consoleAplication.domain.User;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class UserRepositoryImpl implements UserRepository {
    private Map<Long, User> idToUser = new HashMap<>();
    private static Long counter = 0L;

    @Override
    public User save(User user) {
        if (Objects.isNull(user)) {
            throw new IllegalArgumentException("Null is not allowed");
        }
        return idToUser.put(counter++, user);
    }

    @Override
    public Optional<User> findById(Long id) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Null is not allowed");
        } else {
            return Optional.ofNullable(idToUser.get(id));
        }
    }

    @Override
    public User update(Long id, User user) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Null is not allowed");
        }
        if (!findById(id).isPresent()){
            throw new IndexOutOfBoundsException("There is no user with this id");
        }
        return idToUser.put(id, user);
    }

    @Override
    public Optional<User> deleteById(Long id) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Null is not allowed");
        }
        return Optional.ofNullable(idToUser.remove(id));
    }

    @Override
    public List<User> getAll() {
        List<User> allUsers = new ArrayList<>();

        for (Long i : idToUser.keySet()){
            allUsers.add(idToUser.get(i));
        }
        return allUsers;
    }

    @Override
    public Optional<User> findByEmail(String email) {

        User user = null;

        if (Objects.isNull(email)) {
            throw new IllegalArgumentException("Null is not allowed");
        } else {
            for (Long i : idToUser.keySet()){
                if (idToUser.get(i).getEmail().equals(email)){
                    user = idToUser.get(i);
                }

            }
        }
        return Optional.ofNullable(user);
    }
}