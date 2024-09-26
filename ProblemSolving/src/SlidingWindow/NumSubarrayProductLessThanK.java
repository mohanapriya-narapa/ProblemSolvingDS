package SlidingWindow;

public class NumSubarrayProductLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {10, 5, 2, 6};
		System.out.println(numSubarrayProductLessThanK(nums, 100));
	}

	private static int numSubarrayProductLessThanK(int[] nums, int k) {
		// TODO Auto-generated method stub
		int left=0;
		int ans=0;
		int cur=1;
		int end=0;
		while(end<nums.length)
		{
			cur=cur*nums[end];
			while(cur>=k)
			{
				cur=cur/nums[left];
				left++;
			}
			ans+=end-left+1;
			end++;
		}
		return ans;
	}

}
