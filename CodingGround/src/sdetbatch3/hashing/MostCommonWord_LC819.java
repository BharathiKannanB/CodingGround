package sdetbatch3.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;



public class MostCommonWord_LC819 {

	/* Most Common Word - https://leetcode.com/problems/most-common-word/description/
	Time Complexity: O[n]
	Space Complexity: O[1]   */
	
	//@Test
	public void testData1() {          
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"}; 
		String output = "ball";
		Assert.assertEquals(output,solveMostCommonWord(paragraph,banned));
	}
	
	//@Test
	public void testData2() {          
		String paragraph = "a.";
		String[] banned = {}; 
		String output = "a";
		Assert.assertEquals(output,solveMostCommonWord(paragraph,banned));
	}
	
	//@Test
	public void testData3() {          
		String paragraph = "Bob hit the ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit","ball"}; 
		String output = "the";
		Assert.assertEquals(output,solveMostCommonWord(paragraph,banned));
	}
	
	@Test
	public void testData4() {          
		String paragraph = "BobhitaballthehitBALLflewfarafteritwashit.";
		String[] banned = {"hit"};  
		String output = "BobhitaballthehitBALLflewfarafteritwashit";
		Assert.assertEquals(output,solveMostCommonWord(paragraph,banned));
	}
	
	@Test
	public void testData5() {          
		String paragraph = "Bob";
		String[] banned = {"bob"};  
		String output = "";
		Assert.assertEquals(output,solveMostCommonWord(paragraph,banned));
	}

	private String solveMostCommonWord(String paragraph, String[] banned) {
		HashSet<String> banSet = new HashSet<>(Arrays.asList(banned));
		HashMap<String,Integer> paraMap = new HashMap<>();
		String[] output = paragraph.toLowerCase().split(" \"[ !?',;.]+");
		for(int i=0;i<output.length;i++) {
			if(!banSet.contains(output[i]))
			paraMap.put(output[i], paraMap.getOrDefault(output[i], 0)+1);
		}
		System.out.println(paraMap);
		int max=0;
		String result="";
		for(String s:paraMap.keySet()) {
			if(max<paraMap.get(s)) {
				max =paraMap.get(s);
				result = s;
		}
	}
		return result;
	}
}
