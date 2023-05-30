create table customer
(
    customerID   int         not null
        primary key,
    firstName    varchar(25) not null,
    lastName     varchar(25) not null,
    address      varchar(25) not null,
    email        varchar(50) not null,
    userPassword varchar(25) null
);

