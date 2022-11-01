package sdetbatch3.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class SortColors_DutchFlag_LC75_Medium {

	/* Sort Colors - https://leetcode.com/problems/sort-colors/
	 * Time Complexity - O[n]
	 * Space Complexity - O[n]
	 */
	
	@Test
	public void testData1() {
		int[] nums = {2,0,2,1,1,0};
		int[] output = {0,0,1,1,2,2};
		Assert.assertArrayEquals(solveSortColors(nums), output);
	}
	
	@Test
	public void testData2() {
		int[] nums = {2,0,1};
		int[] output = {0,1,2};
		Assert.assertArrayEquals(solveSortColors(nums), output);
	}
	
	@Test
	public void testData3() {
		int[] nums = {0,0,0};
		int[] output = {0,0,0};
		Assert.assertArrayEquals(solveSortColors(nums), output);
	}
	
	@Test
	public void testData4() {
		int[] nums = {1};
		int[] output = {1};
		Assert.assertArrayEquals(solveSortColors(nums), output);
	}
	
	@Test
	public void testData5() {
		int[] nums = {0,0,1,1,2,2};
		int[] output = {0,0,1,1,2,2};
		Assert.assertArrayEquals(solveSortColors(nums), output);
	}
	
	/* Pseudocode:
	 * - Initialize three pointers low, medium and high
	 * - Assign low and medium to zero. High to nums array length
	 * - Iterate nums array through middle pointer
	 *   - If middle pointer value = 0, swap middle and low, low++ and middle ++
	 *   - If middle pointer value = 1, middle++
	 *   - else, swap middle and high, high--
	 * - Return nums array 
	 */

	int temp;
	public int[] solveSortColors(int[] nums) {
		if(nums.length==1) return nums;
		int low=0,middle=0,high=nums.length-1;
		while(middle<=high) {
			if(nums[middle]==0) 
				nums = doSwap(low++,middle++,nums);
			else if(nums[middle]==1) 
				middle++;
			else nums = doSwap(middle,high--,nums);
		}
		return nums;
	}

	private int[] doSwap(int i, int j, int[] nums) {
		temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
		return nums;	
	}
	
}
