CREATE TABLE anggota(
  id character varying(64) NOT NULL PRIMARY KEY,
  nama character varying(100) NOT NULL,
  no_KTP character varying(60) NOT NULL UNIQUE,
  alamat character varying(100) NOT NULL,
  tanggal_lahir DATE NOT NULL
);