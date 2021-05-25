show user;

select *
from tab;

--drop table tbl_RroomNum purge;
create table tbl_RroomNum (
rno number(5), -- 열람실 번호
rname varchar2(15) not null , -- 열람실번호
rcode varchar2(15) not null , -- 열람실번호
rtotalseat number(5) not null, -- 총좌석수
constraint  PK_tbl_RroomNum primary key(rno)
);

insert into tbl_RroomNum(rno, rname, rcode, rtotalseat) 
values(1, '제1열람실', 'firstroom', 60);
insert into tbl_RroomNum(rno, rname, rcode, rtotalseat) 
values(2, '제2열람실', 'secondroom', 60);
insert into tbl_RroomNum(rno, rname, rcode, rtotalseat) 
values(3, '제3열람실', 'thirdroom', 60);

commit;

select *
from tbl_RroomNum;

select rno, rname, rcode, rtotalseat
from tbl_RroomNum;


--drop table tbl_time purge;
create table tbl_time (
tno number(5), -- 시간일련번호
tname varchar(30) not null, -- 시간(구간)
constraint  PK_tbl_time primary key(tno)
);

--drop table tbl_detailseatinfo purge;
create table tbl_detailseatinfo (
dsno number(5), --상세좌석번호
dsname varchar2(15) not null, --상세좌석명
dscheck number(1) default 0, --예약여부
fk_rno number(5), --fk_열람실번호
fk_tno number(5), --fk_시간일련번호
constraint  PK_tbl_detailseatinfo primary key(dsno),
constraint FK_tbl_detailseatinfo foreign key(fk_rno) references tbl_RroomNum(rno),
constraint FK_tbl_time foreign key(fk_tno) references tbl_time(tno)
);

create sequence seq_tbl_detailseatinfo
start with 1
increment by 1
nomaxvalue
nominvalue
nocycle
nocache;




