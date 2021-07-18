package problems.easy;

import org.junit.Test;

/*
 * S.No. : 26
 * Problem : Merge Sorted Array
 * Link : https://leetcode.com/problems/merge-sorted-array/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q26_MergeSortedArray {

	@Test
	public void testcase1() {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m=3,n=3;
		mergeSortedArraySolution(nums1,nums2,m,n);   //Expected O/P : {1,2,2,3,5,6};
	}
	
	@Test
	public void testcase2() {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {4,5,6};
		int m=3,n=3;
		mergeSortedArraySolution(nums1,nums2,m,n);   //Expected O/P : {1,2,3,4,5,6};
	}
	
	@Test
	public void testcase3() {
		int[] nums1 = {0,0,0};
		int[] nums2 = {2,5,6};
		int m=0,n=3;
		mergeSortedArraySolution(nums1,nums2,m,n);   //Expected O/P : {2,5,6};
	}
	
	@Test
	public void testcase4() {
		int[] nums1 = {1};
		int[] nums2 = {};
		int m=1,n=0;
		mergeSortedArraySolution(nums1,nums2,m,n);   //Expected O/P : {1};
	}
	
	//@Test
	public void testcase5() {
		int[] nums1 = {1};
		int[] nums2 = {2};
		int m=1,n=1;
		mergeSortedArraySolution(nums1,nums2,m,n);   //Expected O/P : Enter Valid inputs
	}

	/* Solution 1 */
	private void mergeSortedArraySolution(int[] nums1, int[] nums2, int len1, int len2) {
		 int i1 = len1 - 1;
		    int i2 = len2 - 1;
		    int j = len1 + len2 - 1;

		    while (i1 >= 0 && i2 >= 0) {
		      if (nums1[i1] > nums2[i2])
		        nums1[j--] = nums1[i1--];
		      else
		        nums1[j--] = nums2[i2--];
		    }

		    while (i2 >= 0)
		      nums1[j--] = nums2[i2--];
		  }
	
}
