package LinkedList;

import LinkedList.LoopDetection.ListNode;

public class MergeLinkedLists {
public static class ListNode{
		
		private int data;
		private ListNode next;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(1);
		ListNode fifth=new ListNode(2);
		ListNode sixth=new ListNode(3);
		first.next=second;
		second.next=third;
		fourth.next=fifth;
		fifth.next=sixth;
		ListNode newNode =mergeLinkedLists(first,fourth);
		println(newNode);
	}

	private static void println(ListNode node) {
		// TODO Auto-generated method stub
	ListNode current=	node;
	while(current!=null)
	{System.out.println(current.data);
		current=current.next;
	}
	}

	private static ListNode mergeLinkedLists(ListNode l1, ListNode l2) {
		// TODO Auto-generated method stub
		ListNode dummy =new ListNode(0);
		ListNode current=dummy;
		while(l1!=null || l2!=null)
		{
			if(l1==null || (l2.data<l1.data))
			{
				current.next=l2;
				l2=l2.next;
				current=current.next;
			}
			else
			{

				current.next=l1;
				l1=l1.next;
				current=current.next;
			}
		}
		return dummy.next;
	}

}
