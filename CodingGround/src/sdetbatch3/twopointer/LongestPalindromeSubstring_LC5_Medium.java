package sdetbatch3.twopointer;

import org.junit.Test;

public class LongestPalindromeSubstring_LC5_Medium {

	/*	Problem  :  Longest Palindromic Substring - https://leetcode.com/problems/longest-palindromic-substring/
	Time Complexity: O[n^2]
	Space Complexity: O[1]   */
	
	@Test
	public void testData1() {           //  Exp OP - bab
		String s = "babad";
		System.out.println((solveLongestPalindromeSubstring(s)));
	}
	
	@Test
	public void testData2() {           //  Exp OP - bb
		String s = "cbbd";
		System.out.println((solveLongestPalindromeSubstring(s)));
	}
	
	@Test
	public void testData3() {           //  Exp OP - a
		String s = "aeiou";
		System.out.println((solveLongestPalindromeSubstring(s)));
	}
	
	@Test
	public void testData4() {           //  Exp OP - noon
		String s = "noon";
		System.out.println((solveLongestPalindromeSubstring(s)));
	}
	
	@Test
	public void testData5() {           //  Exp OP - a
		String s = "a";
		System.out.println((solveLongestPalindromeSubstring(s)));
	}
	
	@Test
	public void testData6() {           //  Exp OP - babab
		String s = "dbababc";
		System.out.println((solveLongestPalindromeSubstring(s)));
	}
	
	/* Pseudocode:
	 * - Initialize two pointers and input length as k
	 * - Initialize curr_length and max_length
	 * - Iterate from input string from left to right
	 *   - If input[left] to input[k-1] is palindrome,
	 *   	- curr_length = left - k-1
	 *   	- if(curr_length>max_length) max_length = curr_length
	 *    - If input[right] to input[1] is palindrome,
	 *   	- curr_length = left - k-1
	 *   	- if(curr_length>max_length) max_length = curr_length
	 *   
	 */

	private String solveLongestPalindromeSubstring(String s) {
		if(s.length()==1) return s;
		int left = 0, right=s.length()-1,curr_length=0,max_length=0;
		String output=s.substring(0,1);
		while(left<s.length()-1) {
			if(!isPalindrome(s,left,right)) {
				right--;
			}
			else {
				curr_length=right-left;
				if(max_length<curr_length) {
					max_length=curr_length;
					output = s.substring(left,right+1);
				}
				left++;
				right=s.length()-1;
			}
			if(left>=right) {
				left++;
				right=s.length()-1;
			}	
		}
		left=1;
		right=s.length()-1;
		while(right>0) {
			if(!isPalindrome(s,left,right)) {
				left++;
			}
			else {
				curr_length=right-left;
				if(max_length<curr_length) {
					max_length=curr_length;
					output = s.substring(left,right+1);
				}
				right--;
				left=1;
			}
			if(left>=right) {
				right--;
				left=1;
			}	
		}
		
		return output;
	}
	public boolean isPalindrome(String s,int left, int right) {
		while(left<right) {
		if(s.charAt(left)!=s.charAt(right))
		return false;
		left++;
		right--;
	}
		return true;
	}
	
	
		
		}

