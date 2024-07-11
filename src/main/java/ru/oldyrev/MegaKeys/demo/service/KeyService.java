package ru.oldyrev.MegaKeys.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.oldyrev.MegaKeys.demo.model.Key;
import ru.oldyrev.MegaKeys.demo.repo.KeyRepository;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.List;

@RequiredArgsConstructor
@Service
public class KeyService {

    private final KeyRepository keyRepository;

    public void save(Key key) {
        keyRepository.save(key);
    }

    public void updateKey(Key key) {
        save(key);
    }

    public void delete(Long id) {keyRepository.deleteById(id);}

    public List<Key> getAllKey() {return keyRepository.findAll();}

    public Key getKeyById(Long id) {return keyRepository.getById(id);}

    @PostConstruct
    private void preLoad() {
        keyRepository.save(new Key(1L,"61-123", "Ростов-Море", 1, new HashSet<>()));
    }

}
