# Write your MySQL query statement below

/* select v.customer_id, count(1) as count_no_trans
from visits v
left join transactions t on v.visit_id = t.visit_id
where t.transaction_id is null
group by 1
*/

select v.customer_id, count(visit_id) as count_no_trans
from Visits v
where v.visit_id not in (select visit_id from Transactions)
group by 1
