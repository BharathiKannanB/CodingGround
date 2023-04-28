package codinground.prep;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindrome {

	/* https://leetcode.com/problems/valid-palindrome/
	 * Time Complexity - O[N]
	 * Space Complexity - O[N]
	 */
	
	@Test
	public void testData1() {
		String s = "A man, a plan, a canal: Panama";
		boolean output = true;
		Assert.assertEquals(output, solveValidPalindrome(s));
	}
	
	@Test
	public void testData2() {
		String s = "race a car";
		boolean output = false;
		Assert.assertEquals(output, solveValidPalindrome(s));
	}
	
	@Test
	public void testData3() {
		String s = " ";
		boolean output = true;
		Assert.assertEquals(output, solveValidPalindrome(s));
	}
	
	@Test
	public void testData4() {
		String s = "a";
		boolean output = true;
		Assert.assertEquals(output, solveValidPalindrome(s));
	}
	
	@Test
	public void testData5() {
		String s = "aba";
		boolean output = true;
		Assert.assertEquals(output, solveValidPalindrome(s));
	}

	/* Solution 1 - Using regex and StringBuffer */
	private boolean solveValidPalindrome1(String s) {
		s= s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		StringBuffer output = new StringBuffer(s);
		return output.reverse().toString().equals(s);
	}
	
	/* Solution 1 - Using regex and toCharArray */
	private boolean solveValidPalindrome(String s) {
		s= s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		String output ="";
		for(int i=s.length()-1;i>=0;i--) {
			output = output+s.charAt(i);
		}
		return output.equals(s);
	}
	
}
