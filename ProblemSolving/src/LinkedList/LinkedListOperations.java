package LinkedList;

public class LinkedListOperations {

	public static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data)
		{
			this.next =null;
			this.data=data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head= new ListNode(2);
		ListNode first= new ListNode(3);
		ListNode second= new ListNode(4);
		ListNode third= new ListNode(5);
		ListNode fourth= new ListNode(6);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
//		print(head);	
//		ListNode newList =insertBeginning(head, 1);
//		insertAfter(second, 4);
		
//		print(newList);
//print(head);
//print(insertEnd(head,7));
//		System.out.println((find(head,9)));

//		deleteLast(head);
		print(head);	
		insertposition(head, 8, 3);
		
		deleteposition(head,3);
		print(head);
	}
	private static void deleteposition(ListNode head, int position) {
		// TODO Auto-generated method stub
	if(position==1)
	{
		ListNode temp=head;
		head=head.next;
		temp.next=null;
	}
	else
	{
		ListNode previous=head;
		int count=0;
		while(count<position-1)
		{
			previous=previous.next;
			count++;
		}
		ListNode current=previous.next;;
		previous.next=current.next;
		current.next=null;
	}
	}
	private static ListNode insertposition(ListNode head, int data, int position) {
		// TODO Auto-generated method stub
		ListNode current=head;
		ListNode newnode=new ListNode(data);
		if(position ==1)
		{
			newnode.next=head;
			return newnode;
		}
		else {
			ListNode previous=head;
			int count=1;
			while(count<position-1)
			{
				previous=previous.next;
				count++;
			}
			newnode.next=previous.next;
			previous.next=newnode;
			
			return head;
		}
	}
	private static void deleteLast(ListNode head) {
		// TODO Auto-generated method stub
		ListNode current=head;
		if(head==null)
			return;
		
		ListNode previous=null;
		while(current.next!=null)
		{
			previous=current;
			current=current.next;
		}
		previous.next=null;
		
	}
	private static boolean find(ListNode head, int data) {
		// TODO Auto-generated method stub
		if(head==null)
			return false;
		ListNode current=head;
		while(current!=null)
		{
			if(current.data==data)
			{
				return true;
			}
			current=current.next;
		}
		return false;
	}
	private static ListNode insertEnd(ListNode head, int data) {
		// TODO Auto-generated method stub

		ListNode newnode=new ListNode(data);
		if(head==null)
			return newnode;
		ListNode current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newnode;
		return head;
	}
	private static void deleteFirst(ListNode head) {
		// TODO Auto-generated method stub
	if(head==null)
		return;
	ListNode temp=head;
	head=head.next;
	temp.next=null;

	}
	private static int length(ListNode newList) {
		// TODO Auto-generated method stub
		if(newList==null)
			return 0;
		int count=0;
		ListNode current=newList;
		while(current!=null)
		{
			count++;
			current=current.next;
		}return count;
	}
	private static void insertAfter(ListNode current, int data) {
		// TODO Auto-generated method stub
		if(current==null)
			return;
		ListNode newNode =new ListNode(data);
		newNode.next=current.next;
		current.next=newNode;

	}
	private static ListNode insertBeginning(ListNode head, int data) {
		// TODO Auto-generated method stub
	ListNode newNode =new ListNode(data);
	if(head==null)
		return newNode;
	newNode.next=head;
//head=newNode;
return newNode;

	
	}
	private static void print(ListNode current) {
		
		ListNode head=current;
		if(head==null)
			return;
		// TODO Auto-generated method stub
		while(head!=null)
		{
			System.out.println(head.data); 
			head=head.next;
		}
	}

}
