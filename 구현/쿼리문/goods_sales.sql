drop table GOODS_SALES;
drop sequence GOODS_SALES_SEQ;

create table GOODS_SALES(
NUM number primary key,
GOODSCODE varchar2(100) not null,
NICKNAME varchar2(20) not null,
PRICE number not null,
ORDERDATE date default sysdate,
SENDSTATE varchar2(10) default 'YET' not null
SENDDATE date,
);

create sequence GOODS_SALES_SEQ
start with 1 
increment by 1 
nomaxvalue nocycle nocache noorder;

insert into GOODS_SALES values (GOODS_SALES_SEQ.nextval, 'test1', 'eun_naver', 25900, sysdate, 'END' ,sysdate+1);
insert into GOODS_SALES values (GOODS_SALES_SEQ.nextval, 'test2', 'jin_naver', 18900, sysdate, 'END' ,sysdate+1);
insert into GOODS_SALES values (GOODS_SALES_SEQ.nextval, 'test3', 'seoul_naver', 7800, sysdate, 'YET' ,sysdate+6);
insert into GOODS_SALES values (GOODS_SALES_SEQ.nextval, 'test4', 'sun_naver', 12800, sysdate, 'YET' ,sysdate+1);
insert into GOODS_SALES values (GOODS_SALES_SEQ.nextval, 'test5', 'hee_naver', 17900, sysdate, 'ING' ,sysdate+1);
insert into GOODS_SALES values (GOODS_SALES_SEQ.nextval, 'test6', 'eun_naver', 13900, sysdate, 'YET' ,sysdate+4);
insert into GOODS_SALES values (GOODS_SALES_SEQ.nextval, 'test7', 'jin_naver', 6000, sysdate, 'ING' ,sysdate+2);
insert into GOODS_SALES values (GOODS_SALES_SEQ.nextval, 'test6', 'seoul_inside', 13900, sysdate, 'YET' ,sysdate+3);
insert into GOODS_SALES values (GOODS_SALES_SEQ.nextval, 'test5', 'hee_inside', 17900, sysdate, 'YET' ,sysdate-+7);
insert into GOODS_SALES values (GOODS_SALES_SEQ.nextval, 'test4', 'sun_inside', 12800, sysdate, 'YET' ,sysdate+5);