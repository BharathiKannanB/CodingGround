package codinground.prep;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicate {

	/* Duplicate character in a String
	 * Time Complexity - O[n]
	 * Space Complexity - O[n]
	 */
	
	@Test
	public void testData1() {           //+ve case
		String input = "aabbcc";
		String output = "abc";
		Assert.assertEquals(output, solveRemoveDuplicate(input));
	}

	@Test
	public void testData2() {			// +ve case both cases
		String input = "MoonNoon";
		String output = "mon";
		Assert.assertEquals(output, solveRemoveDuplicate(input));
	}
	
	//@Test
	public void testData3() {			//-ve case
		String input = "abc";
		String output = "abc";
		Assert.assertEquals(output, solveRemoveDuplicate(input));
	}
	
	//@Test
	public void testData4() {			// edge case
		String input = "a";
		String output = "a";
		Assert.assertEquals(output, solveRemoveDuplicate(input));
	}
	
	/* Solution using LinkedHashSet */
	private String solveRemoveDuplicate1(String input) {
		input = input.toLowerCase();
		LinkedHashSet<Character> output = new LinkedHashSet<>();
		for(char alpha: input.toCharArray())
			output.add(alpha);
		String result ="";
		for(char alpha:output)
			result = result + alpha;
		return result;
	}
	
	/* Solution for finding duplicate */
	private String solveRemoveDuplicate(String input) {
		input = input.toLowerCase();
		HashSet<Character> output = new HashSet<>();
		String result ="";
		for(char alpha: input.toCharArray()) {
			if(!output.add(alpha))result = result + alpha;}
		return result;
	}
	
}
