create table dish
(
    dish_id     int auto_increment
        primary key,
    name        varchar(20)  not null,
    description varchar(100) null,
    flavor      varchar(20)  null,
    canteen     varchar(20)  not null
);

INSERT INTO jddp.dish (dish_id, name, description, flavor, canteen) VALUES (1, 'aaa', '', '', '1');
INSERT INTO jddp.dish (dish_id, name, description, flavor, canteen) VALUES (2, 'asdasd', '', '', '1');
