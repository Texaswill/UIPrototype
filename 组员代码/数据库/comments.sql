create table comments
(
    comment_id int auto_increment
        primary key,
    user_id    int           not null,
    content    varchar(1000) not null,
    rate       int           not null,
    time_stamp mediumtext    not null,
    likes      int default 0 not null
);

INSERT INTO jddp.comments (comment_id, user_id, content, rate, time_stamp, likes) VALUES (1, 1, 'asdasd', 5, '1684250298681', 2);
INSERT INTO jddp.comments (comment_id, user_id, content, rate, time_stamp, likes) VALUES (2, 1, 'lkjlkjlkj', 5, '1684317278034', 1);
