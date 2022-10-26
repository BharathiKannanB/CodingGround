package sdetbatch3.slidingwindow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class MaximumNumberVowels_LC0 {

	/*Given a string s and a number k, find the maximum number of vowels in substring of size k.
	String: "workaattech"
	k: 3 
	Time Complexity - O[n]
	Space Complexity -O[1]
	*/
	
	@Test
	public void testData1() {                //  Exp. Op: 2
		String input ="workaattech";
		int k = 3;
		System.out.println(solveMaximumNumberVowels(input,k));
	}
	
	@Test
	public void testData2() {				//    Exp. Op: 0
		String input ="bcdfg";
		int k = 3;
		System.out.println(solveMaximumNumberVowels(input,k));
	}
	
	@Test
	public void testData3() {				//	 Exp. Op: 4
		String input ="aeiou";
		int k = 4;
		System.out.println(solveMaximumNumberVowels(input,k));
	}
	
	@Test
	public void testData4() {				//	 Exp. Op: 1
		String input ="apple";
		int k = 1;
		System.out.println(solveMaximumNumberVowels(input,k));
	}
	
	@Test
	public void testData5() {				//	 Exp. Op: 0
		String input ="apple";
		int k = 0;
		System.out.println(solveMaximumNumberVowels(input,k));
	}
	
	/* Pseudocode:
	 *  - Initialize pointer, current_count, max_count
	 *  - If k=0, return 0
	 *  - Iterate through the input string till k
	 *     - Count the current_count
	 *  - Assign max_count = current_count 
	 *  - Iterate through the input till the length of input 
	 *  		- If pointer value == vowel, increment current_count
	 *  		- If pointer value - k == vowel, decrement current_count
	 *  		- If current_count>max_count, max_count=current_count
	 * - Return max_count
	 */

	// Solution - Sliding Window
	private int solveMaximumNumberVowels(String input, int k) {
		int current_count=0,max_count=0;
		Pattern pattern = Pattern.compile("[aeiou]");
		if(k==0) return 0;
		for(int i=0;i<k;i++) {
			if(pattern.matcher(input.substring(i, i+1)).matches())
				current_count++;
		}
		max_count=current_count;
		for(int j=k;j<input.length()-1;j++) {
			if(input.charAt(j)=='a'||input.charAt(j)=='e'||input.charAt(j)=='i'||input.charAt(j)=='o'||input.charAt(j)=='u')
				current_count++;
			if(input.charAt(j-k)=='a'||input.charAt(j-k)=='e'||input.charAt(j-k)=='i'||input.charAt(j-k)=='o'||input.charAt(j-k)=='u')
				current_count--;
			if(current_count>max_count) 	max_count=current_count;
		}
		return max_count;
	}
	
}
