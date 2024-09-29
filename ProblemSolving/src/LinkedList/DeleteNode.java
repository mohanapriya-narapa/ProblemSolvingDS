package LinkedList;

public class DeleteNode {
public static class Listnode
{
	public int data;
	public Listnode next;
	public Listnode (int data)
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
		deleteNode(third);
		print(head);
		
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
	private static void deleteNode(Listnode node) {
		// TODO Auto-generated method stub
		Listnode next=node.next;
		node.data=node.data;
		node.next=node.next;
	}

}
