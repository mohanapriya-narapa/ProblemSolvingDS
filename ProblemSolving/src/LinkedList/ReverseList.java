package LinkedList;

import LinkedList.DeleteNode.Listnode;

public class ReverseList {
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
		Listnode fourth=new Listnode (4);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		Listnode newList =reverseList(head);
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
	private static Listnode reverseList(Listnode head) {
		// TODO Auto-generated method stub
		Listnode cur=head;
		if(head==null)
			return head;
		Listnode prev=null;
		while(cur!=null)
		{
			Listnode next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		return prev;
		
	}

}
