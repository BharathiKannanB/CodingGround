package sdetbatch3.twopointer;

import org.junit.Test;

public class MinimumSizeSubarraySum_LC209_Medium {

	/*	Problem  :  Minimum Size Subarray Sum - https://leetcode.com/problems/minimum-size-subarray-sum/
	Time Complexity: O[n]
	Space Complexity: O[1]   */
	
	@Test
	public void testData1() {           //  Exp OP - 2
		int[] nums = {2,3,1,2,4,3};
		int target = 7; 
		System.out.println((solveMinimumSizeSubarraySum(nums,target)));
	}
	
	//@Test
	public void testData2() {           //  Exp OP - 1
		int[] nums = {1,4,4};
		int target = 4; 
		System.out.println((solveMinimumSizeSubarraySum(nums,target)));
	}
	
	//@Test
	public void testData3() {           //  Exp OP - 0
		int[] nums = {1,1,1,1,1,1,1,1};
		int target = 11; 
		System.out.println((solveMinimumSizeSubarraySum(nums,target)));
	}
	
	 @Test
	public void testData4() {           //  Exp OP - 3
		int[] nums = {1,1,1};
		int target = 3; 
		System.out.println((solveMinimumSizeSubarraySum(nums,target)));
	}
	
	//@Test
	public void testData5() {           //  Exp OP - 1
		int[] nums = {1};
		int target = 1; 
		System.out.println((solveMinimumSizeSubarraySum(nums,target)));
	}

	/* Pseudocode:
	 *  - Initialize two pointers grow & shrink
	 *  - Initialize sum = grow + shrink , min
	 *  - Iterate the input array till shrink < input length
	 *     - If sum is lesser than target, grow++, sum += grow
	 *     - If sum is greater than target, Min(min, grow-shrink+1) sum-=shrink, shrink++, 
	 * 
	 */
	private int solveMinimumSizeSubarraySum(int[] nums, int target) {
		if(nums.length==1 )
			if (nums[0]<target)return 0;
			else return nums[0];
		int grow=0,shrink=0;
		int sum = nums[shrink];
		int min = Integer.MAX_VALUE;
		while(shrink<nums.length-1&&grow<nums.length) {
		if(sum<target){
				sum += nums[grow++];		
			}
		if(sum>=target)
		{min = Math.min(min,grow-shrink+1);
		sum -= nums[shrink++];}
		}
			return min == Integer.MAX_VALUE ?0:min;
			
	}
	
}
