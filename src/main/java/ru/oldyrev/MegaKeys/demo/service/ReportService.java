package ru.oldyrev.MegaKeys.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.oldyrev.MegaKeys.demo.model.Report;
import ru.oldyrev.MegaKeys.demo.repo.ReportRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReportService {

    private final ReportRepository reportRepository;

    public void save(Report report) {
        reportRepository.save(report);
    }

    public void update(Report report) {
        save(report);
    }

    public void delete(Long id) {reportRepository.deleteById(id);}

    public List<Report> getAllReport() {return reportRepository.findAll();}
}
