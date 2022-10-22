package sdetbatch3.slidingwindow;

import org.junit.Test;

public class MaxiumumSubArray_KadaneAlgo_LC53 {

	/* Maximum Subarray (Solved using Kadane Algo)  - https://leetcode.com/problems/maximum-subarray/
	 * Time complexity - O[N]
	 * Space complexity - O[1]
	 */
	
	@Test
	public void testData1() {       // Exp. Op : 10
		int[] nums = {1,3,3,2,1};
		System.out.println(solveMaxiumumSubArray(nums));
	}
	
	@Test
	public void testData2() {       // Exp. Op : 6
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(solveMaxiumumSubArray(nums));
	}	

	
	@Test
	public void testData3() {       // Exp. Op : -1
		int[] nums = {-1,-2,-4,-3-11};
		System.out.println(solveMaxiumumSubArray(nums));
	}
	
	@Test
	public void testData4() {       // Exp. Op : 1
		int[] nums = {1};
		System.out.println(solveMaxiumumSubArray(nums));
	}

	private int solveMaxiumumSubArray(int[] nums) {
		if(nums.length==1) return nums[0];
		int max=Integer.MIN_VALUE,sum=0;
		for(int i:nums) {
			sum+= i;
			if(sum>max)max=sum;
			if(sum<0) sum=0;
			
		}
		return max;
	}
	

	
	
}
