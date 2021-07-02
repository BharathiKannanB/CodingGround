package problems.easy;

import org.junit.Test;

/*
 * S.No. : 18
 * Problem : Valid Palindrome
 * Link : https://leetcode.com/problems/valid-palindrome/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q18_ValidPalindrome {
	@Test
	public void testcase1() {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(validPalindromeSolution2(s));
	}
	
	@Test
	public void testcase2() {
		String s = "race a car";
		System.out.println(validPalindromeSolution2(s));
	}
	
	@Test
	public void testcase3() {
		String s = "mom";
		System.out.println(validPalindromeSolution2(s));
	}
	
	@Test
	public void testcase4() {
		String s = "dog";
		System.out.println(validPalindromeSolution2(s));
	}
	
	@Test
	public void testcase5() {
		String s = "apple11elppa";
		System.out.println(validPalindromeSolution2(s));
	}

	@Test
	public void testcase6() {
		String s = "apple12elppa";
		System.out.println(validPalindromeSolution2(s));
	}
	
	/* Solution 1 - Brute Force - StringBuffer */
	private boolean validPalindromeSolution1(String s) {
		s= s.replaceAll("[^A-Za-z0-9]", "");
		return (s.equalsIgnoreCase(new StringBuffer(s).reverse().toString()))?true:false;
	}
	
	/* Solution 2 - Two Pointer */
	private boolean validPalindromeSolution2(String s) {
		int left=0,right=s.length()-1;
		while(left<right) {
		if(!Character.isLetterOrDigit(s.charAt(left)))	{left++;continue;}
		if(!Character.isLetterOrDigit(s.charAt(right)))	{right--;continue;}
		if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) return false;
		left++;right--;
		}
		return true;
	}
}
