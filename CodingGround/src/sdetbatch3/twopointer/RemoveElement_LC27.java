package sdetbatch3.twopointer;

import java.util.Arrays;

import org.junit.Test;

public class RemoveElement_LC27 {

	/*	Problem  : Remove Element - https://leetcode.com/problems/sort-array-by-parity/solution/
	Time Complexity:O[N]
	Space Complexity:O[1]  */
	
	@Test
	public void testData1() {           //  Exp OP - 2
		int[] nums = {3,2,2,3};
		int val=3;
		System.out.println((solveRemoveElement(nums,val)));
	}

	@Test
	public void testData2() {           //  Exp OP -5
		int[] nums = {0,1,2,2,3,0,4,2};
		int val=2;
		System.out.println((solveRemoveElement(nums,val)));
	}
	
	@Test
	public void testData3() {           //  Exp OP - 4
		int[] nums = {3,2,2,3};
		int val=4;
		System.out.println((solveRemoveElement(nums,val)));
	}
	
	@Test
	public void testData4() {           //  Exp OP - 0
		int[] nums = {3,3,3,3};
		int val=3;
		System.out.println((solveRemoveElement(nums,val)));
	}
	
	@Test
	public void testData5() {           //  Exp OP - 0
		int[] nums = {0};
		int val=0;
		System.out.println((solveRemoveElement(nums,val)));
	}
	
	@Test
	public void testData6() {           //  Exp OP - 0
		int[] nums = {};
		int val=0;
		System.out.println((solveRemoveElement(nums,val)));
	}
	
	/*-Pseudocode
	 * - Initialize left and right pointers
	 * - Iterate the input through two pointers
	 *   - If right pointer value is not 'val', swap two pointers value and increment both pointers
	 *   - If right pointer value is 'val', increment right pointer
	 * - return left pointer +1
	 */
	
	
	
	private int solveRemoveElement(int[] nums,int val) {
		 if(nums.length==1) {
				if(nums[0]==val) return 0;
				else return nums[0];
			}
	        if(nums.length==0)  return 0;
			
			int left = 0,right=0,temp=0;
			while(right<nums.length) {
				if(nums[right]==val) right++;
				else {
					temp=nums[left];
					nums[left]=nums[right];
					nums[right]=temp;
					left++;
					right++;
				}
			}
			if(nums[0]==val) return 0;
			else return left;
	}
}
