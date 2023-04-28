package codinground.prep;

import org.junit.Assert;
import org.junit.Test;

public class BuySellStock {
	
	/* 
	 * Time Complexity  - O[n]
	 * Space Complexity - O[n] 
	 */
	
	@Test
	public void testData1() {			// +ve case
		int[] input = {7,1,5,3,6,4};
		int output = 5;
		Assert.assertEquals(output, solveBuySellStock(input));
	}	
	
	@Test
	public void testData2() {			// +ve case
		int[] input = {1,1,1,1};
		int output = 0;
		Assert.assertEquals(output, solveBuySellStock(input));
	}
	
	@Test
	public void testData3() {			// -ve case
		int[] input = {5,4,3,2};
		int output = 0;
		Assert.assertEquals(output, solveBuySellStock(input));
	}
	
	@Test
	public void testData4() {			// edge case
		int[] input = {1};
		int output = 0;
		Assert.assertEquals(output, solveBuySellStock(input));
	}
	
	@Test
	public void testData5() {			// +ve case
		int[] input = {2,1,4};
		int output = 3;
		Assert.assertEquals(output, solveBuySellStock(input));
	}
	
	@Test
	public void testData6() {			// +ve case
		int[] input = {1,2,4,2,5,7,2,4,9,0,9};
		int output = 9;
		Assert.assertEquals(output, solveBuySellStock(input));
	}


	// Solution Kadane
	private int solveBuySellStock(int[] input) {
		int profit=0,sum=0;
		for(int i=1;i<input.length;i++) {
		sum += input[i]-input[i-1];
		if(sum<0) sum=0;
		profit = Math.max(sum, profit);	
		}
		return profit;
	}
}
