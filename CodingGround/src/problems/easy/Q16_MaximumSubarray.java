package problems.easy;

import org.junit.Test;

/*
 * S.No. : 16
 * Problem : Maximum Subarray
 * Link : https://leetcode.com/problems/maximum-subarray/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q16_MaximumSubarray {
	@Test
	public void testcase1() {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maximumSubarraySolution2(nums));
	}
	//@Test
	public void testcase2() {
		int[] nums = {1};
		System.out.println(maximumSubarraySolution2(nums));
	}
	//@Test
	public void testcase3() {
		int[] nums = {5,4,-1,7,8};
		System.out.println(maximumSubarraySolution2(nums));
	}
	//@Test
	public void testcase4() {
		int[] nums = {4,1,-9,1,4};
		System.out.println(maximumSubarraySolution2(nums));
	}
	//@Test
	public void testcase5() {
		int[] nums = {-12,1,-13,2,-15,3};
		System.out.println(maximumSubarraySolution2(nums));
	}

	/* Solution 1 - Sliding Window  - not working*/
	private int maximumSubarraySolution1(int[] nums) {
		if(nums.length==1) return nums[0];
		int csum=nums[0]+nums[1],msum=0,lvalue=0,rvalue=1;
		while(rvalue<nums.length-1) {
			if(nums[lvalue]>=nums[rvalue]) {
				rvalue++;
				csum += nums[rvalue];
			}
			else { lvalue=rvalue;
			rvalue++;
			csum += nums[rvalue];
			}
			if(csum>msum)
				msum=csum;
		}
		return msum;
	}
	
	/* Solution 2 */
	private int maximumSubarraySolution2(int[] nums) {
		int sum = nums[0], max = nums[0];
	    for(int i = 1; i < nums.length; i++){
	        if(sum < 0){
	            sum = nums[i];
	        } else {
	            sum += nums[i];
	        }
	        max = Math.max(max, sum);
	    }
	    return max;
	}
}
