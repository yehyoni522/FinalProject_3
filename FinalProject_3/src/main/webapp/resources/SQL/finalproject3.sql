show user;

select *
from tab;

commit;

rollback;

-- 댓글 tbl_comment
create table tbl_comment
(comseq           number               not null   -- 댓글번호
,content       varchar2(1000)       not null   -- 댓글내용
,regDate       date default sysdate not null   -- 작성일자
,fk_seq     number               not null   -- 원게시물 글번호
,fk_hakbun   number             not null    -- 학번
,status        number(1) default 1  not null   -- 글삭제여부
                                               -- 1 : 사용가능한 글,  0 : 삭제된 글
                                               -- 댓글은 원글이 삭제되면 자동적으로 삭제되어야 한다.
,constraint PK_tbl_comment_comseq primary key(comseq)
,constraint FK_tbl_comment_fk_hakbun foreign key(fk_hakbun) references tbl_hakbun(hakbun)
,constraint FK_tbl_comment_fk_seq foreign key(fk_seq) references tbl_board(seq) on delete cascade
,constraint CK_tbl_comment_status check( status in(1,0) ) 
);

create sequence commentSeq
start with 1
increment by 1
nomaxvalue
nominvalue
nocycle
nocache;


-- 일반게시판 tbl_board
create table tbl_board
(seq         number                not null       -- 글번호
,subject     Nvarchar2(200)        not null       -- 글제목
,content     Nvarchar2(2000)       not null       -- 글내용   -- clob (최대 4GB까지 허용) 
,files        varchar2(100)                        -- 파일
,categoryno  number(8)             not null       -- 카테고리번호(1:자유,2:중고,3:모집)
,readCount   number default 0      not null       -- 글조회수
,regDate     date default sysdate  not null       -- 글쓴시간
,good        number(8) default 0                  -- 좋아요
,fk_hakbun   number             not null    -- 학번
,name        varchar2(20)          not null    -- 글쓴이
,status      number(1) default 1   not null    -- 글삭제여부   1:사용가능한 글,  0:삭제된글
,commentCount  number default 0      not null    -- 댓글의 개수
,constraint PK_tbl_board_seq primary key(seq)
,constraint CK_tbl_board_status check( status in(0,1) )
,constraint FK_tbl_board_fk_hakbun foreign key(fk_hakbun) references tbl_hakbun(hakbun)
);

SELECT to_char(sysdate, 'yyyy/mm/dd')
FROM DUAL;

create sequence boardSeq
start with 1
increment by 1
nomaxvalue
nominvalue
nocycle
nocache;

-- 학번 tbl_hakbun
create table tbl_hakbun
(hakbun     number   not null  -- 학번
,fk_perno     number   not null  -- 사람번호
,constraint PK_tbl_hakbun_hakbun primary key(hakbun)
,constraint FK_tbl_hakbun_fk_perno foreign key(fk_perno) references tbl_person(perno)
);


--- 사람 tbl_person (교수, 관리자, 학생 모두 포함)
create table tbl_person
(perno              number   not null        -- 사람번호
,name               varchar2(30)   not null  -- 이름
,gender             varchar2(1)              -- 성별   남자:1  / 여자:2
,birthday           varchar2(10)             -- 생년월일 
,email              varchar2(200)  not null  -- 이메일 (AES-256 암호화/복호화 대상)
,address            varchar2(200)            -- 주소
,mobile             varchar2(200)            -- 휴대폰번호 (AES-256 암호화/복호화 대상) 
,fk_colno           number(8)      not null  -- 단과대학ID
,constraint PK_tbl_person_perno primary key(perno)
,constraint UQ_tbl_person_email  unique(email)
,constraint CK_tbl_person_gender check( gender in('1','2') )
,constraint FK_tbl_person_fk_colno foreign key(fk_colno) references tbl_college(colno)
);


create sequence perSeq
start with 1
increment by 1
nomaxvalue
nominvalue
nocycle
nocache;


-- 단과대학 tbl_college
create table tbl_college
(colno      number              not null        -- 단과대학ID
,colname    Nvarchar2(2000)     not null        -- 단과대학명  
,constraint PK_tbl_college_colno primary key(colno)
);


create sequence colSeq
start with 100
increment by 1
nomaxvalue
nominvalue
nocycle
nocache;


-- 학과 tbl_department
create table tbl_major
(depseq      number                not null       -- 학과ID
,fk_colno    number(10)        not null       -- 단과대학ID
,content     Nvarchar2(200)       not null       -- 학과명
,constraint PK_tbl_major_depseq primary key(depseq)
,constraint FK_tbl_major_fk_colno foreign key(fk_colno) references tbl_college(colno)
);


create sequence depSeq
start with 1
increment by 1
nomaxvalue
nominvalue
nocycle
nocache;







