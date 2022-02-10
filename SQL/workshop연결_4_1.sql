select COUNT(*) as 총인원 from TB_STUDENT;
select STUDENT_NO 학번, 
  STUDENT_NAME 이름, 
  rpad(substr(STUDENT_SSN, 0, 8), 14, '*') 주민번호, 
  case when STUDENT_ADDRESS is null then '**주소미상**' else substr(STUDENT_ADDRESS, 0, 10)||'...' end 주소, 
  to_char(ENTRANCE_DATE, 'yyyy/mm/dd') 입학년도, ABSENCE_YN 휴학여부 
from TB_STUDENT 
where STUDENT_NAME like '이%'
order by 1;

SELECT STUDENT_NO 학번, 
  STUDENT_NAME 이름, 
  rpad(substr(STUDENT_SSN, 0, 8), 14, '*') 주민번호, 
  CASE WHEN STUDENT_ADDRESS IS NULL THEN '**주소미상**' ELSE substr(STUDENT_ADDRESS, 0, 10)||'...' END 주소, 
  to_char(ENTRANCE_DATE, 'yyyy/mm/dd') 입학년도, ABSENCE_YN 휴학여부 
FROM TB_STUDENT
WHERE 2005 <= to_char(ENTRANCE_DATE, 'yyyy') and to_char(ENTRANCE_DATE, 'yyyy') <= 2010
ORDER BY ENTRANCE_DATE DESC;

SELECT STUDENT_NO 학번, 
  STUDENT_NAME 이름, 
  rpad(substr(STUDENT_SSN, 0, 8), 14, '*') 주민번호, 
  CASE WHEN STUDENT_ADDRESS IS NULL THEN '**주소미상**' ELSE substr(STUDENT_ADDRESS, 0, 10)||'...' END 주소, 
  to_char(ENTRANCE_DATE, 'yyyy/mm/dd') 입학년도, ABSENCE_YN 휴학여부 
FROM TB_STUDENT
WHERE STUDENT_NO IN ('A674033', 'A656014')
ORDER BY ENTRANCE_DATE DESC;


show user;


-- 28번
SELECT DEPARTMENT_NAME AS "계열 학과명", ROUND(AVG(POINT), 1) AS "전공평점"
FROM TB_DEPARTMENT
JOIN TB_CLASS C USING (DEPARTMENT_NO)
JOIN TB_GRADE USING (CLASS_NO)
WHERE CATEGORY IN ( 
                                    SELECT CATEGORY
                                    FROM TB_DEPARTMENT
                                    WHERE DEPARTMENT_NAME = '환경조경학과'
                                    AND CLASS_TYPE LIKE '%전공%'
                                  )
GROUP BY DEPARTMENT_NAME
ORDER BY 1;
                


-- 34번
SELECT DEPARTMENT_NAME, CAPACITY
FROM TB_DEPARTMENT;

UPDATE TB_DEPARTMENT
SET CAPACITY = ROUND(CAPACITY+(CAPACITY*0.1));

rollback;

-- 35번
SELECT STUDENT_NO, STUDENT_NAME, STUDENT_ADDRESS
FROM TB_STUDENT
WHERE STUDENT_NO = 'A413042';

UPDATE TB_STUDENT
SET STUDENT_ADDRESS = '서울시 종로구 숭인동 181-21'
WHERE STUDENT_NO = 'A413042';
rollback;


--36번
UPDATE TB_STUDENT
SET STUDENT_SSN = SUBSTR(STUDENT_SSN, 1, 6);
rollback;


-- 37번
UPDATE TB_GRADE
SET POINT = 3.5
WHERE TERM_NO = '200501'
AND CLASS_NO = (SELECT CLASS_NO FROM TB_CLASS WHERE CLASS_NAME = '피부생리학');
rollback;

-- 38번
DELETE FROM TB_GRADE
WHERE STUDENT_NO IN (SELECT STUDENT_NO FROM TB_STUDENT WHERE ABSENCE_YN = 'Y');
rollback;


-- workshop5 
-- 29번
CREATE TABLE TB_CATEGORY
( NAME VARCHAR2(10),
  USE_YN CHAR(1) DEFAULT 'Y'
);

SELECT * FROM TB_CATEGORY;
DESC TB_CATEGORY;

INSERT INTO TB_CATEGORY(NAME)
VALUES ('명지');


-- 30번
CREATE TABLE TB_CLASS_TYPE
( NO VARCHAR2(5) CONSTRAINT tb_class_type_no_pk PRIMARY KEY,
  NAME VARCHAR2(10)
);

DESC TB_CLASS_TYPE;

select * from user_constraints
where table_name = 'TB_CLASS_TYPE';


-- 31번
ALTER TABLE TB_CATEGORY
ADD CONSTRAINT tb_category_name_pk PRIMARY KEY(NAME);

select * from user_constraints
where table_name = 'TB_CATEGORY';


-- 32번
ALTER TABLE TB_CLASS_TYPE
MODIFY ( NAME CONSTRAINT tb_class_type_name_nn NOT NULL );

select * from user_constraints
where table_name = 'TB_CLASS_TYPE';

DESC TB_CLASS_TYPE;
DESC TB_CATEGORY;

-- 33번
ALTER TABLE TB_CATEGORY
MODIFY ( NAME VARCHAR2(20) );

ALTER TABLE TB_CLASS_TYPE
MODIFY ( NO VARCHAR2(10) );