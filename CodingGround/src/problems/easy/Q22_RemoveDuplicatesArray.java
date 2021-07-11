package problems.easy;

import org.junit.Test;

/*
 * S.No. : 22
 * Problem : Remove Duplicates from Sorted Array
 * Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q22_RemoveDuplicatesArray {

	@Test
	public void testcase1() {
		int[] nums = {1,1,2};
		System.out.println(removeDuplicatesArraySolution(nums));    // Expected Result : 2
	}
	
	@Test
	public void testcase2() {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicatesArraySolution(nums));    // Expected Result : 5
	}
	
	@Test
	public void testcase3() {
		int[] nums = {1,1,1};
		System.out.println(removeDuplicatesArraySolution(nums));    // Expected Result : 1
	}
	
	@Test
	public void testcase4() {
		int[] nums = {1,2,3};
		System.out.println(removeDuplicatesArraySolution(nums));    // Expected Result : 3
	}
	
	@Test
	public void testcase5() {
		int[] nums = {1};
		System.out.println(removeDuplicatesArraySolution(nums));    // Expected Result : 1
	}

	
	/* Solution 1 - Two Pointer */
	private int removeDuplicatesArraySolution(int[] nums) {
		if(nums.length==1) return 1;
		int left=0,right=1,op=1; 
		while(right<nums.length) {
		if(nums[left]!=nums[right]) {
			left=right;
			right++;
			op++;
		}
		else right++;
		}		
		return op;
	}
}
