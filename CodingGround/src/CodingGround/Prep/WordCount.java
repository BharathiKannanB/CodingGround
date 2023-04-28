package codinground.prep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class WordCount {
	
	/* Word Count
	 * Time Complexity -
	 * Space Complexity -
	 */
	
	@Test
	 public void testData1() {			// +ve case
		String words = "My name is abc my father name is bcd my mother name is xyz";
		solveWordCount(words);
	}
	
	//@Test
	 public void testData2() {			// -ve case
		String words = "find the word";
		solveWordCount(words);
	}
	
	//@Test
	 public void testData3() {			// edge case
		String words = "apple";
		solveWordCount(words);
	}
	
	//@Test
	 public void testData4() {			// +ve case
		String words = "apple apple apple";
		solveWordCount(words);
	}
	
	//@Test
	 public void testData5() {			// edge case
		String words = "";
		solveWordCount(words);
	}

	/* Solution using Map */
	private void solveWordCount(String words) {
		LinkedHashMap<String,Integer> wordsCount = new LinkedHashMap<>(); 
		for(String word:words.split(" ")) 
			wordsCount.put(word, wordsCount.getOrDefault(word, 0)+1);
		for(Map.Entry<String, Integer> entry : wordsCount.entrySet()) 
			System.out.println(entry.getKey()+" - "+entry.getValue());
	}

}
