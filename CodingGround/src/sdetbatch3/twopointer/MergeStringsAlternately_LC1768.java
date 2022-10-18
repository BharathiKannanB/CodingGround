package sdetbatch3.twopointer;

import org.junit.Test;

public class MergeStringsAlternately_LC1768 {

	/*	Problem  :   Assign Cookies - https://leetcode.com/problems/assign-cookies/
	Time Complexity:O[N]
	Space Complexity:O[1]  */
	
	@Test
	public void testData1() {           //  Exp OP - apbqcr
		String word1 = "abc";
		String word2 = "pqr";
		System.out.println(solveMergeStringsAlternately(word1, word2));
	}
	
	@Test
	public void testData2() {           //  Exp OP - apbqrs
		String word1 = "ab";
		String word2 = "pqrs";
		System.out.println(solveMergeStringsAlternately(word1, word2));
	}
	
	@Test
	public void testData3() {           //  Exp OP - apbqcd
		String word1 = "abcd";
		String word2 = "pq";
		System.out.println(solveMergeStringsAlternately(word1, word2));
	}
	
	@Test
	public void testData4() {           //  Exp OP - ap
		String word1 = "a";
		String word2 = "p";
		System.out.println(solveMergeStringsAlternately(word1, word2));
	}
	
	@Test
	public void testData5() {           //  Exp OP - aaaaaa
		String word1 = "aaa";
		String word2 = "aaa";
		System.out.println(solveMergeStringsAlternately(word1, word2));
	}
	
	/* Pseudocode
	 * - Initialize two pointers p1 and p2
	 * - Iterate two words through p1 and p2
	 *   - If p1 is less than word1 length, concatenate p1 value to output and increment p1
	 *   - If p2 is less than word2 length, concatenate p2 value to output and increment p2
	 * - return output
	 */

	private String solveMergeStringsAlternately(String word1, String word2) {
		int p1=0,p2=0;
		String output ="";
		while(p1<word1.length()||p2<word2.length()) {
			if(p1<word1.length())output= output+word1.charAt(p1++);
			if(p2<word2.length())output= output+word2.charAt(p2++);
		}
		return output;
	}
	
}
