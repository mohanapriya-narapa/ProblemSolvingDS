package LinkedList;
import java.util.*;
public class NodeFromLast {
	public static class Node
	{
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data=data;
		this.next=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node (1);
		Node first=new Node (2);
		Node second=new Node (3);
		Node third=new Node (4);
		Node fourth=new Node (5);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		System.out.println(nthNodeFromLast(head,2));
	}
	private static int nthNodeFromLast(Node head, int k) {
		// TODO Auto-generated method stub
		int count=0;
		Node slow=head;
		Node fast=head;
		while(count<k)
		{
			fast=fast.next;
			count++;
		}
		while(fast!=null)
		{
			fast=fast.next;
			slow=slow.next;
		}
		return slow.data;
	}

}
