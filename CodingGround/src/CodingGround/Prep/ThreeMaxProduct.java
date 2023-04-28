package codinground.prep;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ThreeMaxProduct {

	/* Maxiumum of three product
	 * Time Complexity - O(nlogn)
	 * Space Complexity - O(1)
	 */
	
	@Test
	public void testData1() {					// +ve case
		int input[] = {3,5,8,1,2,0,6,4};
		int output[] = {5,6,8};
		Assert.assertArrayEquals(output, solveThreeMaxProduct(input));
	}

	@Test
	public void testData2() {					// +ve case
		int input[] = {5,5,5,5};
		int output[] = {5,5,5};
		Assert.assertArrayEquals(output, solveThreeMaxProduct(input));
	}
	
	@Test
	public void testData3() {					// edge case
		int input[] = {1,2,3};
		int output[] = {1,2,3};
		Assert.assertArrayEquals(output, solveThreeMaxProduct(input));
	}
	
	@Test
	public void testData4() {					// +ve case
		int input[] = {-5,-4,2,-2};
		int output[] = {-5,-4,2};
		Assert.assertArrayEquals(output, solveThreeMaxProduct(input));
	}
	
	@Test
	public void testData5() {					// -ve case
		int input[] = {1};
		int output[] = {};
		Assert.assertArrayEquals(output, solveThreeMaxProduct(input));
	}
	
	@Test
	public void testData6() {					// +ve case
		int input[] = {-1,-2,-3,-4};
		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		int output[] = {-3,-2,-1};
		Assert.assertArrayEquals(output, solveThreeMaxProduct(input));
	}
	
	@Test
	public void testData7() {					// +ve case
		int input[] = {-1,-2,0,4};
		int output[] = {-1,-2,4};
		Assert.assertArrayEquals(output, solveThreeMaxProduct(input));
	}
	
	private int[] solveThreeMaxProduct(int[] input) {
		if(input.length<3) return new int[] {};
		else if (input.length<3) return input;
		Arrays.sort(input);
		int[] output = new int[3];
		 if(input[0]<0&&input[1]<0&&input[input.length-1]>=0)
			return new int[] {input[0],input[1],input[input.length-1]};
		else
			return new int[] {input[input.length-3],input[input.length-2],input[input.length-1]};
		
	}
}
