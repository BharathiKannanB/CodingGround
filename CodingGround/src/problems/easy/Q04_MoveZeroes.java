package problems.easy;

import java.util.Arrays;

import org.junit.Test;

/*S.No.  : 4
Problem  : Move Zeroes
Link     : https://leetcode.com/problems/move-zeroes/
Author 	 : BK
Version	 : 1.0
Time Complexity:O[N]
Space Complexity:O[1]*/

public class Q04_MoveZeroes {

	@Test
	public void testcase1() {
		int[] nums = {0,5,0,3,2};
		moveZerosSolution1(nums);
	}
	
	@Test
	public void testcase2() {
		int[] nums = {5,5,1,3,2};
		moveZerosSolution1(nums);
	}
	
	@Test
	public void testcase3() {
		int[] nums = {0,0,0,0,0};
		moveZerosSolution1(nums);
	}
	
	@Test
	public void testcase4() {
		int[] nums = {1,5,3,3,2,0,0};
		moveZerosSolution1(nums);
	}
	
	@Test
	public void testcase5() {
		int[] nums = {0};
		moveZerosSolution1(nums);
	}
	
	@Test
	public void testcas6() {
		int[] nums = {5,-3,0,2};
		moveZerosSolution1(nums);
	}

	/* Solution - Sliding Window */
	private void moveZerosSolution1(int[] nums) {
		System.out.println("Before moving zero"+Arrays.toString(nums));
		int left=0,right=1,temp;
		while(right<nums.length) {
			if(nums[left]==0&&nums[right]!=0) {
				temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left++;
				right++;}
			else if(nums[right]==0&&nums[left]!=0) left=right;
			else right++;	
		}
		System.out.println("After moving zero"+Arrays.toString(nums));
	}
}
