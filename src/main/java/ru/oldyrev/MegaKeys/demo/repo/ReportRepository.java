package ru.oldyrev.MegaKeys.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.oldyrev.MegaKeys.demo.model.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {
}
