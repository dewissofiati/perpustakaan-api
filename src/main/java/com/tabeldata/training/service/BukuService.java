package com.tabeldata.training.service;

import com.tabeldata.training.entity.Buku;
import com.tabeldata.training.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class BukuService {

    @Autowired
    private BukuRepository repository;

    @Transactional
    public Buku save(Buku b) {
        return repository.save(b);
    }

    @Transactional
    public void delete(String id) {
        repository.deleteById(id);
    }

    public Iterable<Buku> list() {
        return repository.findAll();
    }

    public Optional<Buku> findById(String id) {
        return repository.findById(id);
    }

    public Page<Buku> findAll(Pageable page) {
        return repository.findAll(page);
    }

}
