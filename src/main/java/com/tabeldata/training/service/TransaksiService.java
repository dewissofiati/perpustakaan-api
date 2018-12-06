package com.tabeldata.training.service;

import com.tabeldata.training.entity.Transaksi;
import com.tabeldata.training.repository.TransaksiDetailsRepository;
import com.tabeldata.training.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class TransaksiService {

    @Autowired
    private TransaksiRepository transaksiRepository;
    @Autowired
    private TransaksiDetailsRepository transaksiDetailsRepository;

    public Iterable<Transaksi> findAll(){
        
    }
}
