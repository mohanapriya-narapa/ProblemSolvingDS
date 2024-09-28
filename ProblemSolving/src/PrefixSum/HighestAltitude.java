package PrefixSum;

public class HighestAltitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {-5,1,5,0,-7};
		System.out.println(largestAtltitude(nums));
	}

	private static int largestAtltitude(int[] nums) {
		// TODO Auto-generated method stub
		int[] res=new int[nums.length+1];
		int max=-99999;
		res[0]=0;
		for(int i=0;i<nums.length;i++)
		{
			res[i+1]=nums[i]+res[i];
		}
		for(int i=0;i<res.length;i++)
		{
			max=Math.max(res[i], max);
		}
		
		
		return max;
	}

}
