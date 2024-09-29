package LinkedList;

import LinkedList.FindMiddleNode.Listnode;

public class OddEvenLinkedList {
	public static class Listnode {
		public int data;
		public Listnode next;
		public Listnode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listnode head=new Listnode (1);
		Listnode first=new Listnode (2);
		Listnode second=new Listnode (3);
		Listnode third=new Listnode (4);
		Listnode fourth=new Listnode (5);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		Listnode newList = oddEvenLinkedList(head);
		print(newList);
	}
	private static void print(Listnode head) {
		// TODO Auto-generated method stub
		Listnode current=head;
		if(head==null)
			return;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	private static Listnode oddEvenLinkedList(Listnode head) {
		if(head==null)
			return head;
		// TODO Auto-generated method stub
		Listnode odd=head;
		Listnode even=head.next;Listnode evenHead=head.next;
		while(even!=null && even.next!=null)
		{
			odd.next=even.next;
			odd=odd.next;
			even.next=odd.next;
			even=even.next;
		}
		
	odd.next=evenHead;
	return head;
	}

}
