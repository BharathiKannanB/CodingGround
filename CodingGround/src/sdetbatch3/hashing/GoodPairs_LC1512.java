package sdetbatch3.hashing;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class GoodPairs_LC1512 {

	/*	Problem  : Number of Good Pairs - https://leetcode.com/problems/number-of-good-pairs/
	Time Complexity: O[n]
	Space Complexity: O[1]   */
	
	@Test
	public void testData1() {           
		int[] nums = {1,2,3,1,1,3};
		int output = 4;
		Assert.assertEquals(output, solveGoodPairs(nums));
	}
	
	@Test
	public void testData2() {           
		int[] nums = {1,1,1,1};
		int output = 6;
		Assert.assertEquals(output, solveGoodPairs(nums));
	}
	
	@Test
	public void testData3() {           
		int[] nums = {1,2,3};
		int output = 0;
		Assert.assertEquals(output, solveGoodPairs(nums));
	}
	
	@Test
	public void testData4() {           
		int[] nums = {1};
		int output = 0;
		Assert.assertEquals(output, solveGoodPairs(nums));
	}
	
	/* Pseudocode:
	 *  - Add all input array values into a hashmap, input as key, occurances as values
	 *  - Iterate the hashmap
	 *    - If value of key > 1
	 *       - output  += value* value-1/2
	 *  - Return output
	 */

	private int solveGoodPairs1(int[] nums) {
		HashMap<Integer,Integer> ipMap = new HashMap<>();
		int output=0;
		if(nums.length<2) return output;
		for(int i:nums) ipMap.put(i, ipMap.getOrDefault(i, 0)+1);
		for(int j:ipMap.values()) {
			if(j>1) output += j*(j-1)/2;
		}
		return output;
	}
	
	private int solveGoodPairs(int[] nums) {
		  int res = 0, count[] = new int[101];
	        for (int a: nums) {
	            res += count[a]++;
	        }
	        return res;
	}
	
}
