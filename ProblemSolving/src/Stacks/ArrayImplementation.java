package Stacks;

public class ArrayImplementation {
	public static int[] arr = new int[]{ -1,-1,-1,-1,-1,-1,-1,-1,-1};
	public static int[] head= new int[] {-1,-1,-1};
	public static int stacknum=3;
	public static int stacksize=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
push(3,0);push(5,1);push(6,2);push(7,1);push(7,2);int top =pop(2); System.out.println(peek(1));
for(int x: arr)
{
	System.out.println(x);
}

	}
	private static int peek(int stackindex) {
		// TODO Auto-generated method stub
		if(head[stackindex]==-1)
			return -1;
		int offset=arrayOffset(stackindex, stacksize)+head[stackindex];
		return arr[offset];
	}

private static boolean isEmpty(int stackindex) {
	// TODO Auto-generated method stub
	if(head[stackindex]==-1)
		return true;
	return false;
}
	private static int pop(int stackindex) {
		// TODO Auto-generated method stub
		if(head[stackindex]==-1)
			return -1;
		int offset=arrayOffset(stackindex, stacksize)+head[stackindex];
		head[stackindex]--;
		return arr[offset];
	}
	private static void push(int i, int stackindex) {
		// TODO Auto-generated method stub
		head[stackindex]++;
		int offset=arrayOffset(stackindex, stacksize)+head[stackindex];
		arr[offset]=i;
	}
	private static int arrayOffset(int stackindex,int stacksize ) {
		// TODO Auto-generated method stub
		return stackindex*stacksize;
	}

}
