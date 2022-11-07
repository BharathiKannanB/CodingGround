package sdetbatch3.hashing;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FindCommonCharacters_LC1002 {

	/*	Problem  : Find Common Characters - https://leetcode.com/problems/find-common-characters/
	Time Complexity: O[n^2]
	Space Complexity: O[1]   */
	
	@Test
	public void testData1() {          // Positive case
		String[] words = {"bella","label","roller"};
		System.out.println(solveFindCommonCharacters(words));
	}
	
	//@Test
	public void testData2() {			// Positive case
		String[] words = {"cool","lock","cook"};
		System.out.println(solveFindCommonCharacters(words));
	}
	
	//@Test
	public void testData3() {			// Negative case
		String[] words = {"abc","def","ghi"};
		System.out.println(solveFindCommonCharacters(words));
	}
	
	//@Test
	public void testData4() {			// Edge case
		String[] words = {"abc"};
		System.out.println(solveFindCommonCharacters(words));
	}
	
	//@Test
	public void testData5() {			// Edge case
		String[] words = {"a","a","a"};
		System.out.println(solveFindCommonCharacters(words));
	}
	
	/* Pseudocode:
	 * - Initialize two lists - outList1 and outList2
	 * - Assign the words[0] to OutList1
	 * - Iterate input string array words
	 *    -  Add word string to outList2
	 *    - Iterate outList2
	 *       - Compare values of outList1 and outList2
	 *       - If outList1!=outList2, remove outList1 value
	 *       - If outList1==outList2, remove outList2 value
	 * 	  - clear outList2
	 * - return outList1
	 */

	// Need to be fixed
	private List<String> solveFindCommonCharacters(String[] words) {
		ArrayList<Character> outList1 = new ArrayList<>();
		ArrayList<Character> outList2 = new ArrayList<>();
		for(char i: words[0].toCharArray()) outList1.add(i);
		for(int j=1;j<words.length;j++) {
			for(char i: words[j].toCharArray()) outList2.add(i);
			for(char i:outList2) {
				if(outList1.contains(i)) 
					outList2.remove(i);
				else outList1.remove(i);
			}
			outList2.clear();
		}
		System.out.println(outList1);
		return null;
	}
}
