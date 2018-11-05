

create database Petstore;

use Petstore;


-- 类型表
create table Category(
	c_id int auto_increment,		-- 类型id
    c_name varchar(10),				-- 宠物类型名称
    primary key (c_id)
);

insert into Category values
(null,'狗'),
(null,'猫'),
(null,'兔'),
(null,'鼠'),
(null,'鸟');


-- 标签表
create table Tag(
	t_id int auto_increment,		-- 标签表id
    t_name varchar(20),				-- 标签名称
    primary key (t_id)
);


-- 宠物表
create table Pet(
	Pet_id int auto_increment,			-- 宠物id
    category_id int,					-- 类型表id
    Pet_name varchar(20),				-- 宠物名字
    Pet_photoUrls varchar(20),			-- 宠物图片（存图片的 url 地址）
    tag_id int,							-- 标签表id
    status varchar(20),					-- 位置（宠物在商店的位置）
    primary key (Pet_id)
);

insert into Pet values
(null,1,'阿拉斯加',null,null,null),
(null,1,'泰迪',null,null,null),
(null,2,'汤姆',null,null,null),
(null,5,'麻雀',null,null,null);

drop table User;

-- 用户表
create table User(
	u_id int auto_increment,			-- 用户表id
    u_Name varchar(20),					-- 用户名
    u_firstName varchar(20),			-- 名
    u_lastName varchar(10),				-- 姓
    u_email varchar(20),				-- 电子邮件
    u_pwd varchar(20),					-- 用户密码 
    u_phone varchar(20),				-- 电话
    u_Status varchar(10),				-- 用户状态
    primary key (u_id)
);

insert into User values
(null,'zs','三','张','aaa@qq.com','zs','13859382749','0'),
(null,'ls','四','李','bbb@qq.com','ls','17459382748','0'),
(null,'ww','五','王','ccc@qq.com','ww','13873382747','0'),
(null,'zl','六','赵','ddd@qq.com','zl','13859312746','0');

select * from User;


-- 订单表
create table Ordel(
	o_id int auto_increment,		-- 订单表id
    pet_Id int,						-- 宠物id
    o_quantity double,				-- 重量
    o_shipDate Datetime,			-- 装运日期
    o_status varchar(10),			-- 状态
    o_complete varchar(5),			-- 
    primary key (o_id)
);


-- 
create table ApiResponse(
	a_code int auto_increment,
    a_type varchar(20),
    a_message varchar(20),
    primary key (a_code)
);


