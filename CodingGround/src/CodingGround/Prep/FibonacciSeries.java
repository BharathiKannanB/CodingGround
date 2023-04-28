package codinground.prep;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciSeries {

	/* Fibonacci Series
	 * 
	 */
	
	@Test
	public void testData1() {					//	+ve case
		int input = 5;
		int output = 5;
		Assert.assertEquals(output, solveFibonacciSeries(input));
	}
	

	/* Solution 1 */
	private int solveFibonacciSeries(int input) {
		if(input<=1)
			return input;
		return solveFibonacciSeries(input-1)+solveFibonacciSeries(input-2);
	}
	
}
