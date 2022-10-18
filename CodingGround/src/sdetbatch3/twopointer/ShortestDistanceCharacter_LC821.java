package sdetbatch3.twopointer;

import java.util.Arrays;

import org.junit.Test;

public class ShortestDistanceCharacter_LC821 {

	/*	Problem  :  Shortest Distance to a Character - https://leetcode.com/problems/shortest-distance-to-a-character/
	Time Complexity:O[N]
	Space Complexity:O[N]  */
	
	@Test
	public void testData1() {           //  Exp OP - [3,2,1,0,1,0,0,1,2,2,1,0]
		String s = "loveleetcode";
		char c = 'e';
		System.out.println((Arrays.toString(solveShortestDistanceCharacter(s, c))));
	}
	
	@Test
	public void testData2() {           //  Exp OP - [3,2,1,0]
		String s = "aaab";
		char c = 'b';
		System.out.println((Arrays.toString(solveShortestDistanceCharacter(s, c))));
	}
	
	@Test
	public void testData3() {           //  Exp OP - [0]
		String s = "a";
		char c = 'a';
		System.out.println((Arrays.toString(solveShortestDistanceCharacter(s, c))));
	}
	
	@Test
	public void testData4() {           //  Exp OP - [0,1,2,3,3,2,1,0]
		String s = "avesyeva";
		char c = 'a';
		System.out.println((Arrays.toString(solveShortestDistanceCharacter(s, c))));
	}

	@Test
	public void testData5() {           //  Exp OP - [0,0,0,0,0]
		String s = "aaaaa";
		char c = 'a';
		System.out.println((Arrays.toString(solveShortestDistanceCharacter(s, c))));
	}
	
	@Test
	public void testData6() {           //  Exp OP - [1,0,1,2,2,1,0,1,2,3]
		String s = "abaaaabaaa";
		char c = 'b';
		System.out.println((Arrays.toString(solveShortestDistanceCharacter(s, c))));
	}
	
	/* Pseudocode:
	 * -  Intialize a pointer and counter
	 * -  First pass - Iterate the input string through pointer from left to right 
	 *       - If pointer value matches to input char, counter =0, pointer ++, assign pointer to output array
	 *       - else if pointer value matches to input char and counter >0, counter++, pointer ++, assign pointer to output array
	 *       - else pointer++
	 * -  Second pass - Iterate the input string through pointer from right to left 
	 *       - If pointer value matches to input char, counter =0, pointer --, assign pointer to output array
	 *       - else if pointer value matches to input char and counter >0, counter++, pointer --, assign min pointer value to output array
	 *       - else pointer--
	 * - return output array
	 */
	
	private int[] solveShortestDistanceCharacter(String s, char c) {
		int pointer=0,counter=-1;
		int op[] = new int[s.length()];
		while(pointer<s.length()) {
			if(s.charAt(pointer)==c) {
				counter=0;
				op[pointer]=counter;
			}
			else if((s.charAt(pointer)!=c)&&counter >=0) {
				counter++;
				op[pointer]=counter;
			}
		 pointer++;
		}
		counter=-1;
		pointer--;
		while(pointer>=0) {
			if(s.charAt(pointer)==c) counter=0;
			else if((s.charAt(pointer)!=c)&&counter >=0) {
				counter++;
				if(op[pointer]==0) op[pointer]=counter;
				else op[pointer]=Math.min(op[pointer], counter);
			}
		 pointer--;
		}
		return op;
		
	}
	
}
