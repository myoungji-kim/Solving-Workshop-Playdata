show user;

update TB_STUDENT 
set absence_yn = 'Y' 
where STUDENT_NO in ('9556017', '9732111', '9747034');
rollback;

		select STUDENT_NO �й�, STUDENT_NAME �̸�,
			rpad(substr(STUDENT_SSN, 0, 8), 14, '*') �ֹι�ȣ,
			substr(STUDENT_ADDRESS, 0, 10)||'...' �ּ�,
			to_char(ENTRANCE_DATE, 'yyyy/mm/dd') ���г⵵, 
			ABSENCE_YN ���п��� 
		from TB_STUDENT 
		where STUDENT_NAME like '%��%'
		order by 1;

SELECT ABSENCE_YN 
FROM TB_STUDENT 
where STUDENT_NO 
in ('9556017', '9732111', '9747034') order by 1;

update TB_STUDENT set ABSENCE_YN = 'Y' where STUDENT_NO in ('9556017','9732111','9747034');


select student_no as �й�, 
          department_no, student_name, RPAD (SUBSTR(student_ssn), 1, 8), 14, '*') as student_ssn, 
          SUBSTR(student_address, 0, 10) || '...' as student_address, TO_CHAR(entrance_date, 'YYYY/MM/DD') as ���г⵵, absence_yn 
from TB_STUDENT;

select student_no as �й� from TB_STUDENT;







