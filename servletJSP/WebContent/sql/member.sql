
create table member (
 id varchar2(10) primary key,
 name varchar2(100) not null,
 passwd varchar2(10) not null,
 email varchar2(30) not null
);
insert into member values ('user1' ,'사용자1', '1234', 'user1@email');