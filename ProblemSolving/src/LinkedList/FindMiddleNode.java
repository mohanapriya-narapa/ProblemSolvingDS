package LinkedList;

import LinkedList.ReverseList.Listnode;

public class FindMiddleNode {
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
		System.out.println(findMiddleNode(head));
	}
	private static int findMiddleNode(Listnode head) {
		// TODO Auto-generated method stub
		Listnode slow=head;
		Listnode fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}

}
