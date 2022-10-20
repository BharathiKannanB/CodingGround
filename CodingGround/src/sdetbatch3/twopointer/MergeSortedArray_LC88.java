package sdetbatch3.twopointer;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray_LC88 {

	/*	Problem  :   Merge Sorted Array - https://leetcode.com/problems/merge-sorted-array/
	Time Complexity:O[N]
	Space Complexity:O[N]  */	
	
	//@Test
	public void testData1() {           //  Exp OP - [1,2,2,3,5,6]
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m=3;
		int n=3;
		System.out.println((Arrays.toString(solveMergeSortedArray(nums1,m, nums2,n))));
	}
	
	//@Test
	public void testData2() {           //  Exp OP - [1]
		int[] nums1 = {1};
		int[] nums2 = {};
		int m=1;
		int n=0;
		System.out.println((Arrays.toString(solveMergeSortedArray(nums1,m, nums2,n))));
	}
	
	//@Test
	public void testData3() {           //  Exp OP - [1]
		int[] nums1 = {0};
		int[] nums2 = {};
		int m=0;
		int n=1;
		System.out.println((Arrays.toString(solveMergeSortedArray(nums1,m, nums2,n))));
	}
	
	//@Test
	public void testData4() {           //  Exp OP - [1,1,1,1,1,1]
		int[] nums1 = {1,1,1,0,0,0};
		int[] nums2 = {1,1,1};
		int m=3;
		int n=3;
		System.out.println((Arrays.toString(solveMergeSortedArray(nums1,m, nums2,n))));
	}
	
	@Test
		public void testData5() {           //  Exp OP - [1,2,2,3,5,6]
			int[] nums1 = {2,0};
			int[] nums2 = {1};
			int m=1;
			int n=1;
			System.out.println((Arrays.toString(solveMergeSortedArray(nums1,m, nums2,n))));
		}
	
	/* Pseudocode:
	 * - Initialize three pointers with value m,n and length of input1
	 * - Iterate through two inputs
	 *     -If value of p1>value of p2, assign value of p3=p1, --p3,--p1
	 *     -Else if value of p1<=value of p2, assign value of p3=p2, --p3,--p2
	 * - return input 1            
	 */

	private int[] solveMergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
		 int i1 = m - 1;
		    int i2 = n - 1;
		    int j = m + n - 1;

		    while (i1 >= 0 && i2 >= 0) {
		      if (nums1[i1] > nums2[i2])
		        nums1[j--] = nums1[i1--];
		      else
		        nums1[j--] = nums2[i2--];
		    }

		    while (i2 >= 0)	
		  nums1[j--] = nums2[i2--];
			return nums1;	    
	}

	
}

