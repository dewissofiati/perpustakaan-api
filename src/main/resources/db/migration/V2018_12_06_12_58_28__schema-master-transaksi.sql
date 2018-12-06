CREATE TABLE transaksi(
  id  character varying(64) not null primary key,
  tanggal_pinjam date not null,
  anggota_id character varying(64) not null,
  nama_petugas character varying(100) not null,
  waktu_transaksi timestamp not null default now(),
  is_kembali boolean not null default false,
  tanggal_kembali timestamp
);

alter table transaksi
add constraint fk_transaksi_anggota foreign key (anggota_id)
references anggota(id) on update cascade on delete restrict;