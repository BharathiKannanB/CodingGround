package problems.easy;

import org.junit.Test;

/*
 * S.No. : 21
 * Problem : Palindrome Number
 * Link : https://leetcode.com/problems/palindrome-number/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q21_PalindromeNumber {

	@Test
	public void testcase1() {
		int x = 121;
		System.out.println(palindromeNumberSolution3(x));   // Expected Output - true
	}
	
	@Test
	public void testcase2() {
		int x = 123;
		System.out.println(palindromeNumberSolution3(x));   // Expected Output - false
	}
	
	@Test
	public void testcase3() {
		int x = 11;
		System.out.println(palindromeNumberSolution3(x));   // Expected Output - true
	}
	
	@Test
	public void testcase4() {
		int x = 9;
		System.out.println(palindromeNumberSolution3(x));   // Expected Output - true
	}
	
	@Test
	public void testcase5() {
		int x = -101;
		System.out.println(palindromeNumberSolution3(x));   // Expected Output - false
	}

	/* Solution 1 - StringBuffer reverse inbuilt method */
	private boolean palindromeNumberSolution1(int x) {
		return String.valueOf(new StringBuffer(String.valueOf(x)).reverse()).equals(String.valueOf(x));
	}
	
	/* Solution 2 - Two Pointer  */
	private boolean palindromeNumberSolution2(int x) {
		if(x<0) return false;
		else if(x>0&&x<10) return true;
		char[] op = String.valueOf(x).toCharArray();
		int left=0,right=op.length-1;
		while(left<right)
		{
			if(op[left]!=op[right]) return false;
			left++;
			right--;
		}
		return true;
	}
	
	/* Solution 3 - Efficient method */
	private boolean palindromeNumberSolution3(int x) {
		if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	    	rev = rev*10 + x%10;
	    	x = x/10;
	    }
	    return (x==rev || x==rev/10);
}
}
