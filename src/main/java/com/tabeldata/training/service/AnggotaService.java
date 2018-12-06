package com.tabeldata.training.service;

import com.tabeldata.training.entity.Anggota;
import com.tabeldata.training.repository.AnggotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class AnggotaService {
    @Autowired
    private AnggotaRepository repository;

    @Transactional
    public Anggota save(Anggota a) {
        return repository.save(a);
    }

    @Transactional
    public void delete(String id) {
        repository.deleteById(id);
    }

    public Iterable<Anggota> list() {
        return repository.findAll();
    }

    public Optional<Anggota> findById(String id) {
        return repository.findById(id);
    }

    public Page<Anggota> paginate(Pageable page) {
        return repository.findAll(page);
    }
}
