package LinkedList;

import LinkedList.IntersectionNode.Node;
import java.util.*;
public class Palindrome {
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
		Node third=new Node (2);
		Node fourth=new Node (1);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		System.out.println(palindrome(head));
	}
	private static boolean palindrome(Node head) {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast=head;
		Stack<Integer> st=new Stack<>();
		while(fast!=null && fast.next!=null)
		{
			st.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null)
			slow=slow.next;
		while(slow!=null)
		{
			int top=st.pop();
			if(top!=slow.data)
			{
				return false;
			}
			slow=slow.next;
		}
		
		return true;
	}

}
