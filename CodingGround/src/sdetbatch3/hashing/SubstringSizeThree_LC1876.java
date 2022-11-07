package sdetbatch3.hashing;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class SubstringSizeThree_LC1876 {

	/* Substrings of Size Three with Distinct Characters - https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
	 * Time Complexity - O[n]
	 * Space complexity - O[n]
	 */
	
	//@Test
	public void testData1() {			// Positive case
	String s ="xyzzaz";
	int output = 1;
	Assert.assertEquals(output, solveSubstringSizeThree(s));
	}
	
	@Test
	public void testData2() {			// Positive case
	String s ="aababcabc";
	int output = 4;
	Assert.assertEquals(output, solveSubstringSizeThree(s));
	}
	
	//@Test
	public void testData3() {			// Negative case
	String s ="aabab";
	int output = 0;
	Assert.assertEquals(output, solveSubstringSizeThree(s));
	}
	
	//@Test
	public void testData4() {			// Positive case
	String s ="abcabc";
	int output = 4;
	Assert.assertEquals(output, solveSubstringSizeThree(s));
	}
	
	//@Test
	public void testData5() {			// Edge case
	String s ="a";
	int output = 0;
	Assert.assertEquals(output, solveSubstringSizeThree(s));
	}
	
	/* Pseudo code:
	 * -  Initialize a HashSet 'cSet' and a counter
	 * -  Iterate the string 's' till length of the string
	 * 		- If size of cSet > 3, remove the value in i-3 position
	 * 		- else add value to cSet
	 * 			If(size of cSet = 3) counter++
	 * - return counter
	 */

	// Solution - Hashing  - Need to tweak
	public int solveSubstringSizeThree(String s) {
		if(s.length()<3) return 0;									// To catch edge cases
		HashSet<Character> cSet = new HashSet<>();
		int counter=0;
		for(int j=0;j<2;j++) cSet.add(s.charAt(j));
		for(int i=2;i<s.length();i++) {
			cSet.add(s.charAt(i));
			if(cSet.size()==3) counter++;
			cSet.remove(s.charAt(i-2));
		}
		return counter;
	}
}
