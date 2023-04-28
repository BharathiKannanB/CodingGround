package codinground.prep;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;



public class EmailSpam_APPLE {

	/* 1. Implements a prototype of an email spam detection algorithm

 		for simulation subjects of n emails, k spam word are given in two arrays of strings, subjects and spam_word. 
 		
 		An email i considered spam, if it contains at least two spam words in the subject, if a spam word is repeated, 
 		
 		if counts as two so the email is considered spam, the spam words are not case-sensitive.

Example
subjects = ["free prize worth millions", "ten tips for a carefree lifestyle"]
spam_word = ["free", "money", "win", "millions"]

answer
spam
not_spam
	 * 
	 */
	
	@Test
	public void testData1() {													// +ve case
		String subjects[] = {"free prize worth millions", "ten tips for a carefree lifestyle","Free prize worth miLLions"};
		String spamWords[] = {"free", "money", "win", "millions"};
		String output[] = {"spam","not_spam","spam"};
		Assert.assertArrayEquals(output, solveEmailSpam(subjects,spamWords));
	}
	
	@Test
	public void testData2() {													// +ve case
		String subjects[] = {"free prize worth millions", "free money wins millions", "Nothing in life comes free", "free prize worth millions", "millions worth millions"};
		String spamWords[] = {"free", "money", "win", "millions"};
		String output[] = {"spam","spam","not_spam","spam","spam"};
		Assert.assertArrayEquals(output, solveEmailSpam(subjects,spamWords));
	}
	
	@Test
	public void testData3() {													// -ve case
		String subjects[] = {"Quick brown dog jumps over a lazy fox", "Apple"};
		String spamWords[] = {"free", "money", "win", "millions"};
		String output[] = {"not_spam","not_spam"};
		Assert.assertArrayEquals(output, solveEmailSpam(subjects,spamWords));
	}
	
	@Test
	public void testData4() {													// edge case
		String subjects[] = {"free prize worth millions"};
		String spamWords[] = {"free", "money", "win", "millions"};
		String output[] = {"spam"};
		Assert.assertArrayEquals(output, solveEmailSpam(subjects,spamWords));
	}
	
	@Test
	public void testData5() {													// edge case
		String subjects[] = {"free prize worth millions"};
		String spamWords[] = {};
		String output[] = {"not_spam"};
		Assert.assertArrayEquals(output, solveEmailSpam(subjects,spamWords));
	}
	
	/* Pseudocode
	 * Initialize a HashMap of String , Integer 
	 * Iterate the subjects array
	 * 		Assign the string value to the subject variable
	 * 		Iterate the words in subject variable 	
	 * 			Assign each words to Key and number of occurences as Value of hashmap
	 * 		Iterate spamWords
	 * 			If( SpamWords String value equals Key value of HashMap && occurance > 1)
	 * 					subject is considered as spam
	 * if subject!= spam not_spam			
	 * 
	 */
	

	private String[] solveEmailSpam(String[] subjects, String[] spamWords) {
		HashSet<String> spamSet = new HashSet<>();
		StringBuffer subject = new StringBuffer();
		int count = 0;
		
		for (String spam : spamWords)
			spamSet.add(spam.toLowerCase());

		for (int i = 0; i <= subjects.length - 1; i++) {
			subject.append(subjects[i].toLowerCase());
			for (String word : subject.toString().split(" ")) {
				if (spamSet.contains(word))	count++;
				if (count > 1) {
					subjects[i] = "spam";
					break;
				}		
			}
			if (count < 2)
				subjects[i] = "not_spam";
			count = 0;
			subject.setLength(0);
		}

		return subjects;
	}
	
}
