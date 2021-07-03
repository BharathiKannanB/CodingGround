package problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Q07_ContainsDuplicate {

	/*
	 * S.No. : 7 Problem : Contains Duplicates Link :
	 * https://leetcode.com/problems/contains-duplicate/ 
	 * Author : BK 
	 * Version : 1.0
	 * Time Complexity:O[N] Space Complexity:O[1]
	 */
	@Test
	public void testcase1() {
		int[] nums = { 1, 2, 3, 1 };
		System.out.println(containsDuplicatesSolution3(nums));
	}

	@Test
	public void testcase2() {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(containsDuplicatesSolution3(nums));
	}

	@Test
	public void testcase3() {
		int[] nums = { 1, 1, 3, 1 };
		System.out.println(containsDuplicatesSolution3(nums));
	}

	@Test
	public void testcase4() {
		int[] nums = { 1, 1, 3, 3, 4 };
		System.out.println(containsDuplicatesSolution3(nums));
	}

	@Test
	public void testcase5() {
		int[] nums = { 1 };
		System.out.println(containsDuplicatesSolution3(nums));
	}

	@Test
	public void testcase6() {
		int[] nums = { 1, 1, 1 };
		System.out.println(containsDuplicatesSolution3(nums));
	}

	/* Solution 1 - BruteForce/Inbuilt method */
	private boolean containsDuplicatesSolution1(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])	return true;}
		return false;
	}
	
	/* Solution 2 - Map */
	private boolean containsDuplicatesSolution2(int[] nums) {
		Map<Integer, Integer> output = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if(output.containsKey(i))return true;
			else output.put(i, 0);
		}
		return false;
	}
	
	/* Solution 3 - Set */
	private boolean containsDuplicatesSolution3(int[] nums) {
		Set<Integer> output = new HashSet<Integer>();
		for (int i : nums) {
			if(output.contains(i))return true;
			else output.add(i);
		}
		return false;
	}

}
