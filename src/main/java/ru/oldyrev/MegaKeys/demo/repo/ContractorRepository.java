package ru.oldyrev.MegaKeys.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.oldyrev.MegaKeys.demo.model.Contractor;

public interface ContractorRepository extends JpaRepository<Contractor, Long> {
}
