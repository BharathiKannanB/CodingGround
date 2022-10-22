package sdetbatch3.slidingwindow;

import java.util.Iterator;

import org.junit.Test;

public class MaxiumAverageSubArray_LC643 {

	/* Maximum Average Subarray I - https://leetcode.com/problems/maximum-average-subarray-i/
	 * Time complexity -
	 * Space complexity - 
	 */
	
	//@Test
	public void testData1() {       // Exp. Op : 3.0
		int[] nums = {1,3,3,2,1};
		int k=2;
		System.out.println(solveMaxiumumAverageSubArray(nums,k));
	}
	
	//@Test
	public void testData2() {       // Exp. Op : 12.75000
		int[] nums = {1,12,-5,-6,50,3};
		int k=4;
		System.out.println(solveMaxiumumAverageSubArray(nums,k));
	}
	
	//@Test
	public void testData3() {       // Exp. Op : 5.0
		int[] nums = {5};
		int k=1;
		System.out.println(solveMaxiumumAverageSubArray(nums,k));
	}
	
	//@Test
	public void testData4() {       // Exp. Op : 0
		int[] nums = {1,3,3,2};
		int k=5;
		System.out.println(solveMaxiumumAverageSubArray(nums,k));
	}
	
	//@Test
	public void testData5() {       // Exp. Op : 3.500
		int[] nums = {1,3,4,0,7};
		int k=2;
		System.out.println(solveMaxiumumAverageSubArray(nums,k));
	}
	
	@Test
	public void testData6() {       // Exp. Op : 7
		int[] nums = {7,4,5,8,8,3,9,8,7,6};
		int k=7;
		System.out.println(solveMaxiumumAverageSubArray(nums,k));
	}
	
	/* Pseudocode:
	 * - Iterate the input array till k length
	 *    - current average = Sum of all value / k
	 * - current average=maximum average
	 * - Iterate the input array from k to end of array
	 *    - current average = (current average +  input[i] - input(i-k) )/k
	 *    - if(current average>maximum average)maximum average=current average; 
	 */

	private double solveMaxiumumAverageSubArray(int[] nums, int k) {
		if(nums.length<k) return 0;
		double win_avg=0,max_avg=0,sum=0;
		for(int i=0;i<k;i++)
			sum += nums[i];
		win_avg = sum/k;
		max_avg=win_avg;
		for(int i=k;i<nums.length;i++) {
			sum =sum+nums[i]-nums[i-k];
			win_avg=(sum)/k;
			if(win_avg>max_avg)max_avg=win_avg;
		}
		return max_avg;
	}
	
	
}
