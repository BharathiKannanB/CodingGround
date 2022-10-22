package sdetbatch3.slidingwindow;

import org.junit.Test;

public class SubstringsSizeThree_LC1876 {


	/*	Problem  :   Substrings of Size Three with Distinct Characters - https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
	Time Complexity:O[N]
	Space Complexity:O[1]  */
	
	@Test
	public void testData1() {           //  Exp OP - 1
		String name = "xyzzaz";
		System.out.println((solveSubstringsSizeThree(name)));
	}
	
	@Test
	public void testData2() {           //  Exp OP - 4
		String name = "aababcabc";
		System.out.println((solveSubstringsSizeThree(name)));
	}
	
	@Test
	public void testData3() {           //  Exp OP - 8
		String name = "abcdefghij";
		System.out.println((solveSubstringsSizeThree(name)));
	}
	
	@Test
	public void testData4() {           //  Exp OP - 0
		String name = "aaaaaaa";
		System.out.println((solveSubstringsSizeThree(name)));
	}
	
	@Test
	public void testData5() {           //  Exp OP - 0
		String name = "ab";
		System.out.println((solveSubstringsSizeThree(name)));
	}

	/* Pseudocode:
	 * - Initialize pointer and result to zero
	 * - Iterate through the input String till length-2 position
	 *   - If value of pointer != Pointer+1 != Pointer+2, increment the result
	 *   - Increment the pointer
	 * - Return the result
	 */
	
	private int solveSubstringsSizeThree(String name) {
		if(name.length()<2) return 0;
		int pointer=0,result=0;
		while(pointer<name.length()-2) {
			if((name.charAt(pointer)!=name.charAt(pointer+1))
					&&(name.charAt(pointer)!=name.charAt(pointer+2))
					    &&((name.charAt(pointer+1)!=name.charAt(pointer+2))))
			result++;
			pointer++;
		}
		return result;
	}

}
