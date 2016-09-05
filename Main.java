import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Node a=new Node(9);
		Node b=new Node(5,a);
		Node c=new Node(2,b);
		Node head=new Node(8,c);
		Node a2=new Node(3);
		Node b2=new Node(5,a2);
		Node c2=new Node(2,b2);
		Node head2=new Node(8,c2);
		Node p=addListsR(head,head2);
		while(p!=null){
			System.out.println(p.data);
			p=p.next;
		}

	}
	//add numbers in two singly linked list 8-2-5-9,8-2-5-3, return 6-5-0-3-1
	//new Node result, add value=(carry+l1.data+l2.data),value % 10 as result.data
	//recursion
	//new Node more, result.next=more,(value/10)is the new carry, add l1.next, l2.next, new carry as more
	
	public static Node addLists(Node l1, Node l2, int carry){
		if(l1==null && l2==null && carry==0)return null;
		
		Node result=new Node(carry, null);
		int value=carry;
		if(l1!=null) value+=l1.data;
		if(l2!=null) value+=l2.data;
		result.data=value%10;
		if(l1!=null || l2!=null){//if there is one is not null, keep adding until both of them are null,return Node(carry,null)
			Node more=addLists(l1==null?null:l1.next,l2==null?null:l2.next,value/10);//recursion
			result.next=more;//it is not directly returning the result, put it as result.next
		}
		return result;
	}
	
	//if add two linked lists in reversed order
	//8-2-5-9,8-2-5-3 return 1-6-5-1-2
	//reverse l1 and l2, add the reversed list, then reverse the result
	
	public static Node addListsR(Node l1,Node l2){
		Node n1=reverse(l1);
		Node n2=reverse(l2);
		Node n3= addLists(n1,n2,0);
		return reverse(n3);
	
	}
	public static Node reverse(Node n){
		if(n==null)return null;
		Node head=null;
		while(n!=null){
			Node p=n.next;
			n.next=head;
			head=n;
			n=p;
		
		}
		return head;
	}
	
}
