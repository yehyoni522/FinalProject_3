show user;

select *
from tab;

select *
from tbl_person;

perno;


-- TBL_ INBOX 테이블 생성하기
create table tbl_inbox
(inboxSeq             number   not null  -- 받은쪽지번호seq
,fk_perno                number  not null  -- 발신자
,receiver               number   not null  -- 수신자
,subject              varchar2(1000)  not null  --내용 1000자 한계
,reDate                 date default sysdate     -- 받은날짜 
,readState             number(1) default 0 not null     -- 읽음표시 읽으면 0 -> 나중에 업데이트로 1로바꾸어줌
,constraint PK_tbl_inbox_inboxSeq primary key(inboxSeq)
,constraint  FK_tbl_inbox_fk_perno foreign key(fk_perno) references tbl_person(perno)
);

create sequence seq_tbl_inbox_inboxSeq
start with 1
increment by 1
nomaxvalue
nominvalue
nocycle
nocache;

-- TBL_ OUTBOX 테이블 생성하기
create table tbl_outbox
(outboxSeq             number   not null  -- 받은쪽지번호seq
,fk_perno                number  not null  -- 수신자
,sender               number   not null  -- 발신자
,subject              varchar2(1000)  not null  --내용 1000자 한계
,senDate                 date default sysdate     -- 받은날짜 
,fk_readState             number(1) default 0 not null     -- 읽음표시 읽으면 0 -> 나중에 업데이트로 1로바꾸어줌
,constraint PK_tbl_outbox_outboxSeq primary key(outboxSeq)
,constraint  FK_tbl_outbox_fk_perno foreign key(fk_perno) references tbl_person(perno)

);

create sequence seq_tbl_outbox_outboxSeq
start with 1
increment by 1
nomaxvalue
nominvalue
nocycle
nocache;
