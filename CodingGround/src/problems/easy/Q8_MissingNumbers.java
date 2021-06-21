package problems.easy;

import java.util.Arrays;

import org.junit.Test;

public class Q8_MissingNumbers {
	
	/*
	 * S.No. : 8 
	 * Problem : Missing Numbers	 
	 * Link : https://leetcode.com/problems/missing-number/
	 * Author : BK 
	 * Version : 1.0
	 * Time Complexity:O[N] Space Complexity:O[1]
	 */
	@Test
	public void testcase1() {
			int[] nums = {0,1,3};
			System.out.println(missingNumberSolution3(nums));
	}
	
	@Test
	public void testcase2() {
			int[] nums = {0,2};
			System.out.println(missingNumberSolution3(nums));
	}

	@Test
	public void testcase3() {
			int[] nums = {3,6,7,1,2,8,5,0};
			System.out.println(missingNumberSolution3(nums));
	}
	
	@Test
	public void testcase4() {
			int[] nums = {3,6,7,1,2,8,5,0,4};
			System.out.println(missingNumberSolution3(nums));
	}
	
	@Test
	public void testcase5() {
			int[] nums = {0};
			System.out.println(missingNumberSolution3(nums));
	}
	
	/* Solution 1 - BruteForce/InBuilt method */
	private int missingNumberSolution1(int[] nums) {
		int len = nums.length;
		Arrays.sort(nums);
		if(nums[len-1]!=len) return len;
		for (int j = 0; j <= len; j++) {
			if(nums[j]!=j)
				return j;
		}
		return 0;
	}
	
	/* Solution 2 - XOR operator  */
	private int missingNumberSolution2(int[] nums) {
		int missing=nums.length;
		for (int i = 0; i < nums.length; i++) {
			missing^=i^nums[i];
		}
		return missing;
	}
	
	/* Solution 3 - n(n+1)/2  formula  */
	private int missingNumberSolution3(int[] nums) {
		int expectedSum=nums.length*(nums.length+1)/2;
		int actualSum = 0;
		for (int num:nums) {
			actualSum +=num;
		}
		return expectedSum-actualSum;
	}
	
	
}
