package PrefixSum;

public class WaysToSplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {10,4,-8,7};
		System.out.println(waysToSplitArray(nums));
	}

	private static int waysToSplitArray(int[] nums) {
		// TODO Auto-generated method stub
		int[] prefix=new int[nums.length];
		prefix[0]=nums[0];
		int count=0;
		int leftSum=0; int rightSum=0;
		for(int i=1;i<nums.length;i++)
		{
			prefix[i]=prefix[i-1]+nums[i];
		}
		for(int i=0;i<nums.length-1;i++)
		{
			leftSum=prefix[i];
			rightSum=prefix[nums.length-1]-prefix[i];
			if(leftSum>=rightSum)
				count++;
		}
		return count;
	}

}
