package codinground.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.junit.Test;

public class GroupAnagrams {
	
	/* Group Anagrams
	 * 
	 * 
	 */
	
	@Test
	public void testData1() {						   // +ve case
		String[] input = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(solveGroupAnagrams(input));
	}
	
	@Test
	public void testData2() {						  // +ve case
		String[] input = {"eat","tea","ate"};
		System.out.println(solveGroupAnagrams(input));
	}
	
	@Test
	public void testData3() {						   // -ve case
		String[] input = {"eat","tan","bat"};
		System.out.println(solveGroupAnagrams(input));
	}
	
	@Test
	public void testData4() {						   // -ve case
		String[] input = {"a"};
		System.out.println(solveGroupAnagrams(input));
	}
	
	@Test
	public void testData5() {						   // edge case
		String[] input = {""};
		System.out.println(solveGroupAnagrams(input));
	}
	
	/* Pseudocode -
	 * Convert the input string to input list
	 * Initialize List of String List as output
	 * Initialize String List as anagrams
	 * Initialize two empty Strings s1 and s2
	 * Iterate through the input list till its empty
	 *   if list size is 1
	 *   	Add new list of input list value to output list
	 *   	remove the input list value
	 *   else
	 *   	Assign s1 list value 1
	 *   	Add s1 value to anagrams list
	 *     	remove s1 from input list
	 *  	Assign s2 list value 2
	 *   if s1 and s2 are anagrams
	 *   		Add s2 value to anagrams list
	 *   		remove s2 from input list
	 *   else 
	 *   	increment s2 pointer
	 *   	
	 */

	// Solution 1
	private List<List<String>> solveGroupAnagrams1(String[] input) {
		if(input.length==0) return null;
		List<String> anagrams = new ArrayList<>();
		List<List<String>> groupAnagrams = new ArrayList<List<String>>();
		List<String> inputWords = new ArrayList<>();
		inputWords.addAll(Arrays.asList(input));
		String firstWord ="",nextWord="";
		while(inputWords.size()>0) {
			if(inputWords.size()==1) 
			{
				groupAnagrams.add(new ArrayList(inputWords));
				inputWords.remove(0);
				break;
			}	
			firstWord = inputWords.get(0);
			anagrams.add(firstWord);
			inputWords.remove(0);
			for(int i=0;i<inputWords.size();i++) {
			nextWord = inputWords.get(i);
			if(isAnagram(firstWord,nextWord)) {
				anagrams.add(nextWord);
				inputWords.remove(i);
				i--;
			}
			}
			groupAnagrams.add(new ArrayList(anagrams));
			anagrams.clear();
		}
		return groupAnagrams;
	}

	private boolean isAnagram(String firstWord, String nextWord) {
		HashMap<Character,Integer> anagramResult = new HashMap<Character,Integer>();
		for(char c : firstWord.toCharArray())
			anagramResult.put(c,anagramResult.getOrDefault(c, 0)+1);
		for(char c : nextWord.toCharArray())
			anagramResult.put(c,anagramResult.getOrDefault(c, 0)-1);
		/*
		 * for(Entry<Character, Integer> entry:anagramResult.entrySet()) {
		 * if(entry.getValue()!=0) return false; }
		 */
		for(int i: anagramResult.values()) {
			if(i!=0) return false;
		}
			
		return true;
	}
	
	// Solution 2
	private List<List<String>> solveGroupAnagrams(String[] input) {
	//List<List<String>> groupAnagrams = new ArrayList<List<String>>();
	HashMap<String,List<String>> groupAnagrams = new HashMap<String,List<String>>(); 
	for(String word: input) {
		char[] alpha = new char[26];
		for(char c:word.toCharArray()) alpha[c-'a']++;
		String output = String.valueOf(alpha);
		if(!groupAnagrams.containsKey(output)) groupAnagrams.put(output, new ArrayList<>());
		groupAnagrams.get(output).add(word);
	}
		return new ArrayList<>(groupAnagrams.values());
	}
	
	

}
