package SlidingWindow;

public class LongestSubarrayLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {3, 1, 2, 7, 4, 2, 1, 1, 5};
System.out.println(longestSubarrayLessThanK(nums,8));
	}

	private static int longestSubarrayLessThanK(int[] nums, int k) {
		// TODO Auto-generated method stub
		int sum=0;
		int maxLen=0;
		int left=0;
		int end=0;
		while(end<nums.length)
		{
			sum+=nums[end];
			while(sum>k)
			{
				sum=sum-nums[left];
				left++;
			}
			maxLen=Math.max(maxLen, end-left+1);
			end++;
		}
		return maxLen;
	}

}
