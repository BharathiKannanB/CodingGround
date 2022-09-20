package problems.medium;

import java.util.Arrays;

import org.junit.Test;

/*
 * S.No. :1
 * Problem : Sort Colors
 * Link : https://leetcode.com/problems/sort-colors/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q1_SortColors_LC75 {

	@Test
	public void testData1() {           // given input // Exp OP - 0 0 1 1 2 2
		int[] nums = {2,0,2,1,1,0};
		System.out.println(Arrays.toString(sortColorsSolution1(nums)));
	}

	//@Test
	public void testData2() {           // no duplicates
		int[] nums = {2,1,0};
		System.out.println(Arrays.toString(sortColorsSolution1(nums)));
	}
	
	//@Test
	public void testData3() {         // sorted input
		int[] nums = {0,0,1,1,2};
		System.out.println(sortColorsSolution1(nums));
	}
	
	//@Test
	public void testData4() {			
		int[] nums = {2,0,2,1,1,0};
		System.out.println(sortColorsSolution1(nums));
	}
	
	//@Test
	public void testData5() {
		int[] nums = {2,0,2,1,1,0};
		System.out.println(sortColorsSolution1(nums));
	}
	
	/* Solution - Two Pointer */
	private int[] sortColorsSolution1(int[] nums) {
		int zero=0,one=0,two=nums.length-1,left=0,right=nums.length-1,i=0;
		int op[] = new int[nums.length];
		while(left<=right) {
			if(nums[left]==0) {
				op[zero]=0;
				zero++;
				left++;
			}
			else if(nums[left]==2)
			{
				op[two-1]=op[two];
				op[two]=2;
				two--;
				left++;
			}
			else if(nums[left]==1)
			{	
				op[two]=1;
				left++;
			}
			if(left==right) break;
			if(nums[right]==0) {
				op[zero]=0;
				zero++;
				right--;
			}
			else if(nums[right]==2) {
				op[two-1]=op[two];
				op[two]=2;
				two--;
				right--;
			}
			else if(nums[right]==1)
			{	
				op[two]=1;
				right--;
			}
		}
		/*
		 * while(one>0) { op[zero]=1; zero++; one--; }
		 */
		return op;
	}
	
	
}
