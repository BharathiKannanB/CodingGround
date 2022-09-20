package problems.medium;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/*
 * S.No. :2
 * Problem : Longest Substring Without Repeating Characters
 * Link : https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:
 * Space Complexity:
 */

public class Q2_LongestSubString_LC3 {

	//@Test
	public void testData1() {   // OP - 3
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	//@Test
	public void testData2() {   // OP - 1
		String s = "bbbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	@Test
	public void testData3() {   // OP - 3
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}

	//@Test
	public void testData4() {   // OP - 9
		String s = "abcdefghi";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	//@Test
	public void testData5() {   // OP - 3
		String s = "dvdf";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	/* Solution 1 - Brute Force */
	private int lengthOfLongestSubstring(String s) {
		if (s.length() == 0)
			return 0;
		int start = 0, end = 1, current = 1, max = 1;
		char[] input = s.toCharArray();
		Set<Character> output = new HashSet<Character>();
		output.add(input[start]);
		while (end < input.length) {
			if (output.contains(input[end])) {
				start++;
				end = start + 1;
				output.clear();
				output.add(input[start]);
				current = 1;
			} else {
				output.add(input[end]);
				current++;
				max = Math.max(current, max);
				end++;
			}
		}
		return max;
	}
	
	/* Solution 2 - Sliding Window efficient way */
	private int lengthOfLongestSubstring2(String s) {
		if (s.length() == 0)
			return 0;
		int start = 0, end = 0, max = 1;
		Set<Character> output = new HashSet<Character>();
		while (end < s.length()) {
			if (!output.contains(s.charAt(end))) {
				output.add(s.charAt(end++));
				max = Math.max(max, output.size());
			} else
				output.remove(s.charAt(start++));
		}
		return max;
	}
	
}
