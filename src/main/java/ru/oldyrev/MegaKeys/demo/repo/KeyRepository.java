package ru.oldyrev.MegaKeys.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.oldyrev.MegaKeys.demo.model.Key;

public interface KeyRepository extends JpaRepository<Key, Long> {
}
