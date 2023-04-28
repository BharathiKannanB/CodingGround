package codinground.prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/* https://leetcode.com/problems/valid-anagram/
 * Space Complexity - O[n]
 * Time Complexity -  O[n]
 */

public class ValidAnagram {
	
	@Test
	public void testData1() {
		String s = "anagram";
		String t = "nagaram";
		boolean actualOutput = true;
		Assert.assertEquals(actualOutput, solveAnagram(s,t));
	}
	
	@Test
	public void testData2() {
		String s = "rat";
		String t = "car";
		boolean actualOutput = false;
		Assert.assertEquals(actualOutput, solveAnagram(s,t));
	}
	
	@Test
	public void testData3() {
		String s = "cool";
		String t = "cool";
		boolean actualOutput = true;
		Assert.assertEquals(actualOutput, solveAnagram(s,t));
	}

	@Test
	public void testData4() {
		String s = "a";
		String t = "a";
		boolean actualOutput = true;
		Assert.assertEquals(actualOutput, solveAnagram(s,t));
	}
	
	@Test
	public void testData5() {
		String s = "abc";
		String t = "abcd";
		boolean actualOutput = false;
		Assert.assertEquals(actualOutput, solveAnagram(s,t));
	}
	
	/* Solution 1 using HashMap */
	public boolean solveAnagram1(String s, String t) {
		if(s.length()!=t.length()) return false;
		Map<Character,Integer> word = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {										// Adding char from s and removing same char from t
			word.put(s.charAt(i),word.getOrDefault(s.charAt(i), 0)+1);
		}
		for(int i=0;i<t.length();i++) {		
		word.put(t.charAt(i),word.getOrDefault(t.charAt(i), 0)-1);
		}
		for(int isZero:word.values()) {  									// Check if all char occurrence are removed
			if(isZero!=0) return false;
		}
		return true;
	}
	
	/* Solution 2 using Array */
	public boolean solveAnagram(String s, String t) {
		if(s.length()!=t.length()) return false;
		int[] word = new int[26];
		for(int i=0;i<s.length();i++) { 						// Adding char from s and removing same char from t
			word[s.charAt(i)-'a']++;
			word[t.charAt(i)-'a']--;
		}
		 for(int i:word){
	            if(i!=0) return false;
	}
			return true;
	}
}
