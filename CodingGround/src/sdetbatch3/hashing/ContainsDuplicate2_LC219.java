package sdetbatch3.hashing;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicate2_LC219 {

	/* Contains duplicate 2 - https://leetcode.com/problems/contains-duplicate-ii/
	 * Time Complexity - O[n]
	 * Space Complexity - O[n]
	 */
	
	@Test
	public void testData1() {			// Positive case
		int[] nums = {1,2,3,1};
		int k = 3;
		boolean output = true;
		Assert.assertEquals(solveContainsDuplicate(nums,k), output);
	}
	
	@Test
	public void testData2() {			// Positive case
		int[] nums = {1,0,1,1};
		int k = 1;
		boolean output = true;
		Assert.assertEquals(solveContainsDuplicate(nums,k), output);
	}
	
	@Test
	public void testData3() {			// Negative case
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		boolean output = false;
		Assert.assertEquals(solveContainsDuplicate(nums,k), output);
	}
	
	@Test
	public void testData4() {			// Positive case
		int[] nums = {1,0,1,1};
		int k = 5;
		boolean output = true;
		Assert.assertEquals(solveContainsDuplicate(nums,k), output);
	}
	
	@Test
	public void testData5() {			// Edge case
		int[] nums = {1};
		int k = 1;
		boolean output = false;
		Assert.assertEquals(solveContainsDuplicate(nums,k), output);
	}
	
	@Test
	public void testData6() {			// Edge case
		int[] nums = {1,2,3,1};
		int k = 0;
		boolean output = false;
		Assert.assertEquals(solveContainsDuplicate(nums,k), output);
	}
	
	/* Pseudocode:
	 * - Initialize Hashmap cMap
	 * - Iterate through the input array nums
	 *   - If nums[i] is not present in cMap, add nums[i] value as key and nums[i] index as value in cMap
	 *   - If nums[i] is present in cMap,
	 *   	- If index of nums[i] - index of key in cMap <= k, return true
	 *   	- Else update the nums[i] index as value in cMap
	 * - Return false		
	 */
	
	// Solution - Hashing
	private boolean solveContainsDuplicate(int[] nums, int k) {
		if(nums.length<2||k<1) return false;   				 // To catch edge cases
		HashMap<Integer,Integer> cMap = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!cMap.containsKey(nums[i])) cMap.put(nums[i], i); // add value and index to map
			else {
				if(i-cMap.get(nums[i])<=k) return true;  // If difference of index in map and array index is greater retrun true
				else cMap.put(nums[i],i);
			}
		}
		return false;       						// return false if no combination has been acheived
	}
	
	
}
