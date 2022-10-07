create database shop
use shop
create table Brand(id int, title varchar(255), primary key (id))
create table Category(id int, title varchar(255), primary key (id))
create table Product(id int, title varchar(255), description varchar(255),  categoryId int, brandId int, cost Int, primary key (id), foreign key (categoryId) references Category(id), foreign key (brandId) references Brand(id) )
