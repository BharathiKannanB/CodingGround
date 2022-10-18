package sdetbatch3.twopointer;

import org.junit.Test;

public class ReverseOnlyLetters_LC917 {
	
	/*	Problem  :  Reverse only letters - https://leetcode.com/problems/reverse-only-letters/
	Time Complexity:O[N]
	Space Complexity:O[N]  */
	
	@Test
	public void testData1() {    //Exp OP - dc-ba
		String s = "ab-cd";
		System.out.println(solveReverseOnlyLetters(s));

	}
	
	@Test
	public void testData2() {    //Exp OP - j-Ih-gfE-dCba
		String s = "a-bC-dEf-ghIj";
		System.out.println(solveReverseOnlyLetters(s));

	}
	
	@Test
	public void testData3() {    //Exp OP - Qedo1ct-eeLg=ntse-T!
		String s = "Test1ng-Leet=code-Q!";
		System.out.println(solveReverseOnlyLetters(s));

	}
	
	@Test
	public void testData4() {    //Exp OP - -.*/
		String s = "-.*/";
		System.out.println(solveReverseOnlyLetters(s));

	}
	
	@Test
	public void testData5() {    //Exp OP - elppa
		String s = "apple";
		System.out.println(solveReverseOnlyLetters(s));

	}

	/*Pseudocode:
	 * - Initialize left and right pointers
	 * - Iterate through the input using two pointers
	 *      - if ASCII value of both pointers are within alphabets, do swap
	 *      - if ASCII value of left pointer is not within alphabets, increment left pointer
	 *      - if ASCII value of right pointer is not within alphabets, decrement right pointer.
	 * - Return the final output
	 */
	
	private String solveReverseOnlyLetters(String s) {
		int left=0,right=s.length()-1;
		char temp;
		char[] op = s.toCharArray();
		while(left<right) {
			if(Character.isAlphabetic(op[left])&&Character.isAlphabetic(op[right])) {
				temp=op[left];
				op[left]=op[right];
				op[right]=temp;
				left++;
				right--;
			}
			if(!Character.isAlphabetic(op[left]))
				left++;
			if(!(Character.isAlphabetic(op[right])))
				right--;
		}
		return String.valueOf(op);
	}

}
