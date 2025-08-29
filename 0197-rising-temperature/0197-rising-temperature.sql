# Write your MySQL query statement below
Select w1.id as ID
from Weather as w1
join Weather as w2
on Date_sub(w1.recordDate,Interval 1 Day) = w2.recordDate
where w1.temperature>w2.temperature;