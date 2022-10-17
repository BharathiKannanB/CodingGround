package sdet3;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeroes_LC283 {

	
/*	Problem  :  Move Zeroes - https://leetcode.com/problems/move-zeroes/
	Time Complexity:O[N]
	Space Complexity:O[1]  */
	
	@Test
	public void testData1() {           //  Exp OP - 1,3,12,0,0
		int[] nums = {0,1,0,3,12};
		System.out.println((Arrays.toString(solveMoveZeroes(nums))));
	}

	//@Test
	public void testData2() {           //  Exp OP - 0,0,0,0,0
		int[] nums = {0,0,0,0,0};
		System.out.println((Arrays.toString(solveMoveZeroes(nums))));
	}
	
 //	@Test
	public void testData3() {           //  Exp OP - 1,3,5,11
		int[] nums = {1,3,5,11};
		System.out.println((Arrays.toString(solveMoveZeroes(nums))));
	}
	
	//@Test
	public void testData4() {           //  Exp OP - 0
		int[] nums = {0};
		System.out.println((Arrays.toString(solveMoveZeroes(nums))));
	}
	
	@Test
	public void testData5() {           //  Exp OP - 1,3,12,0,0
		int[] nums = {5,1,0,3,12};
		System.out.println((Arrays.toString(solveMoveZeroes(nums))));
	}
	
	/*Pseudocode:
	 * - Initialize left and right pointer
	 * - Iterate the input through two pointers
	 *    - If left pointer value is zero and right pointer is non zero, swap two values
	 *    - If right pointer value is zero, decrement right
	 *    - If left pointer value is non zero, increment left
	 * - return output
	 */
	
	// Solution - Two pointer
	private int[] solveMoveZeroes(int[] nums) {
		if(nums.length==1) return nums;
		int left=0,right=0;
		int	 temp;
		while(right<nums.length) {
			if(nums[right]==0) right++;
			else  {
				temp = nums[left];
	                nums[left] = nums[right];
	                nums[right] = temp;
				right++;
				left++;
			}		
		}
		return nums;
	}
	
	private int[] solveMoveZeroes2(int[] nums) {
		 int n = nums.length;
	        
	        if(n == 0 || n == 1)
	            return nums;
	        
	        // Two Pointer Approach
	        int left = 0; 
	        int right = 0;
	        
	        // for swap
	        int temp;
	        
	        // Rearrangement
	        while(right < n){
	            // when ever right pointer see zero value it get incremented
	            if(nums[right]==0)
	                ++right;
	            else {
	                // when it see non-zero element it swap with left pointer value and then increment both right and left pointer
	                
	                //swap
	                temp = nums[left];
	                nums[left] = nums[right];
	                nums[right] = temp;
	                ++left;
	                ++right;
	            }
	        }
	        return nums;
	    }
	
}
