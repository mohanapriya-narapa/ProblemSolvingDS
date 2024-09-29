package LinkedList;
import java.util.*;

import LinkedList.LinkedListOperations.ListNode;
public class RemoveDuplicates {
public static class Listnode{
	public  int data;
	public  Listnode next;
	public Listnode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Listnode head=new Listnode(1);
Listnode first=new Listnode(2);
Listnode second=new Listnode(3);
Listnode third=new Listnode(3);
Listnode fourth=new Listnode(4);
head.next=first;
first.next=second;
second.next=third;
third.next=fourth;

Listnode newNode =removeDuplicate(head);
print(newNode);

	}
	private static Listnode removeDuplicate(Listnode head) {
		  if (head == null) {
	            return head;
	        }
		// TODO Auto-generated method stub
		Listnode current=head;
		Listnode previous=null;
		HashSet<Integer> hs=new HashSet<>();
		while(current!=null)
		{
		if(hs.contains(current.data))
		{
			previous.next=current.next;
		}
		else {
			
			
			hs.add(current.data);
			previous=current;
		}
		current=current.next;
		}
		return head;
	}
private static void print(Listnode head) {
		
		Listnode current=head;
		if(head==null)
			return;
		// TODO Auto-generated method stub
		while(current!=null)
		{
			System.out.println(current.data); 
			current=current.next;
		}
	}
	
}
