select COUNT(*) as ���ο� from TB_STUDENT;
select STUDENT_NO �й�, 
  STUDENT_NAME �̸�, 
  rpad(substr(STUDENT_SSN, 0, 8), 14, '*') �ֹι�ȣ, 
  case when STUDENT_ADDRESS is null then '**�ּҹ̻�**' else substr(STUDENT_ADDRESS, 0, 10)||'...' end �ּ�, 
  to_char(ENTRANCE_DATE, 'yyyy/mm/dd') ���г⵵, ABSENCE_YN ���п��� 
from TB_STUDENT 
where STUDENT_NAME like '��%'
order by 1;

SELECT STUDENT_NO �й�, 
  STUDENT_NAME �̸�, 
  rpad(substr(STUDENT_SSN, 0, 8), 14, '*') �ֹι�ȣ, 
  CASE WHEN STUDENT_ADDRESS IS NULL THEN '**�ּҹ̻�**' ELSE substr(STUDENT_ADDRESS, 0, 10)||'...' END �ּ�, 
  to_char(ENTRANCE_DATE, 'yyyy/mm/dd') ���г⵵, ABSENCE_YN ���п��� 
FROM TB_STUDENT
WHERE 2005 <= to_char(ENTRANCE_DATE, 'yyyy') and to_char(ENTRANCE_DATE, 'yyyy') <= 2010
ORDER BY ENTRANCE_DATE DESC;

SELECT STUDENT_NO �й�, 
  STUDENT_NAME �̸�, 
  rpad(substr(STUDENT_SSN, 0, 8), 14, '*') �ֹι�ȣ, 
  CASE WHEN STUDENT_ADDRESS IS NULL THEN '**�ּҹ̻�**' ELSE substr(STUDENT_ADDRESS, 0, 10)||'...' END �ּ�, 
  to_char(ENTRANCE_DATE, 'yyyy/mm/dd') ���г⵵, ABSENCE_YN ���п��� 
FROM TB_STUDENT
WHERE STUDENT_NO IN ('A674033', 'A656014')
ORDER BY ENTRANCE_DATE DESC;


show user;


-- 28��
SELECT DEPARTMENT_NAME AS "�迭 �а���", ROUND(AVG(POINT), 1) AS "��������"
FROM TB_DEPARTMENT
JOIN TB_CLASS C USING (DEPARTMENT_NO)
JOIN TB_GRADE USING (CLASS_NO)
WHERE CATEGORY IN ( 
                                    SELECT CATEGORY
                                    FROM TB_DEPARTMENT
                                    WHERE DEPARTMENT_NAME = 'ȯ�������а�'
                                    AND CLASS_TYPE LIKE '%����%'
                                  )
GROUP BY DEPARTMENT_NAME
ORDER BY 1;
                


-- 34��
SELECT DEPARTMENT_NAME, CAPACITY
FROM TB_DEPARTMENT;

UPDATE TB_DEPARTMENT
SET CAPACITY = ROUND(CAPACITY+(CAPACITY*0.1));

rollback;

-- 35��
SELECT STUDENT_NO, STUDENT_NAME, STUDENT_ADDRESS
FROM TB_STUDENT
WHERE STUDENT_NO = 'A413042';

UPDATE TB_STUDENT
SET STUDENT_ADDRESS = '����� ���α� ���ε� 181-21'
WHERE STUDENT_NO = 'A413042';
rollback;


--36��
UPDATE TB_STUDENT
SET STUDENT_SSN = SUBSTR(STUDENT_SSN, 1, 6);
rollback;


-- 37��
UPDATE TB_GRADE
SET POINT = 3.5
WHERE TERM_NO = '200501'
AND CLASS_NO = (SELECT CLASS_NO FROM TB_CLASS WHERE CLASS_NAME = '�Ǻλ�����');
rollback;

-- 38��
DELETE FROM TB_GRADE
WHERE STUDENT_NO IN (SELECT STUDENT_NO FROM TB_STUDENT WHERE ABSENCE_YN = 'Y');
rollback;


-- workshop5 
-- 29��
CREATE TABLE TB_CATEGORY
( NAME VARCHAR2(10),
  USE_YN CHAR(1) DEFAULT 'Y'
);

SELECT * FROM TB_CATEGORY;
DESC TB_CATEGORY;

INSERT INTO TB_CATEGORY(NAME)
VALUES ('����');


-- 30��
CREATE TABLE TB_CLASS_TYPE
( NO VARCHAR2(5) CONSTRAINT tb_class_type_no_pk PRIMARY KEY,
  NAME VARCHAR2(10)
);

DESC TB_CLASS_TYPE;

select * from user_constraints
where table_name = 'TB_CLASS_TYPE';


-- 31��
ALTER TABLE TB_CATEGORY
ADD CONSTRAINT tb_category_name_pk PRIMARY KEY(NAME);

select * from user_constraints
where table_name = 'TB_CATEGORY';


-- 32��
ALTER TABLE TB_CLASS_TYPE
MODIFY ( NAME CONSTRAINT tb_class_type_name_nn NOT NULL );

select * from user_constraints
where table_name = 'TB_CLASS_TYPE';

DESC TB_CLASS_TYPE;
DESC TB_CATEGORY;

-- 33��
ALTER TABLE TB_CATEGORY
MODIFY ( NAME VARCHAR2(20) );

ALTER TABLE TB_CLASS_TYPE
MODIFY ( NO VARCHAR2(10) );