package codinground.prep;

import java.util.HashMap;

import org.junit.Test;

public class AnagramPAYTM {

	//@Test// Keep - peeK 
	public void solveAnagram() {
		String s1 ="Keep";
		String s2 ="peK";
		int count=1;
		HashMap<Character, Integer> output = new HashMap<Character, Integer>();
		for(char c:s1.toCharArray()) {
			output.put(c, output.getOrDefault(c, 0)+1);
		}
		
		for(char c:s2.toCharArray()) {
			output.put(c, output.getOrDefault(c, 0)-1);
		}
		
		for(int i:output.values()) {
			if(i!=0) {
			System.out.println("Both values are not anagram");
			count=0;
			break;
			}
		}
		 if(count!=0)System.out.println("Both values are anagram");
		
	}
	
	@Test// Keep - peeK 
	public void solveAnagram2() {
		String s1 ="Keep";
		String s2 ="peeK";
		if(s1.length()!=s2.length()) {
			System.out.println("Both values are not anagram");
			return;
		}
		int[] output = new int[128];
		for(int i=0;i<s1.length();i++) {
			output[s1.charAt(i)]++;
			output[s2.charAt(i)]--;
		}
		for(int i:output) {
			if(i!=0)
			{
				System.out.println("Both values are not anagram");
				return;
			}
		}
		 System.out.println("Both values are anagram");
	}
	
}

	

