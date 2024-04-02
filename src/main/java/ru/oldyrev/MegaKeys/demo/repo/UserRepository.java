package ru.oldyrev.MegaKeys.demo.repo;

import org.springframework.data.repository.CrudRepository;
import ru.oldyrev.MegaKeys.demo.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
     User findUserByUsername(String username);
}
