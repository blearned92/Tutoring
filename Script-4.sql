
drop table if exists storefronts cascade;
drop table if exists lineitems cascade;
drop table if exists products cascade;
drop table if exists orders cascade;
drop table if exists customers cascade;

create table customers (
customer_id serial primary key,
customer_name varchar(50) not null,
email varchar(50) unique not null
);


create table orders(
order_id serial primary key,
total_price int not null,
customer_id int references customers(customer_id)
);

create table products(
product_id serial primary key,
price int not null,
product_name varchar(50) not null
);

create table lineitems(
order_id int references orders(order_id),
product_id int references products(product_id),
quantity int not null
);

create table storefronts(
store_id serial primary key, 
storefront_name varchar(50) not null,
address varchar(50) not null
);



--CRUD OPERATIONS
select *  from storefronts;
select * from orders;
select * from products;
select * from lineitems;
select * from customers;

select * from customers where email = 'brandon@email.com';
select * from customers natural inner join orders;
select * from customers inner join orders on orders.customer_id = customers.customer_id;
select customers.customer_id from (customers inner join orders on orders.customer_id = customers.customer_id);
select * from customers natural inner join orders natural inner join lineitems natural inner join products;

insert into storefronts (storefront_name, address) values ('Potpie Palace', 'Potpie lane');
insert into customers (customer_name, email) values ('Brandon', 'brandon@email.com');
insert into customers (customer_name, email) values ('Matthew', 'matt@email.com');
insert into orders(total_price, customer_id) values (100, 1);
insert into orders(total_price, customer_id) values (200, 4);
insert into products(price, product_name) values (10, 'Potpie');
insert into lineitems(order_id, product_id, quantity) values (6, 1, 5);




