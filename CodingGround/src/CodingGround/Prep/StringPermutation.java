package codinground.prep;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class StringPermutation {

	/* String Permutation
	 * Time complexity -
	 * Space complexity - 
	 */
	
	@Test  // +ve case
	private void testData1() {					
		String input = "XY";
		String output[] = {"XY","YX"};
		Assert.assertArrayEquals(output, solveStringPermutation(input));
	}
	
	@Test  // +ve case
	private void testData2() {					
		String input = "ABC";
		String output[] = {"ABC","ACB","BAC","BCA","CAB","CBA"};
		Assert.assertArrayEquals(output, solveStringPermutation(input));
	}

	private String[] solveStringPermutation(String input) {
		HashMap<Character, Integer> permutation = new HashMap<Character,Integer>();
		ArrayList<String> outputList = new ArrayList<String>();
		int size = input.length();
		
		return permutate(input,permutation,outputList,size);
	}

	private String[] permutate(String input, HashMap<Character, Integer> permutation, ArrayList<String> outputList,int size) {
		if(permutation.size()==size) {
			//for()
			
		}
			
		return null;
	}
}
