package sdetbatch3.twopointer;

import org.junit.Test;

public class ReverseWordString_LC557 {

	/*	Problem  :  Reverse Words in a String III - https://leetcode.com/problems/reverse-words-in-a-string-iii/
	Time Complexity:O[N]
	Space Complexity:O[N]  */
	
	@Test
	public void testData1() {        // Exp. Op - s'teL ekat edoCteeL tsetnoc
	String s = "Let's take LeetCode contest";
	System.out.println(solveReverseWordString(s));
	}
	
	@Test
	public void testData2() {       // Exp Op - doG gniD
	String s = "God Ding";
	System.out.println(solveReverseWordString(s));
	}
	
	@Test
	public void testData3() {       // Exp Op - elppA
	String s = "Apple";
	System.out.println(solveReverseWordString(s));
	}
	
	@Test
	public void testData4() { 		// Exp Op - a radar level
	String s = "a radar level";
	System.out.println(solveReverseWordString(s));
	}
	
	@Test
	public void testData5() {       // Exp Op - " "
	String s = " ";
	System.out.println(solveReverseWordString(s));
	}
	
	/* Pseudocode:
	 * - Initialize left and right pointers
	 * - Iterate the entire string with two pointers
	 *      - Move the right pointer before a empty space
	 *      - Iterate two pointers to swap the entire word
	 * - return the output
	 */

	private String solveReverseWordString(String s) {
		if(s.length()==1) return s;
		int left=0,right=1,counter=0;
		char temp;
		char[] op = s.toCharArray();
		while(counter<op.length) {
		
			if((right==op.length||op[right]==' '&&op[right+1]!=' ')) {
				counter=right+1;
				--right;
				while(left<right) {
					temp= op[left];
					op[left]=op[right];
					op[right]=temp;
					left++;
					right--;
				}
				left = counter;
				right = left+1;
			}
			else right++;
		}
		return String.valueOf(op);
	}
	
}
