package com.tabeldata.training.service;

import com.tabeldata.training.entity.Rak;
import com.tabeldata.training.repository.RakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class RakService {
    @Autowired
    private RakRepository repository;

    @Transactional
    public Rak save(Rak k) {
        return repository.save(k);
    }

    @Transactional
    public void delete(String id) {
        repository.deleteById(id);
    }

    public Iterable<Rak> list() {
        return repository.findAll();
    }

    public Optional<Rak> findById(String id) {
        return repository.findById(id);
    }

    public Page<Rak> paginate(Pageable page) {
        return repository.findAll(page);
    }
}
