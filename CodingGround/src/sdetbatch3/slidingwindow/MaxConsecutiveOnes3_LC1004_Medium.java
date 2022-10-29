package sdetbatch3.slidingwindow;

import org.junit.Test;

public class MaxConsecutiveOnes3_LC1004_Medium {

	/*	Problem  :  Maximum consecutive ones 3 - https://leetcode.com/problems/max-consecutive-ones-iii/
	Time Complexity: O[n^2]
	Space Complexity: O[1]   */
	
	//@Test
	public void testData1() {           //  Exp OP - 6
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2; 
		System.out.println((solveMaximumConsecutiveOnes(nums,k)));
	}
	
	@Test
	public void testData2() {           //  Exp OP - 10
		int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k = 3; 
		System.out.println((solveMaximumConsecutiveOnes(nums,k)));
	}
	
	//@Test
	public void testData3() {           //  Exp OP - 2
		int[] nums = {1,1,0,1};
		int k = 0; 
		System.out.println((solveMaximumConsecutiveOnes(nums,k)));
	}
	
	//@Test
	public void testData4() {           //  Exp OP - 6
		int[] nums = {1,1,0,0,0,1};
		int k = 5; 
		System.out.println((solveMaximumConsecutiveOnes(nums,k)));
	}
	
	//@Test
	public void testData5() {           //  Exp OP - 1
		int[] nums = {1};
		int k = 1; 
		System.out.println((solveMaximumConsecutiveOnes(nums,k)));
	}

	private int solveMaximumConsecutiveOnes1(int[] nums, int k) {
	 int left=0,countZeroes=0,max=Integer.MIN_VALUE;
	 for (int right = 0; right < nums.length; right++) {
		if(nums[right]==0) countZeroes++;
		while(countZeroes>k) {
			if(nums[left]==0)countZeroes--;
			left++;
		}
		max = Math.max(max, right-left+1);
		
	}
		return max;
	}
	
	private int solveMaximumConsecutiveOnes(int[] num, int k) {
		 int max=1;
	        for (int i = 0, left=0; i < num.length; i++) {
	           if (num[i] == 1) continue;
	            if (num[i] == 0) k--;

	            while (k < 0 && left<=i) {
	                if(num[left] == 0)
	                    k++;

	                left++;
	            }
	            max=Math.max(max, i-left+1);
	        }
	        return max;
		}
	
}
