package ru.oldyrev.MegaKeys.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.oldyrev.MegaKeys.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
