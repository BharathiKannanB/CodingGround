package codinground.prep;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CharacterCount {

	/* Character count
	 * Time Complexity - O(n)
	 * Space Complexity - O(1)
	 */
	
	@Test
	public void testData1() {					// +ve case
		String input = "aaabbccaad";
		String output = "a3b2c2a2d1";
		Assert.assertEquals(output, solveCharacterCount(input));
	}

	@Test
	public void testData2() {					// +ve case
		String input = "abcd";
		String output = "a1b1c1d1";
		Assert.assertEquals(output, solveCharacterCount(input));
	}
	
	@Test
	public void testData3() {					// +ve case
		String input = "aaaaaaaa";
		String output = "a8";
		Assert.assertEquals(output, solveCharacterCount(input));
	}
	
	@Test
	public void testData4() {					// edge case
		String input = "a";
		String output = "a1";
		Assert.assertEquals(output, solveCharacterCount(input));
	}
	
	@Test
	public void testData5() {					// -ve case
		String input = "";
		String output = "";
		Assert.assertEquals(output, solveCharacterCount(input));
	}

	/* Solution using LinkedHashMap - doesn't work on 1st testcase */ 
	private String solveCharacterCount1(String input) {
		LinkedHashMap<Character,Integer> output = new LinkedHashMap<>();
		for(char alpha: input.toCharArray())
			output.put(alpha, output.getOrDefault(alpha, 0)+1);
		String result = "";
		for(Map.Entry<Character,Integer> entrySet:output.entrySet())
			result = result+entrySet.getKey()+entrySet.getValue();
		return result;
	}
	
	/* Solution using array */ 
	private String solveCharacterCount(String input) {
		int count = 1;
		if(input.length()==1) return input+1;
		char[] result = input.toCharArray();
		int arraySize = result.length;
		String output ="";
		for(int i=0;i<arraySize-1;i++)
		{
			if(result[i]!=result[i+1]) {
				output = output+result[i]+count;
				if(i+1==arraySize-1) output = output+result[i+1]+1;
				count=1;}
			else {
				count++;
				if(i+1==arraySize-1) output = output+result[i+1]+count;
			}
		}
		return output;
	}
	
}
