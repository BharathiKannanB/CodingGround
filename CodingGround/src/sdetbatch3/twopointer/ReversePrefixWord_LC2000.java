package sdetbatch3.twopointer;

import java.util.Arrays;

import org.junit.Test;

public class ReversePrefixWord_LC2000 {

	/*	Problem  :  Reverse Prefix of Word - https://leetcode.com/problems/reverse-prefix-of-word/
	Time Complexity:O[N]
	Space Complexity:O[N]  */
	
	@Test
	public void testData1() {    //Exp OP - dcbaefd
		String s = "abcdefd";
		char ch ='d';
		System.out.println(solveReversePrefixWord(s,ch));

	}
	
	@Test
	public void testData2() {    //Exp OP - zxyxxe
		String s = "xyxzxe";
		char ch ='z';
		System.out.println(solveReversePrefixWord(s,ch));

	}
	
	@Test
	public void testData3() {    //Exp OP - abcd
		String s = "abcd";
		char ch ='z';
		System.out.println(solveReversePrefixWord(s,ch));

	}
	
	@Test
	public void testData4() {    //Exp OP - z
		String s = "z";
		char ch ='z';
		System.out.println(solveReversePrefixWord(s,ch));

	}
	
	@Test
	public void testData5() {    //Exp OP - zabcd
		String s = "zabcd";
		char ch ='z';
		System.out.println(solveReversePrefixWord(s,ch));

	}
	
	/* Pseudocode:
	 * - Iterate two pointers
	 * - Identify the location of the first occurrence of ch
	 * - Iterate left pointer from starting point of string and right pointer from the 'ch' position
	 *   - reverse the left pointer and right pointer values
	 * - return the output
	 */

	private String solveReversePrefixWord(String s,char ch) {
		char op[] = s.toCharArray();
		if(op.length==1||op[0]==ch) return s;
		int left=0, right=0;
		char temp;
		for(char c:op) {
			if(c==ch)break;
			right++;
		}
		if(right==op.length) return s;
		while(left<right) {
			temp = op[left];
			op[left++]=op[right];
			op[right--]=temp;
		}
		return String.valueOf(op);
	}
	
}
