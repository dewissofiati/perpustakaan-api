package com.tabeldata.training.service;

import com.tabeldata.training.entity.Penerbit;
import com.tabeldata.training.repository.PenerbitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PenerbitService {

    @Autowired
    private PenerbitRepository repository;

    @Transactional
    public Penerbit save(Penerbit k) {
        return repository.save(k);
    }

    @Transactional
    public void delete(String id) {
        repository.deleteById(id);
    }

    public Iterable<Penerbit> list() {
        return repository.findAll();
    }

    public Optional<Penerbit> findById(String id) {
        return repository.findById(id);
    }

    public Page<Penerbit> paginate(Pageable page) {
        return repository.findAll(page);
    }
}
