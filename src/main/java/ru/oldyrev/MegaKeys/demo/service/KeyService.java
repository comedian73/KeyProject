package ru.oldyrev.MegaKeys.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.oldyrev.MegaKeys.demo.model.Key;
import ru.oldyrev.MegaKeys.demo.repo.KeyRepository;

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

}
