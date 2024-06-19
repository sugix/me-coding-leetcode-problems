# Write your MySQL query statement below

with cte as (select student_id
, (score = max(score) over (partition by exam_id))
    + (score = min(score) over (partition by exam_id)) as quiet
    from Exam
)
select c.student_id,s.student_name
  from cte c
join Student s on c.student_id = s.student_id
group by c.student_id
having sum(quiet) = 0
