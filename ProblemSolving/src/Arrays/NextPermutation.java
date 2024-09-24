package Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,2,3};
nextPermutation(nums);
for(int x:nums)
{
	System.out.println(x);
}
	}

	private static void nextPermutation(int[] nums) {
		// TODO Auto-generated method stub
		int i=nums.length-2;
		int j=nums.length-1;
		while(i>=0 && nums[i+1]<=nums[i])
		{
			i--;
		}
		if(j>0)
		{

			while(j>=0 && nums[j]<=nums[i])
			{
				j--;
			}
			swap(nums,i,j);
		}
		reverse(nums,i+1);

	}

	private static void reverse(int[] nums, int start) {
		// TODO Auto-generated method stub
		int i=start; int j=nums.length-1;
		while(i<j)
		{
			swap(nums,i,j);
			i++;
			j--;
		}
	}

	private static void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
	
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
		
	}

}
