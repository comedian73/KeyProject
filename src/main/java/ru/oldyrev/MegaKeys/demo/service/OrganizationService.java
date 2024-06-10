package ru.oldyrev.MegaKeys.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.oldyrev.MegaKeys.demo.model.Organization;
import ru.oldyrev.MegaKeys.demo.repo.OrganizationRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrganizationService {

    private final OrganizationRepository repository;

    public void save(Organization organization) {
        repository.save(organization);
    }

    public void update(Organization organization) {
        save(organization);
    }

    public void delete(Long id) {repository.deleteById(id);}

    public List<Organization> getAll() {return repository.findAll();}
}
