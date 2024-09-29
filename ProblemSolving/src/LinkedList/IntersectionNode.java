package LinkedList;

import LinkedList.NodeFromLast.Node;

public class IntersectionNode {
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
		Node first=new Node(10);
		Node second=new Node(12);
		Node third=new Node(3);
		Node fourth=new Node(5);
		Node fifth=new Node(2);
		Node sixth=new Node(9);
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		Node firstOne=new Node(9);
		firstOne.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		 System.out.println(getNode(first,firstOne ));
	}
	private static int getNode(Node first, Node second) {
		// TODO Auto-generated method stub
		int c1=getCount(first);
		int c2=getCount(second);
		if(c1>c2)
		{
			return getIntersectionNode(first,second,c1-c2);
		}
		else {
			return getIntersectionNode(second,first,c2-c1);
		}
		
	}
	private static int getIntersectionNode(Node first, Node second, int d) {
		// TODO Auto-generated method stub
		Node cur1=first;
		Node cur2=second;
		for(int i =0;i<d;i++)
		{
			cur1=cur1.next;
		}
		while(cur1!=null && cur2!=null)
		{
			if(cur1==cur2)
			{
				return cur1.data;
			}
			cur1=cur1.next;
			cur2=cur2.next;
		}return -1;
	}
	private static int getCount(Node head) {
		// TODO Auto-generated method stub
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}

}
