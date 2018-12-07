INSERT INTO buku(id, judul, isbn, stock, tanggal_publish, penerbit_id, rak_id)
VALUES
('001','Algoritma dan Pemrograman','1234567','10','2005-10-15','001','001'),
('002','Belajar Bahasa C','1543216','5','2004-05-04','002','001'),
('003','Belajar Bahasa Java','1472839','7','2010-09-17','001','001'),
('004','Instrumentasi dan Pengukuran','1967856','3','2011-01-12','003','001')
;

INSERT INTO kategori_buku(buku_id, kategori_id)
VALUES
('001','001'),('002','002'),('003','001'),('004','003');