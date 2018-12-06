package com.tabeldata.training.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "anggota")
public class Anggota {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, length = 64)
    private String id;
    @Column(name = "nama", nullable = false, length = 100)
    private String nama;
    @Column(name = "no_KTP", nullable = false, unique = true, length = 60)
    private String noKtp;
    @Column(name = "alamat", nullable = false)
    private String alamat;
    @Column(name = "tanggal_lahir", nullable = false)
    private Date tanggalLahir;


}
