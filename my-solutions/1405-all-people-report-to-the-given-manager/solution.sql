# Write your MySQL query statement below
with recursive boss as (
select employee_id
from Employees
where manager_id = 1
union
select e.employee_id
from Employees e
join boss b on b.employee_id = e.manager_id)
select e.employee_id
from boss b
join Employees e on
b.employee_id = e.employee_id
where b.employee_id <> 1
