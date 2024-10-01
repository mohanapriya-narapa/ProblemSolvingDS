package Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {0,1,0,3,12};
moveZeros(arr);
for(int x: arr){
System.out.println(x);
}
	}

	private static void moveZeros(int[] arr) {
		// TODO Auto-generated method stub
		int track=0;
		for(int i=0;i<arr.length;i++)
		{if(arr[i]!=0)
			arr[track++]=arr[i];
		}
		for(int i=track;i<arr.length;i++)
		{
			arr[track++]=0;
		}
	}

}
