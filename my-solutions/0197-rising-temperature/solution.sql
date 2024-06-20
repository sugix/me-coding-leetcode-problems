# Write your MySQL query statement below

/* with cte as (
select distinct w.id
, lag(temperature) over (order by recorddate) as prev_day_temp
, temperature
from weather w)
select id
from cte
where prev_day_temp < temperature
and id is not null
*/

select distinct w.id
from Weather w, Weather w2 
where datediff(w.recordDate, w2.recordDate)=1 
and w.temperature>w2.temperature
