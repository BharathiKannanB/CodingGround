package codinground.prep;

import org.junit.Assert;
import org.junit.Test;

public class ReverseInteger {

	
	/* Reverse Integer
	 * 
	 * 
	 */
	
	
	@Test    // +ve case
	public void testData1() {
	int input = 123;
	int output = 321;
	Assert.assertEquals("+ve case passed", output, solveReverseInteger(input));
	}
	
	@Test    // +ve case
	public void testData2() {
	int input = 120;
	int output = 21;
	Assert.assertEquals("+ve case passed", output, solveReverseInteger(input));
	}
	
	@Test    // -ve case
	public void testData3() {
	int input = -123;
	int output = -321;
	Assert.assertEquals("-ve case passed", output, solveReverseInteger(input));
	}
	
	@Test    // edge case
	public void testData4() {
	int input = 1;
	int output = 1;
	Assert.assertEquals("edge case passed", output, solveReverseInteger(input));
	}

	// Solution 1 - StringBuffer - not working
	private int solveReverseInteger1(int input) {
		String outputString = String.valueOf(input);
		if(outputString.length()<2) return input;
		StringBuffer output = new StringBuffer(outputString);
		if(input>0)
			return Integer.parseInt(output.reverse().toString());
		else
			return Integer.parseInt(output.deleteCharAt(0).reverse().insert(0, '-').toString());
	}
	
	// Solution 2 - math operators
		private int solveReverseInteger(int input) {
			
			int rev = 0;
			while(input!=0)
			{
				rev = rev*10 + input%10;
				input = input/10;
			}
			if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE) return 0;
			return rev;
		}
	
}
