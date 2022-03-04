create database sqll
go
use sqll
go
create table Sach
( Matailieu char(7) primary key,
Tennxb nvarchar(100),
Sobanphathanh varchar(7),
Tentacgia nvarchar(100),
Sotrang varchar(7),
)
create table Tailieu
(
 Matailieu char(7) primary key,
Tennxb nvarchar(100),
Sobanphathanh varchar(7),
Sophathanh varchar(7),
Thangphathanh varchar(7),
)
create table Bao
(
 Matailieu char(7) primary key,
Tennxb nvarchar(100),
Sobanphathanh varchar(7),
Ngayphathanh date,
)
