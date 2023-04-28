package codinground.prep;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class UniqueCharacters {

	/* Unique Characters
	 * Time Complexity - O[n]
	 * Space complexity - O[n]
	 */
	
	@Test
	public void testData1() {						//+ve case
		String input = "this is my test string";
	    String output = "r, e, g, h, y, m, n";
	    Assert.assertEquals(output, solveUniqueCharacters(input));
	}
	
	@Test
	public void testData2() {						//-ve case
		String input = "aabbccdd";
	    String output = "";
	    Assert.assertEquals(output, solveUniqueCharacters(input));
	}
	
	@Test
	public void testData3() {						//edge case
		String input = "t";
	    String output = "t";
	    Assert.assertEquals(output, solveUniqueCharacters(input));
	}
	
	@Test
	public void testData4() {						//+ve case
		String input = "ThIs is my test string";
	    String output = "r, e, g, h, y, m, n";
	    Assert.assertEquals(output, solveUniqueCharacters(input));
	}

	/* Solution using HashMap */
	private String solveUniqueCharacters(String input) {
		if(input.length()<2) return input;
		input = input.replaceAll("[^a-zA-Z]","").toLowerCase();
		HashMap<Character,Integer> occurence = new HashMap<>();
		for(char alpha:input.toCharArray())
			occurence.put(alpha, occurence.getOrDefault(alpha,0)+1);
		System.out.println(occurence);
		StringBuilder output =new StringBuilder();
		for(Map.Entry<Character, Integer> entry:occurence.entrySet()) {
			if(entry.getValue()==1) {
				if(output.length()==0)
				output.append(entry.getKey());
			else output.append(", ").append(entry.getKey());
			}
	}
		return output.toString();
}
}

