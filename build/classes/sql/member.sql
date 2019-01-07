SELECT * FROM member;
SELECT*FROM TAB 쿼리문

system/password - 원래있는 녀석 상위계정
--계정생성--
CREAT USER oracle IDENTIFIED BY password;
oracle/password
--권한부여--
GRANT RESOURCE, CONNECT, DBA TO oracle;
EXIT
---다시로그인
sqlplus oracle/password
--현재사용자 정보보기
SHOW USER
SELECT * FROM TAB;
--테이블 생성--
CREATE TABLE  member(
    id VARCHAR2(10), 
    name VARCHAR2(10), 
    pass VARCHAR2(10), 
    ssn VARCHAR2(14)
);
--인스턴스 생성==DB에서 한 row를 추가하는것---
INSERT INTO meber(id,name,pass,ssn)
VALUES('hong', '홍길동', '1', '90010-1234567')