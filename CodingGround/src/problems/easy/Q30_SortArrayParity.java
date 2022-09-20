package problems.easy;

import java.util.Arrays;

import org.junit.Test;

/*
 * S.No. : 30
 * Problem : Sort Array by Parity ii
 * Link : https://leetcode.com/problems/sort-array-by-parity-ii/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */


public class Q30_SortArrayParity {

	@Test
	public void testData1() {   // even + odd
		int[] nums = {4,2,5,7};
		System.out.println(Arrays.toString(sortedArrayParitySolution1(nums)));
	}

	@Test
	public void testData2() {   // with duplicates
		int[] nums = {1,1,2,4};
		System.out.println(Arrays.toString(sortedArrayParitySolution1(nums)));
	}
	
	@Test
	public void testData3() {   // only one odd and even value
		int[] nums = {1,4};
		System.out.println(Arrays.toString(sortedArrayParitySolution1(nums)));
	}
	
	@Test
	public void testData4() {     // odd + even
		int[] nums = {3,7,8,12};
		System.out.println(Arrays.toString(sortedArrayParitySolution1(nums)));
	}
	
	@Test
		public void testData5() {    //interchanged odd and even
			int[] nums = {1,4,5,8};
			System.out.println(Arrays.toString(sortedArrayParitySolution1(nums)));
		}
	
	//@Test
	public void testData6() {    //edge case
		int[] nums = {1,3,6};
		System.out.println(Arrays.toString(sortedArrayParitySolution1(nums)));
	}
	
	/* Solution 1 - Two Pointer */
	private int[] sortedArrayParitySolution1(int[] nums) {
		int first=0,last=nums.length-1,even=0,odd=1;
		int[] op = new int[nums.length];
		while(first<last) {
			if(nums[first]%2==0)
			{
				op[even]=nums[first];
				even+=2;
			}
			else {
				op[odd]=nums[first];
				odd+=2;
			}
			if(nums[last]%2==0)
			{
				op[even]=nums[last];
				even+=2;
			}
			else {
				op[odd]=nums[last];
				odd+=2;
			}
			first++;
			last--;
		}
		return op;
	}
}
