package sdetbatch3.slidingwindow;

import org.junit.Test;

public class ValidPalindrome2_LC680 {

	/*	Problem  : Valid Palindrome II - https://leetcode.com/problems/valid-palindrome-ii/ 
	Time Complexity: O[n^2]
	Space Complexity: O[1]   */
	
	@Test
	public void testData1() {           //  Exp OP - true
		String s = "aba";
		System.out.println((solveValidPalindrome(s)));
	}
	
	@Test
	public void testData2() {           //  Exp OP - true
		String s = "abca";
		System.out.println((solveValidPalindrome(s)));
	}
	
	@Test
	public void testData3() {           //  Exp OP - false
		String s = "abc";
		System.out.println((solveValidPalindrome(s)));
	}
	
	@Test
	public void testData4() {           //  Exp OP - true
		String s = "revier";
		System.out.println((solveValidPalindrome(s)));
	}
	
	//@Test
	public void testData5() {           //  Exp OP - false
		String s = "revivar";
		System.out.println((solveValidPalindrome(s)));
	}
	
	//@Test
	public void testData6() {           //  Exp OP - true
		String s = "reaviver";
		System.out.println((solveValidPalindrome(s)));
	}
	
	//@Test
	public void testData7() {           //  Exp OP - true
		String s = "revivear";
		System.out.println((solveValidPalindrome(s)));
	}
	
	/* - Pseudocode
	 * - Initialize two pointers left and right
	 * - Iterate the input string from left and right
	 *   - If input[left] == input[right], left increment and right decrement
	 *   - If input[left] != input[right], 
	 *   	- Check if input is palindrome, from left to right -1 OR
	 *   	- Check if input is palindrome, from left+1 to right
	 * - Return true  
	 */

	private boolean solveValidPalindrome(String s) {
		int left=0,right=s.length()-1;
		while(left<right) {
			if(s.charAt(left)==s.charAt(right)) {
				left++;
				right--;
			}
			else return isPalindrome(left,right-1,s)||isPalindrome(left+1,right,s);
		}
		return true;
	}
	
	public boolean isPalindrome(int left,int right, String s) {
		while(left<right) {
		if(s.charAt(left)!=s.charAt(right)) 
			return false;
		left++;
		right--;}
		return true;	
	}
	
}
