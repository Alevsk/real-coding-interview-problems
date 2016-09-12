select n,
case 
when P is Null then 'Root'
when N in (select P from bst) then 'Inner'
else 'Leaf'
end as "type"
from BST B order by n;