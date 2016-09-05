# AddLists
Add numbers in a singly list backwards and forwards

//add numbers in two singly linked list 8-2-5-9,8-2-5-3, return 6-5-0-3-1

//new Node result, add value=(carry+l1.data+l2.data),value % 10 as result.data

//recursion

//new Node more, result.next=more,(value/10)is the new carry, add l1.next, l2.next, new carry as more

Follow up 

//if add two linked lists in reversed order

//8-2-5-9,8-2-5-3 return 1-6-5-1-2

//reverse l1 and l2, add the reversed list, then reverse the result
