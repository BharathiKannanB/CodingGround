package problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/*
 * S.No. : 12 
 * Problem : Two Sum
 * Link : https://leetcode.com/problems/two-sum/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q12_TwoSum {

	@Test
	public void testcase1() {
		int[] nums = {2,11,7,15};
		int target =  9;
		System.out.println(Arrays.toString((twoSumSolution2(nums,target))));
	}
	
	@Test
	public void testcase2() {
		int[] nums = {3,2,4};
		int target =  6;
		System.out.println(Arrays.toString((twoSumSolution2(nums,target))));
	}
	
	@Test
	public void testcase3() {
		int[] nums = {3,3};
		int target =  6;
		System.out.println(Arrays.toString((twoSumSolution2(nums,target))));
	}

	@Test
	public void testcase4() {
		int[] nums = {-2,7,11,15};
		int target =  13;
		System.out.println(Arrays.toString((twoSumSolution2(nums,target))));
	}
	
	//@Test
	public void testcase5() {
		int[] nums = {-2,7,11,14};
		int target =  13;
		System.out.println(twoSumSolution2(nums,target));
	}
	
	/* Solution 1 - Brute Force */
	private int[] twoSumSolution1(int[] nums, int target) {
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) return new int[] {i,j};
			}
		}	
		return null;
	}
	
	/* Solution 2 - One Pass*/
	private int[] twoSumSolution2(int[] nums, int target) {
		int complement;
		Map<Integer, Integer> op = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			complement = target - nums[i];
			if(op.containsKey(complement))
					return new int[] {op.get(complement),i};
			op.put(nums[i], i);
		}
		return null;
	}
	
	
}
