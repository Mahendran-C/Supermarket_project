select customer_id,contact from Customer;

select distinct first_name from customer;

select count(distinct contact)from customer;

select*from customer where type='vendor';

select*from customer where customer_id=2;

select*from customer where contact='9597742639' and fIrst_name='yugi';

select*from customer where not contact='9597742639';

select*from customer where not contact='959774263' and not first_name='Yugi';

select type,customer_id,fIrst_name from customer where type='vendor' order by first_name desc; 

insert into vendor 
values ('Yugi',3,'4-8-2020');select*from vendor;

insert into store values (11,'Paulsons Super Stores','099433 24175','No: 216-F','Bangalore Road','krishnagiri','tamilnadu','londenpet','635001','active','4-8-2020'),
(12,'RR Stores', '04341253037','Rajaji Nagar','Wahab Nagar','krishnagiri','tamilnadu','Pochampalli','635001','active','4-8-2020');
select*from store;

insert into category (name,description,store_id,created)
values ('Home care','Various product',1,'4-8-2020'),('Vegetables','Organic made',1,'4-8-2020'),
('Fruits','Good for health',1,'4-8-2020'),
('Personal care','Hygenic',1,'4-8-2020'),('Beverages','Enjoy your break time',1,'4-8-2020'),('Home care','Various product',2,'4-8-2020'),('Vegetables','Organic made',2,'4-8-2020'),
('Fruits','Good for health',2,'4-8-2020'),
('Personal care','Hygenic',2,'4-8-2020'),('Beverages','Enjoy your break time',2,'4-8-2020');
select*from category;

insert into subCategory (name,description,category_id,created)
values 
('pooja & spiritual needs','Products that fulfil religious and devotional',1,'4-8-2020'),('Houshold essential','Needs for home',1,'4-8-2020'),
('Leafy Green','Iron content is rich',2,'4-8-2020'),(' Root','Rich in fibre',2,'4-8-2020'),
('Citrus','Immune boosting',3,'4-8-2020'),(' Tropical&Exotic','Traditionally available',3,'4-8-2020'),
('Bath and beauty','provides extra look at you',4,'4-8-2020'),('Baby care','Protect your baby',4,'4-8-2020'),
('Bakery & Sancks','Mini food',5,'4-8-2020'),('Fresh juice','Energy drink',5,'4-8-2020');
select*from dbo.subCategory;

