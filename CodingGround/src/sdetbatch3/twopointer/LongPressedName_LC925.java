package sdetbatch3.twopointer;

import java.util.Arrays;

import org.junit.Test;

public class LongPressedName_LC925 {

	/*	Problem  :   Long Pressed Name - https://leetcode.com/problems/long-pressed-name//
	Time Complexity:O[N]
	Space Complexity:O[N]  */
	
	//@Test
	public void testData1() {           //  Exp OP - true
		String name = "alex";
		String typed = "aaleex";
		System.out.println((solveLongPressedName(name, typed)));
	}
	
	//@Test
	public void testData2() {           //  Exp OP - false
		String name = "saeed";
		String typed = "ssaaedd";
		System.out.println((solveLongPressedName(name, typed)));
	}
	
	//@Test
	public void testData3() {           //  Exp OP - false
		String name = "abc";
		String typed = "xyz";
		System.out.println((solveLongPressedName(name, typed)));
	}
	
	//@Test
	public void testData4() {           //  Exp OP - false
		String name = "apple";
		String typed = "appleeeq";
		System.out.println((solveLongPressedName(name, typed)));
	}
	
	//@Test
	public void testData5() {           //  Exp OP - true
		String name = "abc";
		String typed = "abc";
		System.out.println((solveLongPressedName(name, typed)));
	}
	
	@Test
	public void testData6() {           //  Exp OP - false
		String name = "leelee";
		String typed = "lleeelee";
		System.out.println((solveLongPressedName(name, typed)));
	}
	
	/*  Pseudocode:
	 *  - Initialize two pointers and a counter
	 *  - Iterate through both inputs with two pointers
	 *     - If value of p1 == p2, p2++ and counter =1
	 *     - If value of p1 != p2 and counter = 1, counter =0 and p1++
	 *     - else return false
	 *  - p1 && p2 less than both input length return true
	 */

	private boolean solveLongPressedName(String name, String typed) {
		 int i = 0, m = name.length(), n = typed.length();
	        for (int j = 0; j < n; ++j)
	            if (i < m && name.charAt(i) == typed.charAt(j))
	                ++i;
	            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1))
	                return false;
	        return i == m;
	}
	
}
