package codinground.prep;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class UniqueOccurences {

	/* https://leetcode.com/problems/unique-number-of-occurrences/
	 * Time complexity - O[n]
	 * Space complexity - O[n]
	 */
	
	@Test
	public void testData1() {				// +ve case
		int input[] = {1,2,2,1,1,3};
		boolean output = true;
		Assert.assertEquals(output, solveUniqueOccurences(input));
	}
	
	@Test
	public void testData2() {				// -ve case
		int input[] = {1,2};
		boolean output = false;
		Assert.assertEquals(output, solveUniqueOccurences(input));
	}
	
	@Test
	public void testData3() {				// +ve case
		int input[] = {-3,0,1,-3,1,1,1,-3,10,0};
		boolean output = true;
		Assert.assertEquals(output, solveUniqueOccurences(input));
	}
	
	@Test
	public void testData4() {				// edge case
		int input[] = {};
		boolean output = true;
		Assert.assertEquals(output, solveUniqueOccurences(input));
	}
	
	@Test
	public void testData5() {				// edge case
		int input[] = {1};
		boolean output = true;
		Assert.assertEquals(output, solveUniqueOccurences(input));
	}

	/* Solution using HashMap */
	private boolean solveUniqueOccurences(int[] input) {
		if(input.length<=1) return true;
		HashMap<Integer,Integer> occurence = new HashMap<>();
		for(int num:input)
			occurence.put(num, occurence.getOrDefault(num,0)+1);
		HashSet<Integer> uniqueOccurence = new HashSet<>();
		for(int num:occurence.values())
			if(!uniqueOccurence.add(num)) return false;
		return true;
	}
}
