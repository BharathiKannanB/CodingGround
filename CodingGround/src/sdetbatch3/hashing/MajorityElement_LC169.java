package sdetbatch3.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElement_LC169 {

	/*	Problem  : Majority Element - https://leetcode.com/problems/majority-element/description/
	Time Complexity: O[n]
	Space Complexity: O[1]   */
	
	@Test
	public void testData1() {      // Positive case     
		int[] nums = {3,2,3};
		int output = 3;
		Assert.assertEquals(output, solveMajorityElement(nums));
	}
	
	@Test
	public void testData2() {      // Positive case 
		int[] nums = {2,2,1,1,1,2,2};
		int output = 2;
		Assert.assertEquals(output, solveMajorityElement(nums));
	}
	
	@Test
	public void testData3() {      // Positive case 
		int[] nums = {3,2,3,3};
		int output = 3;
		Assert.assertEquals(output, solveMajorityElement(nums));
	}
	
	@Test
	public void testData4() {     // edge case 
		int[] nums = {3};
		int output = 3;
		Assert.assertEquals(output, solveMajorityElement(nums));
	}
	
	@Test
	public void testData5() {	 // edge case 
		int[] nums = {3,3,3};
		int output = 3;
		Assert.assertEquals(output, solveMajorityElement(nums));
	}

	/* Pseudocode:
	 * - Initialize HashMap - iMap
	 * - Iterate through the input nums
	 *     - Add all nums values as keys and occurances as values to iMap
	 * - Iterate through iMap values
	 *     - If iMap value exceeds n/2 return iMap key
	 * - else return 0
	 */
	
	private int solveMajorityElement(int[] nums) {
		HashMap<Integer,Integer> iMap = new HashMap<>();
		for(int num:nums)
			iMap.put(num, iMap.getOrDefault(num, 0)+1);
		for(Entry<Integer,Integer> entry:iMap.entrySet()) {
			if(entry.getValue()>nums.length/2) return entry.getKey();
		}
		return 0;
	}
}
