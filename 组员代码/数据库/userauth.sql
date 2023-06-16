create table userauth
(
    auth_id int auto_increment
        primary key,
    user_id int not null,
    role    int not null comment '0=>user; 1=>staff; 2=>administrator',
    constraint user_id
        foreign key (user_id) references user (user_id)
);

INSERT INTO jddp.userauth (auth_id, user_id, role) VALUES (1, 2, -1);
INSERT INTO jddp.userauth (auth_id, user_id, role) VALUES (2, 3, 2);
INSERT INTO jddp.userauth (auth_id, user_id, role) VALUES (3, 4, -1);
INSERT INTO jddp.userauth (auth_id, user_id, role) VALUES (4, 5, 1);
INSERT INTO jddp.userauth (auth_id, user_id, role) VALUES (5, 6, 0);
INSERT INTO jddp.userauth (auth_id, user_id, role) VALUES (6, 7, 2);
INSERT INTO jddp.userauth (auth_id, user_id, role) VALUES (7, 8, 2);
INSERT INTO jddp.userauth (auth_id, user_id, role) VALUES (8, 9, 0);
