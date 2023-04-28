package codinground.prep;



import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class palindromeFRESHWORKS {

	//@Test
	public void solvePalindrome() {
		String input ="AAB";
		HashMap<Character,Integer> output = new HashMap<Character,Integer>();
		int odd=0;
		for(char c:input.toCharArray()) {
			output.put(c, output.getOrDefault(c, 0)+1);
		}
		
		for(int i: output.values()) {
			if(i%2!=0)
				odd++;
			if(odd>1) {
				System.out.println("Not a palindrome");
				return;
			}
		}
		System.out.println("Palindrome");
		
	}
	
	@Test
	public void solvePalindrome1() {
		String input ="AABD";
		int[] output = new int[26];
		int odd=0;
		for(char c: input.toCharArray()) {
			output[c-'A']++;
		}
		
		for(int i: output) {
			if(i%2!=0)
				odd++;
			if(odd>1) {
				System.out.println("Not a palindrome");
				return;
			}
		}
		System.out.println("Palindrome");
		
	}
}
