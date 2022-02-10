show user;

update TB_STUDENT 
set absence_yn = 'Y' 
where STUDENT_NO in ('9556017', '9732111', '9747034');
rollback;

		select STUDENT_NO 학번, STUDENT_NAME 이름,
			rpad(substr(STUDENT_SSN, 0, 8), 14, '*') 주민번호,
			substr(STUDENT_ADDRESS, 0, 10)||'...' 주소,
			to_char(ENTRANCE_DATE, 'yyyy/mm/dd') 입학년도, 
			ABSENCE_YN 휴학여부 
		from TB_STUDENT 
		where STUDENT_NAME like '%이%'
		order by 1;

SELECT ABSENCE_YN 
FROM TB_STUDENT 
where STUDENT_NO 
in ('9556017', '9732111', '9747034') order by 1;

update TB_STUDENT set ABSENCE_YN = 'Y' where STUDENT_NO in ('9556017','9732111','9747034');


select student_no as 학번, 
          department_no, student_name, RPAD (SUBSTR(student_ssn), 1, 8), 14, '*') as student_ssn, 
          SUBSTR(student_address, 0, 10) || '...' as student_address, TO_CHAR(entrance_date, 'YYYY/MM/DD') as 입학년도, absence_yn 
from TB_STUDENT;

select student_no as 학번 from TB_STUDENT;







