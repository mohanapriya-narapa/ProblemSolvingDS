package Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr =new int[] {1,2,3,2};
int start=0;
int end=arr.length-1;
while(start<end)
{
	int temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
	start++;
	end--;
}
for(int x:arr)
{
	System.out.println(x);
}
	}

}
