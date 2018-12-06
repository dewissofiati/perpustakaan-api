package com.tabeldata.training.api;

import com.tabeldata.training.entity.Anggota;
import com.tabeldata.training.service.AnggotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/anggota")
public class AnggotaApi {

    @Autowired
    AnggotaService service;

    @GetMapping("/list")
    public Page<Anggota> pagination(Pageable page) {
        return service.paginate(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anggota> findById(@PathVariable("id") String id) {
        Optional<Anggota> kategoriOption = service.findById(id);
        if (kategoriOption.isPresent())
            return ResponseEntity.ok(kategoriOption.get());
        else
            return ResponseEntity.noContent().build();
    }
}
