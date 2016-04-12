# Write your MySQL query statement below

#select Num from (select Num,count(distinct Num) as cnt from Logs)a where a.cnt>=3;

SELECT  DISTINCT(Num) AS ConsecutiveNums
FROM (
    SELECT
    Num,
    @counter := IF(@prev = Num, @counter + 1, 1) AS how_many_cnt_in_a_row,
    @prev := Num
    FROM Logs y, (SELECT @counter:=1, @prev:=NULL) vars
) sq
WHERE how_many_cnt_in_a_row >= 3
