package sdetbatch3.slidingwindow;

import org.junit.Test;

public class MaximumSumSubAray_LC0 {

	/* Maximum sum subarray
	 * Time complexity - O[n]
	 * Space complexity - O[1]
	 */
	
	//@Test
	public void testData1() {          //Exp. Op - 6
		int[] ip = {5,2,-1,0,3};
		int k = 3;
		System.out.println(solveMaximumSubArray(ip,k));
	}
	
	//@Test
	public void testData2() {          //Exp. Op - 0
		int[] ip = {1,2};
		int k = 3;
		System.out.println(solveMaximumSubArray(ip,k));
	}

	@Test
	public void testData3() {          //Exp. Op - 6
		int[] ip = {1,3,4,0,7};
		int k = 2;
		System.out.println(solveMaximumSubArray(ip,k));
	}
	
	//@Test
	public void testData4() {          //Exp. Op - 0
		int[] ip = {1,3,4,0,7};
		int k = 0;
		System.out.println(solveMaximumSubArray(ip,k));
	}
	
	//@Test
	public void testData5() {          //Exp. Op - 15
		int[] ip = {1,3,4,0,7};
		int k = 5;
		System.out.println(solveMaximumSubArray(ip,k));
	}
	
	/* Pseudocode;
	 *  - Initialize two pointers i and j
	 *  - Assign the value of i=0 and j=k-1
	 *  - Identify the current sum value and consider as max sum
	 *  - Iterate the input array with pointer
	 *     - current sum = current sum + value of i + value of j, increment i and j
	 *     - If current sum > max sum, max sum = current sum
	 *  - return max sum
	 */
	
	private int solveMaximumSubArray(int[] ip, int k) {
		int left=0,right=k-1,win_sum=0,max_sum;
		if(ip.length<k||k<1) return 0;
		while(left<=right) 
			win_sum+=ip[left++];
		max_sum=win_sum;left=0;
		right++;
		while(right<ip.length) {
			win_sum =win_sum-ip[left]+ip[right++];
			left++;
			if(win_sum>max_sum)max_sum=win_sum;
		}
		return max_sum;
	}
	
}
