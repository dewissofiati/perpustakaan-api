package com.tabeldata.training.api;

import com.tabeldata.training.entity.Kategori;
import com.tabeldata.training.entity.Rak;
import com.tabeldata.training.service.RakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/rak")
public class RakApi {
    @Autowired
    private RakService service;

    @GetMapping("/list")
    public Page<Rak> pagination(Pageable page) {
        return service.paginate(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rak> findById(@PathVariable("id") String id) {
        Optional<Rak> rakOptional = service.findById(id);
        if (rakOptional.isPresent())
            return ResponseEntity.ok(rakOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @PostMapping("/save")
    public ResponseEntity<Rak> save(
            @RequestParam String nama,
            @RequestParam Integer lokasi,
            @RequestParam(required = false) String id) {
        Rak rak = service.save(new Rak(id, nama, lokasi));
        return ResponseEntity.ok(rak);
    }

    @PutMapping("/save")
    public ResponseEntity<Rak> update(@RequestBody Rak value) {
        Rak rak = service.save(value);
        return ResponseEntity.ok(rak);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> delete(@RequestParam("rakId") String id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
