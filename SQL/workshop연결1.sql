show user;

create table member (
userid varchar2(10) primary key,
passwd varchar2(10) not null,
username varchar2(10) not null,
address varchar2(50),
email varchar2(20)
);

insert into member values ('aaa', '1234', '홍길동', '서울', 'hong@korea.com');
insert into member values ('bbb', '1234', '이순신', '전라', 'hong@korea.com');
commit;

select *	from member 	where userid = 'aaa' and passwd = '12234'; 