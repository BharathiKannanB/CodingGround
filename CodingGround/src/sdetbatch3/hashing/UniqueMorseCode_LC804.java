package sdetbatch3.hashing;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseCode_LC804 {

	/* Unique Morse code - https://leetcode.com/problems/unique-morse-code-words/description/
	 * Time complexity - O[n]
	 * Space complexity - O[n]
	 */
	
	@Test
	public void testData1() {					// Positive scenario
	String[] words = {"gin","zen","gig","msg"};
	int output = 2;
	Assert.assertEquals(output,solveUniqueMorseCode(words));
	}
	
	@Test
	public void testData2() {					// Positive scenario
	String[] words = {"gin","gin","gin","gin"};
	int output = 1;
	Assert.assertEquals(output,solveUniqueMorseCode(words));
	}

	@Test
	public void testData3() {					// Positive scenario
	String[] words = {"gin","zet","gig","apple"};
	int output = 4;
	Assert.assertEquals(output,solveUniqueMorseCode(words));
	}
	
	@Test
	public void testData4() {					// Edge scenario
	String[] words = {"gin"};
	int output = 1;
	Assert.assertEquals(output,solveUniqueMorseCode(words));
	}
	
	@Test
	public void testData5() {					// Edge scenario
	String[] words = {"a","a"};
	int output = 1;
	Assert.assertEquals(output,solveUniqueMorseCode(words));
	}
	
	/* Pseudocode:
	 * - Initialize String array of all lowercase alphabets morse code.
	 * - Initialize String word
	 * - Initialize output Hashset wSet
	 * - Iterate the input array 'words'
	 *   - Iterate each String into char array
	 *   	- Add all char morse code value to String word
	 *   	- Add word to wSet
	 * - return wSet size
	 */
	
	private int solveUniqueMorseCode(String[] words) {
	
	//Initialize hashcode String array
	String[] hashCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	String hashWord ="";
	HashSet<String> wSet = new HashSet<>();
	// Iterate through input array
	for(String word:words) {
	// Iterate through individual char of input word	
		for(char hashValue:word.toCharArray()) {
	// Add hashcode of the word to String through ASCII		
			hashWord = hashWord + hashCode[hashValue-'a'];
		}
	// Add to a set to remove duplicates
		wSet.add(hashWord);
		hashWord="";
	}
		return wSet.size();
	}
}
