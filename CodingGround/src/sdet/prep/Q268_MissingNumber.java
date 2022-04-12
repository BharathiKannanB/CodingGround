package sdet.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Q268_MissingNumber {

	/*
	 * S.No. : 268 Problem : Missing Number :
	 * https://leetcode.com/problems/missing-number/
	 * Author : BK 
	 * Version : 1.0
	 * Time Complexity:O[N] Space Complexity:O[1]
	 */
	@Test
	public void testcase1() {
		int[] nums = {3,0,1};
		System.out.println(containsDuplicatesSolution2(nums));
	}

	@Test
	public void testcase2() {
		int[] nums = { 0,1 };
		System.out.println(containsDuplicatesSolution2(nums));
	}

	@Test
	public void testcase3() {
		int[] nums = { 9,6,4,2,3,5,7,0,1};
		System.out.println(containsDuplicatesSolution2(nums));
	}

	@Test
	public void testcase4() {
		int[] nums = { 1,2,3 };
		System.out.println(containsDuplicatesSolution2(nums));
	}

	

	/* Solution 1 - BruteForce/Inbuilt method */
	private int containsDuplicatesSolution1(int[] nums) {
		Arrays.sort(nums);int k=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=k) break;
			k++;
		}
		return k;
	}
	
	/* Solution 2 - n*(n+1)/2 */
	private int containsDuplicatesSolution2(int[] nums) {
		int sum=0, n= nums.length;
		for (int i: nums) sum+=i;
		return (n*(n+1)/2)-sum;
	}
	

}
