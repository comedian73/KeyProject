package ru.oldyrev.MegaKeys.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.oldyrev.MegaKeys.demo.model.Contractor;
import ru.oldyrev.MegaKeys.demo.repo.ContractorRepository;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ContractorService {
    private final ContractorRepository contractorRepository;

    public void saveContractor(Contractor contractor) {
        contractorRepository.save(contractor);
    }

    public void updateContractor(Contractor contractor) {
        saveContractor(contractor);
    }

    public void delete(Long id) {contractorRepository.deleteById(id);}

    public List<Contractor> getAllContractor() {return contractorRepository.findAll();}

    @PostConstruct
    private void preLoad() {
        contractorRepository.save(new Contractor(1L, "Алексей", "Карев", "7894561230", new HashSet<>()));
    }
}
