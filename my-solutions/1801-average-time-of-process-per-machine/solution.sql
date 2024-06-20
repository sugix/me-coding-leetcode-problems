# Write your MySQL query statement below

with cte as (
select a.machine_id, a.process_id, a2.timestamp-a.timestamp as process_time
from activity a
join activity a2 on a.machine_id = a2.machine_id and a.process_id = a2.process_id and a2.activity_type = 'end'
where a.activity_type = 'start')
select machine_id, round(sum(process_time)/count(process_id),3) as processing_time
from cte
group by 1
