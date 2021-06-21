package problems.easy;

import java.util.Arrays;

import org.junit.Test;

/*S.No.  : 3
Problem  : Validate Anagram
Link     : https://leetcode.com/problems/valid-anagram/
Author 	 : BK
Version	 : 1.0
Time Complexity:O[N]
Space Complexity:O[1]*/

public class Q3_ValidateAnagram {
	@Test
	public void testcase_1() {
		String s = "anagram";
		String t = "naagram";
		System.out.println(validateAnagramSolution2(s, t));
	}
	//@Test
	public void testcase_2() {
		String s = "anagram";
		String t = "aagram";
		System.out.println(validateAnagramSolution2(s, t));
	}
	//@Test
	public void testcase_3() {
		String s = "anagram";
		String t = "nnagram";
		System.out.println(validateAnagramSolution2(s, t));
	}
	//@Test
	public void testcase_4() {
		String s = "anagram";
		String t = "anagram";
		System.out.println(validateAnagramSolution2(s, t));
	}
	//@Test
	public void testcase_5() {
		String s = "a";
		String t = "a";
		System.out.println(validateAnagramSolution2(s, t));
	}

	/* Solution 1 - Using Inbuilt Function */
	private boolean validateAnagramSolution1(String s, String t) {
		if(s.length()!=t.length()) return false;
		if(s==t&&(t.length()==1)) return true;
		if(s.equals(t)) return true;
		char[] a = new char[s.length()];
		char[] b = new char[t.length()];
		a=s.toCharArray();
		Arrays.sort(a);
		b=t.toCharArray();
		Arrays.sort(b);
		if(Arrays.equals(a, b)) return true;
		else return false;
	}
	
	/* Solution 2 - Using Integer array */
	private boolean validateAnagramSolution2(String s, String t) {
		if(s.length()!=t.length()) return false;
		if(s==t&&(t.length()==1)) return true;
		if(s.equals(t)) return true;
		int[] output = new int[26];
		for(int i=0;i<s.length();i++) output[s.charAt(i)-'a']++;
		for(int i=0;i<t.length();i++) output[t.charAt(i)-'a']--;
		for(int i:output) {
			if(i!=0) return false;
		}
		return true;
	}

}
