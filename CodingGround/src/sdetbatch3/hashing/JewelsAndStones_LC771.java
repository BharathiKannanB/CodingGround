package sdetbatch3.hashing;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;



public class JewelsAndStones_LC771 {

	/* Contains duplicate 2 - https://leetcode.com/problems/contains-duplicate-ii/
	 * Time Complexity - O[n]
	 * Space Complexity - O[1]
	 */
	
	@Test
	public void testData1() {					// Positive case
		String jewels = "aA";
		String stones = "aAAbbbb";
		int output = 3;
		Assert.assertEquals(output,solveJewelsAndStones(jewels,stones));
	}

	@Test
	public void testData2() {					// Negative case
		String jewels = "z";
		String stones = "ZZ";
		int output = 0;
		Assert.assertEquals(output,solveJewelsAndStones(jewels,stones));
	}
	
	@Test
	public void testData3() {					// Positive case
		String jewels = "aAAbbbb";
		String stones = "aA";
		int output = 2;
		Assert.assertEquals(output,solveJewelsAndStones(jewels,stones));
	}
	
	@Test
	public void testData4() {					// Edge case
		String jewels = "a";
		String stones = "a";
		int output = 1;
		Assert.assertEquals(output,solveJewelsAndStones(jewels,stones));
	}
	
	private int solveJewelsAndStones(String jewels, String stones) {
		int[] cArray = new int[128];
		for(char c:stones.toCharArray())
			cArray[c]++;
		int output=0;
		for(char c:jewels.toCharArray())
			output += cArray[c];
		return output;
	}
	
	private int solveJewelsAndStones2(String jewels, String stones) {
		return stones.replaceAll("[^"+jewels+"]", "").length();
	}
	
	private int solveJewelsAndStones1(String jewels, String stones) {
		ArrayList<Character> jList = new ArrayList<>();
		int counter=0;
		for(char c:jewels.toCharArray()) jList.add(c);
		for(char c:stones.toCharArray()) {
			if(jList.contains(c)) counter++;
		}
		return counter;
	}
}
