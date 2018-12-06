CREATE TABLE transaksi-details(
id  character varying(64) not null primary key,
transaksi_id  character varying(64) not null,
buku_id character varying(64) not null
);

alter table transaksi_details
add constraint fk_transaksi_details_buku foreign key (buku_id)
references buku (id) on update cascade on delete restrict;

alter table transaksi_details
add constraint fk_transaksi_details_transaksi foreign key (transaksi_id)
references transaksi (id) on update cascade on delete restrict;

alter table transaksi_details
add constraint un_transaksi_details unique (buku_id, transaksi_id);