package sdetbatch3.slidingwindow;

import org.junit.Assert;
import org.junit.Test;



public class MaximumProductSubArray_LC152_Medium {

	/*	Problem  :   Maximum Product Subarray - https://leetcode.com/problems/maximum-product-subarray/
	Time Complexity: O[n^2]
	Space Complexity: O[1]   */
	
	@Test
	public void testData1() {
		int[] nums = {2,3,-2,4};
		Assert.assertEquals(solveMaxiumumProductSubArray(nums), 6);
	}
	
	@Test
	public void testData2() {
		int[] nums = {-2,-3,-2,-4};
		Assert.assertEquals(solveMaxiumumProductSubArray(nums), 48);
	}
	
	@Test
	public void testData3() {
		int[] nums = {2,3,4,4};
		Assert.assertEquals(solveMaxiumumProductSubArray(nums), 96);
	}
	
	@Test
	public void testData4() {
		int[] nums = {-2,0,-1};
		Assert.assertEquals(solveMaxiumumProductSubArray(nums), 0);
	}
	
	/* Pseudocode:(needs to be updated)
	 * - Initialize two pointers grow and shrink
	 * - Initialize current_product and max_product
	 * -  Iterate through the input array till shrink less than length of array
	 *      - If current_product <= current_product * grow value
	 *      			grow ++
	 *      - If current_product > current_product * grow value
	 *      			current_product = current_product * grow value
	 *      			max_product = Max of(current_product , max_product)
	 * - Return max_product
	 */	

	private int solveMaxiumumProductSubArray(int[] nums) {
		if(nums.length==1) return nums[0];
		int left=1,right=1,max=nums[0];
		for(int i=0;i<nums.length;i++) {
			left = left==0?1:left;
			right = right==0?1:right;
			left *= nums[i];
			right *= nums[nums.length-i-1];
			max = Math.max(max, Math.max(left, right));
		}
		return max;
	}

}
