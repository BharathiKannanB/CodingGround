package sdetbatch3.twopointer;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayParity_LC905 {

	
/*	Problem  :  Sort Array By Parity - https://leetcode.com/problems/sort-array-by-parity/solution/
	Time Complexity:O[N]
	Space Complexity:O[1]  */
	
	@Test
	public void testData1() {           //  Exp OP - 2,4,3,1
		int[] nums = {3,1,2,4};
		System.out.println((Arrays.toString(solveSortArrayParity(nums))));
	}
	
	@Test
	public void testData2() {           //  Exp OP - 2,6,6,8,5,7,9
		int[] nums = {5,6,2,6,7,8,9};
		System.out.println((Arrays.toString(solveSortArrayParity(nums))));
	}
	
	@Test
	public void testData3() {           //  Exp OP - 1,3,5,11
		int[] nums = {1,3,5,11};
		System.out.println((Arrays.toString(solveSortArrayParity(nums))));
	}
	
	@Test
	public void testData4() {           //  Exp OP - 2,2,2,2,2,2
		int[] nums = {2,2,2,2,2,2};
		System.out.println((Arrays.toString(solveSortArrayParity(nums))));
	}
	
	@Test
	public void testData5() {           //  Exp OP - 0
		int[] nums = {0};
		System.out.println((Arrays.toString(solveSortArrayParity(nums))));
	}

	//Solution 1 - Two Pointer
	private int[] solveSortArrayParity(int[] nums) {
		int left=0,right=nums.length-1,temp=0;
        while(left<right)
        {
            if(nums[left]%2==0)
            {
                left++;
               if(nums[right]%2!=0)   
                right--;  
            }
            else
            {
             if(nums[right]%2==0){
                 temp=nums[left];
                 nums[left]=nums[right];
                 nums[right]=temp;
             }
               else
                  right--;
            }
        }
        return nums;
	}
	
	/* Pseudocode:
	 * - Initialize two pointer variables
	 * - Iterate the pointer variables from each end
	 * - if left pointer value is odd and right pointer value is even, swap two values
	 * - if right pointer value is odd, decrement right pointer
	 * - if left pointer value is even, increment left pointer
	 */
	
	//Solution 2 - Two Pointer
		private int[] solveSortArrayParity2(int[] A) {
			 int i = 0, j = A.length - 1;
		        while (i < j) {
		            if (A[i] % 2 > A[j] % 2) {
		                int tmp = A[i];
		                A[i] = A[j];
		                A[j] = tmp;
		            }

		            if (A[i] % 2 == 0) i++;
		            if (A[j] % 2 == 1) j--;
		        }

		        return A;
		}
	
	
	
}
