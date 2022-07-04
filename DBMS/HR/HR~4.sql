CREATE TABLE salary300
as
select  FIRST_NAME AS ENAME,
            salary AS SALARY,
            (salary + 300) AS "SALARY+300"
FROM employees;

drop table salary300;

select * from salary300;
-- 1
select ename, salary, salary+300
from employee;
-- 2
select ename, salary, salary*12+100
from employee order by salary*12+100 desc;
-- 3
select ename, salary from employee where salary> 2000 order by salary desc;
-- 4 
select ename, eno from employee where eno=108;
-- 5
select ename, salary
from employee
where salary not between 2000 and 3000;
-- 6
select first_name, job_id, hire_date
from employees
where hire_date between '81/02/20' and '81/05/01';
-- 7
select ename, eno
from employee
where eno in (101, 102)
order by ename;
--8
select ename, salary, eno
from employee
where salary between 2000 and 3000 and eno in(101,102)
order by ename;
--9
select first_name, hire_date from employees where hire_date like '03%'; 