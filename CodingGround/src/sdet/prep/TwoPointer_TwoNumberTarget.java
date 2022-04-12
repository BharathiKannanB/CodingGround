package sdet.prep;

import org.junit.Test;

public class TwoPointer_TwoNumberTarget {


	/*
	 * S.No. : Given an array of integers nums and an integer target, return indices of the two numbers 
	 * such that they add up to target.
		Input: nums = [1,4,5,8,11,12,16,21], target = 19
		Output: [3,4]
		Output: Because nums[3] + nums[4] == 19, we return [3, 4].
	 * Author : BK 
	 * Version : 1.0
	 * Time Complexity:O[N] Space Complexity:O[1]
	 */
	//@Test
	public void testcase1() {
		int[] nums = {1,4,5,8,11,12,16,21};
		int target = 19;
		System.out.println("Testcase 1");
		TwoPointerSolution(nums, target);
	}

	//@Test
	public void testcase2() {
		int[] nums = { 0,1,3,5,9 };
		int target = 8;
		System.out.println("Testcase 2");
		TwoPointerSolution(nums, target);
	}

	//@Test // Multiple indices
	public void testcase3() {
		int[] nums = { 1,2,3,4};
		int target = 5;
		System.out.println("Testcase 3");
		TwoPointerSolution(nums, target);
	}
	
	@Test // Duplicate values
	public void testcase4() {
		int[] nums = { 1,2,2,3,3,4};
		int target = 5;
		System.out.println("Testcase 4");
		TwoPointerSolution(nums, target);
	}
	
	//Two pointer Approach
	private void TwoPointerSolution(int[] nums, int target) {
		int first = 0; int second = nums.length-1;
		while(first<second) {
			if(nums[first]+nums[second]==target) {
				System.out.println("("+first+" "+second+")");
					if(nums[first]==nums[first+1]) first++;
					else second--;}
			else if(nums[first]+nums[second]<target)first++;
			else if(nums[first]+nums[second]>target)second--;
		}
	}
	
}

/*
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each unique element appears only once. The
 * relative order of the elements should be kept the same.
 * 
 * Input: nums = [1,1,2] Output: 2, nums = [1,2,_]
 * 
 * Input: nums = [0,0,1,1,1,2,2,3,3,4] Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 */