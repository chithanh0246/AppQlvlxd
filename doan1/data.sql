create database VatTu1
go
use VatTu1
go
create table VatTu(
	IDVT VarChar(5) primary key,
	Ten nvarchar(50),
	DVT nvarchar(50),
)
go
create table NhanVien(
	IDNV varchar(5) primary key,
	TenNV nvarchar(50),
	GioiTinh nvarchar(5),
	NgaySinh datetime,
	SDT int,
	DiaChi nvarchar(50)
)
go
create table NguoiDung
(
	UserName varchar(15) primary key,
	PassWord varchar(50),
	Loai int,
)
go
create table khachhang
(
	IDKH varchar(5) primary key,
	TenKH nvarchar(50),
	DiaChi nvarchar(50),
	SDT  varchar(10),
		
)
go
create table NhaCungCap
(
	IDNCC varchar(5) primary key,
	TenNCC nvarchar(50),
	DiaChi nvarchar(500),
	SDT varchar(10)
	
)
go
create table Kho(
	IDKho varchar(5) primary key ,
	IDVT varchar(5),
	SL int,
	foreign key (IDVT) references VatTu 
)
go
create table HoaDonNhap(
	IDHDN varchar(5) primary key,
	IDNCC varchar(5),
	IDNV varchar(5),
	NgayLapHD datetime
	foreign key (IDNCC) references NhaCungCap,
	foreign key (IDNV) references NhanVien 
)
go
create table ChiTietHoaDonNhap
(

	ID int primary key,
	IDVT varchar(5),
	IDHDN varchar(5),
	SLN int,
	GiaNhap int,
	foreign key (IDHDN) references HoaDonNhap,
	foreign key (IDVT) references VatTu
)
go
create table HoaDonXuat(
	IDHDX varchar(5) primary key,
	IDKH varchar(5),
	IDNV varchar(5),
	NgayLapHDXuat datetime
	foreign key (IDKH) references KhachHang,
	foreign key (IDNV) references NhanVien
)
go
create table ChiTietHoaDonXuat(
	IDX int primary key,
	IDKho varchar(5),
	IDHDX varchar(5),
	SLX int,
	DGX int,
	foreign key (IDKho) references Kho,
	foreign key (IDHDX) references HoaDonXuat
)
go
create table NguoiDungNhanVien(
	IDNDNV int,
	UserName varchar(15),
	IDNV varchar(5),
	foreign key (IDNV) references NhanVien,
	foreign key (UserName) references NguoiDung
)
go