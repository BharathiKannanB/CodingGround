package problems.easy;

import org.junit.Test;


/*
 * S.No. : 14
 * Problem : Reverse Integer
 * Link : https://leetcode.com/problems/reverse-integer/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q14_ReverseInteger {

	@Test
	public void testcase1() {
	int x = 123;
	System.out.println(reverseIntegerSolution2(x));
	}

	@Test
	public void testcase2() {
	int x = -12378;
	System.out.println(reverseIntegerSolution2(x));
	}
	
	@Test
	public void testcase3() {
	int x = 1200;
	System.out.println(reverseIntegerSolution2(x));
	}
	
	@Test
	public void testcase4() {
	int x = 1;
	System.out.println(reverseIntegerSolution2(x));
	}
	
	@Test
	public void testcase5() {
	int x = 121;
	System.out.println(reverseIntegerSolution2(x));
	}
	
	@Test
	public void testcase6() {
	int x = -2147483648;
	System.out.println(reverseIntegerSolution2(x));
	}
	
	/* Solution 1 - Brute Force */
	private int reverseIntegerSolution1(int x) {
		if(x==Integer.MIN_VALUE) return 0;
		if(String.valueOf(x).length()==1) return x;
		int toggle =0,j=0;
		String input = String.valueOf(Math.abs(x));
		char[] output = new char[input.length()];
		for (int i = input.length()-1; i >= 0 ; i--) {
			if(input.charAt(i)!='0' && toggle==0)
				{toggle=1;}
			if( toggle==1) {
				output[j] = input.charAt(i); 
				j++;
			}
		}
		System.out.println(Long.valueOf(String.valueOf(output).trim()));
		if(Long.valueOf(String.valueOf(output).trim())>2147483647) return 0;
		toggle= Integer.valueOf(String.valueOf(output).trim());
		if(x<0) return toggle *=-1;
		else return toggle;
	}
	
	/* Solution 2 - String Buffer */
	private int reverseIntegerSolution2(int x) {
		String output = new StringBuffer(String.valueOf(Math.abs(x))).reverse().toString();
		try {
			return (x<0)?Integer.valueOf(output)*-1:Integer.valueOf(output);
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	
	
	
	
	
}
