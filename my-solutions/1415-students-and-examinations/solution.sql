# Write your MySQL query statement below
with cte as (
select s.student_id, s.student_name, s2.subject_name, count(e.student_id) as attended_exams 
from students s 
cross join subjects s2
left join examinations e on s.student_id = e.student_id and s2.subject_name = e.subject_name
group by 1,2,3
order by 1)
select student_id, student_name, subject_name, coalesce(attended_exams,0) as attended_exams
from cte
group by 1,2,3

