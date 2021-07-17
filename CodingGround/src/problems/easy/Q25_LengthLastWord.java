package problems.easy;

import java.util.Arrays;

import org.junit.Test;

/*
 * S.No. : 58
 * Problem : Length of Last Word
 * Link : https://leetcode.com/problems/length-of-last-word/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */


public class Q25_LengthLastWord {
	@Test
	public void testcase1() {
	String s="Hello World";
	System.out.println(lengthLastWordSolution2(s));   // Expected op : 5
	}
	
	@Test
	public void testcase2() {
	String s=" ";
	System.out.println(lengthLastWordSolution2(s));   // Expected op : 0
	}
	
	@Test
	public void testcase3() {
	String s="HelloWorld ";
	System.out.println(lengthLastWordSolution2(s));   // Expected op : 10
	}
	
	@Test
	public void testcase4() {
	String s="Hello World a";
	System.out.println(lengthLastWordSolution2(s));   // Expected op : 1
	}
	
	@Test
	public void testcase5() {
	String s="123 456";
	System.out.println(lengthLastWordSolution2(s));   // Expected op : 3
	}

	/* Solution 1 - Brute Force - Inbuilt method */
	private int lengthLastWordSolution(String s) {
		if(s.trim().length()==0) return 0;
		String[] op = s.split(" ");
		return op[op.length-1].length();
	}
	
	/* Solution 1 - Brute Force - without Inbuilt method*/
	private int lengthLastWordSolution2(String s) {
		int len=0;
		for (int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i)!=' ')
				len++;
			else
				{if(len>0) return len;}
		}
		return len;
	}
}
