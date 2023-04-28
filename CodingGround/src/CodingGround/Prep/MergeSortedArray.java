package codinground.prep;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArray {
	
	/* Merge Sorted Array
	 * Time Complexity = O[n]
	 * Space Complexity = O[n]
	 */
	
	@Test
	public void testData1() {				// +ve testcase
		int[] input1 = {1,2,3,4};
		int[] input2 = {5,6,7,8};
		int[] output = {1,2,3,4,5,6,7,8};
		Assert.assertArrayEquals(output, solveMergeSortedArray(input1,input2));
	}

	@Test
	public void testData2() {				// +ve testcase
		int[] input1 = {1,2,3,4};
		int[] input2 = {1,2,3,4};
		int[] output = {1,1,2,2,3,3,4,4};
		Assert.assertArrayEquals(output, solveMergeSortedArray(input1,input2));
	}
	
	@Test
	public void testData3() {				// +ve testcase
		int[] input1 = {1,1,1};
		int[] input2 = {1,1,1};
		int[] output = {1,1,1,1,1,1};
		Assert.assertArrayEquals(output, solveMergeSortedArray(input1,input2));
	}
	
	@Test
	public void testData4() {				// -ve testcase
		int[] input1 = {1,2,3};
		int[] input2 = {};
		int[] output = {1,2,3};
		Assert.assertArrayEquals(output, solveMergeSortedArray(input1,input2));
	}
	
	@Test
	public void testData5() {				// edge testcase
		int[] input1 = {1};
		int[] input2 = {2};
		int[] output = {1,2};
		Assert.assertArrayEquals(output, solveMergeSortedArray(input1,input2));
	}
	
	/* Pseudocode 
	 * Initialize a output int array with size = sum of input1 and input2 size
	 * Initialize two pointers = 0
	 * Iterate both arrays through two pointers
	 * 		if Pointer1 value < Pointer2 value
	 * 				Add pointer1 value to output array 
	 * 				if pointer1 is not the last index
	 * 					 increment pointer 1
	 * 				else
	 * 					value of pointer 1 = Maximum value
	 * 		else
	 * 				Add pointer2 value to output array 
	 * 				if pointer2 is not the last index
	 * 					 increment pointer 2
	 * 				else
	 * 					value of pointer 2 = Maximum value
	 *  
	 * */
	
	
	/* Solution using Two pointer */
	private int[] solveMergeSortedArray(int[] input1, int[] input2) {
		int firstArraySize = input1.length,secondArraySize = input2.length;
		if(firstArraySize>0&&secondArraySize==0)
			return input1;
		else if(firstArraySize==0&&secondArraySize>0)
			return input2;
		int[] outputArray = new int[firstArraySize+secondArraySize];
		int firstArrayPointer = 0, secondArrayPointer = 0,outputArrayPointer=0;
		do {
			if(input1[firstArrayPointer]<input2[secondArrayPointer])
			{
				outputArray[outputArrayPointer]=input1[firstArrayPointer];
				if(firstArrayPointer!=firstArraySize-1)
					firstArrayPointer++;
				else
					input1[firstArrayPointer]=Integer.MAX_VALUE;
			}
			else
			{
				outputArray[outputArrayPointer]=input2[secondArrayPointer];
				if(secondArrayPointer!=secondArraySize-1)
					secondArrayPointer++;
				else
					input2[secondArrayPointer]=Integer.MAX_VALUE;
			}
			outputArrayPointer++;
		}while(input1[firstArrayPointer]!=Integer.MAX_VALUE||input2[secondArrayPointer]!=Integer.MAX_VALUE);
		System.out.println(Arrays.toString(outputArray));
		return outputArray;
	}

}
