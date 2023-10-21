CREATE DATABASE QLbandongho
USE QLbandongho

-- TẠO BẢNG
create table admin (
	id int IDENTITY(1,1) PRIMARY KEY,
	username nvarchar(50) UNIQUE not null,
	password nvarchar(50) not null,
	name nvarchar(50) not null
)

insert into admin values ('admin', '123456', N'Lương Đức')

create table users (
	id int IDENTITY(1,1) PRIMARY KEY,
	name nvarchar(50) not null,
	email nvarchar(50) UNIQUE not null,
	phone nvarchar(20) not null,
	username nvarchar(50) UNIQUE not null,
	password nvarchar(50) not null,
	created date not null
)


create table catalog
(
	id int IDENTITY(1,1) PRIMARY KEY,
	name nvarchar(50) not null,
	parent_id int null
)


Create table product (
	id int IDENTITY(1,1) PRIMARY KEY,
	catalog_id int not null foreign key references catalog(id) on delete cascade,
	name nvarchar(50) not null,
	price nvarchar(20) not null,
	status int not null,
	description nvarchar(4000) not null,
	content nvarchar(4000) not null,
	discount int,
	image_link nvarchar(4000) not null,
	created date not null,  
)


create table review 
(
	id int IDENTITY(1,1) primary key,
	product_id int not null foreign key references product(id) on delete cascade,
	name nvarchar(50) not null,
	email nvarchar(50) not null,
	content nvarchar(4000) not null,
	created date ,
)


create table transactions
(
	id int IDENTITY(1,1) primary key,
	user_session nvarchar(50) not null,
	user_name nvarchar(50) not null,
	user_mail nvarchar(50) not null,
	user_phone nvarchar(20) not null,
	address nvarchar(300) not null,
	message nvarchar(4000) not null,
	amount nvarchar(20) not null,
	payment nvarchar(30) not null,
	status nvarchar(30),
	created date not null
);


create table ordered
(
	id int IDENTITY(1,1) primary key,
	product_id int not null foreign key references product(id) on delete cascade,
	transaction_id int not null foreign key references transactions(id) on delete cascade,
	qty int not null,	
);


create table boardnew
(
	id int IDENTITY(1,1) primary key,
	title nvarchar(200) not null,
	content nvarchar(4000) not null,
	image_link nvarchar(4000) not null,
	author nvarchar(50) not null,
	created date not null,
);



INSERT INTO catalog(name,parent_id) 
	VALUES (N'Đồng hồ Nam',null);
INSERT INTO catalog(name,parent_id) 
	VALUES (N'Đồng hồ Nữ',null);
INSERT INTO catalog(name,parent_id) 
	VALUES (N'Đồng hồ Châu Âu',null);
INSERT INTO catalog(name,parent_id) 
	VALUES (N'Đồng hồ Nhật Bản',null);
INSERT INTO catalog(name,parent_id) 
	VALUES (N'Sản Phẩm Mới',null);
INSERT INTO catalog(name,parent_id) 
	VALUES (N'Sản Phẩm Bán Chạy',null)
INSERT INTO catalog(name,parent_id) 
	VALUES (N'Sản Phẩm Giảm Giá',null);


insert into product values (1,N'Đồng hồ Nam','15.000','1',N'Đồng hồ Nam',N'.............................',0,'Olym Pianus 42mm Nam OP990-45ADGS-GL-X.jpg','2023-10-10')

insert into product values (2,N'Đồng hồ Nữ','75.000','1',N'Đồng hồ Nữ',N'...................................................',5,'Seiko 30mm Nữ SFQ803.jpg','2023-10-10')

insert into product values (3,N'Đồng hồ Châu Âu','35.000','1',N'Đồng hồ Châu Âu ',N'....................',10,'Seiko 26mm Nữ SYMG42K1','2023-10-10')


insert into product values (4,N'Đồng hồ Nhật Bản','100.000','1',N'Đồng hồ Nhật Bản',N'.........................................',10,'Đồng Hồ Casio G-Shock GA-2000S-1ADR Nam Quartz.jpg','2023-10-210')
insert into product values (5,N'Đồng Hồ Pierre Lannier 023L928 Nữ Quartz','10.000','1',N'Đồng Hồ Pierre Lannier 023L928 Nữ Quartz',N'..............',0,'Đồng Hồ Pierre Lannier 023L928 Nữ Quartz.jpg','2023-10-10')

insert into product values (6,N'Đồng Hồ Calvin Klein K7K411C6 Nam Quartz','50.000','1',N'Đồng Hồ Calvin Klein K7K411C6 Nam Quartz',N'.................................',5,'Đồng Hồ Calvin Klein K7K411C6 Nam Quartz.jpg','2023-10-10')

insert into product values (7,N'Đồng Hồ Seiko SUJG69P1 Nữ Quartz','85.000','1',N'Đồng Hồ Seiko SUJG69P1 Nữ Quartz',N'...............',0,'Đồng Hồ Seiko SUJG69P1 Nữ Quartz.jpg','2023-10-10')


Insert into boardnew(title, content, image_link, author, created) values (N'Top 5 mẫu đồng hồ Citizen nữ đẹp nhất 2023', N'...............', 'blog_6.jpg', N'Trung Duc 1', '2023-10-10');
Insert into boardnew(title, content, image_link, author, created) values (N'Hướng dẫn sạc pin đồng hồ thông minh đúng cách', N'............................', 'blog_5.jpg', N'Trung Duc 2', '2023-10-10');
Insert into boardnew(title, content, image_link, author, created) values (N'Hướng dẫn cách chỉnh đồng hồ Casio 3 nút đơn giản, dễ thực hiện', N'............................', 'blog_2.jpg', N'Trung Duc 3', '2023-10-10');
Insert into boardnew(title, content, image_link, author, created) values (N'Thật giả đồng hồ Rolex niềng khía giá rẻ và cách phân biệt đồng hồ Rolex fake', N'.........................................', 'blog_7.jpg', N'Trung Duc 4', '2023-10-10');

INSERT INTO review(product_id,name,email,content,created) 
	VALUES (3,'Trung Duc 1','duc1@gmail.com',N'An toàn, giao nhanh','2023-10-10');
INSERT INTO review(product_id,name,email,content,created) 
	VALUES (4,'Trung Duc 2','duc2@gmail.com',N'Sản phẩm chất lượng','2023-10-11');
INSERT INTO review(product_id,name,email,content,created) 
	VALUES (5,'Trung Duc 3','duc3@gmail.com',N'Đẹp, lần sau tôi sẽ mua tiếp','2023-10-12');


