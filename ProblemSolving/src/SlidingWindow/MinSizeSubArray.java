package SlidingWindow;
import java.util.*;
public class MinSizeSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {2,3,1,2,4,3};
System.out.println(minSubArrayLen(nums,7));
	}

	private static int minSubArrayLen(int[] nums, int target) {
		// TODO Auto-generated method stub
		int start=0;
		int end=0;
		int sum=0;
		int minLen=Integer.MAX_VALUE;
		while(end<nums.length)
		{
			sum+=nums[end];
			while(sum>=target)
			{ int len=end-start+1;
			minLen=Math.min(len, minLen);
				sum=sum-nums[start++];
				
			}end++;
		}
		return minLen;
	}

}
