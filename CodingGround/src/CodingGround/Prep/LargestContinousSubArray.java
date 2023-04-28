package codinground.prep;

import org.junit.Assert;
import org.junit.Test;

public class LargestContinousSubArray {
	
	/* Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.
 
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4] 
	 * 
	 * Time Complexity:
	 * Space Complexity:
	 */
	
	@Test
	public void testData1() { 			//+ve case
		int[] input = {-2,1,-3,4,-1,2,1,-5,4}; 
		int output = 6;
		Assert.assertEquals(output, solveLargestContinousSubArray(input));
	}
	
	@Test
	public void testData2() { 			//+ve case
		int[] input = {1,5,2,3}; 
		int output = 11;
		Assert.assertEquals(output, solveLargestContinousSubArray(input));
	}
	
	@Test
	public void testData3() { 			//-ve case
		int[] input = {-5,-1,-3,-2}; 
		int output = -1;
		Assert.assertEquals(output, solveLargestContinousSubArray(input));
	}
	
	@Test
	public void testData4() { 			//edge case
		int[] input = {1}; 
		int output = 1;
		Assert.assertEquals(output, solveLargestContinousSubArray(input));
	}

	/* Pseudo code:
	 * Iterate the input array through two loops
	 * 		if sum > maxSum 
	 * 			maxSum = sum
	 */
	
	
	// Solution 1 - Brute Force
	private int solveLargestContinousSubArray2(int[] input) {
		if(input.length==1) return input[0];
		int maxSum = Integer.MIN_VALUE,currentSum=0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i; j < input.length; j++) {
				currentSum += input[j];
				maxSum = Math.max(maxSum, currentSum);
			}
			currentSum=0;
		}
		return maxSum;
	}
	
	// Solution 2 - Kadane's Algorithm
	private int solveLargestContinousSubArray(int[] input) {
		if(input.length==1) return input[0];
		int maxSum = Integer.MIN_VALUE,currentSum=0;
		for (int i = 0; i < input.length; i++) {
			currentSum += input[i];
			maxSum = Math.max(maxSum, currentSum);
			if(currentSum<0) currentSum=0;
		}
		return maxSum;
	}
	
	

}
