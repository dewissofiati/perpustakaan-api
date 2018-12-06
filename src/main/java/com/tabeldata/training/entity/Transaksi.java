package com.tabeldata.training.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaksi {

    private String id;
    private Date tanggal;
    private Anggota anggota;
    private String petugas;
    private Timestamp createdDate;
    private boolean kembali;
}
