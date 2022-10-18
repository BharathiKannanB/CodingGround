package sdetbatch3.twopointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class IntersectionTwoArrays_LC349 {

	/*	Problem  :   Intersection of Two Arrays - https://leetcode.com/problems/intersection-of-two-arrays/
	Time Complexity:O[N]
	Space Complexity:O[N]  */
	
	//@Test
	public void testData1() {           //  Exp OP - [2]
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		System.out.println((Arrays.toString(solveIntersectionTwoArrays(nums1, nums2))));
	}
	
	//@Test
	public void testData2() {           //  Exp OP - [9,4]
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		System.out.println((Arrays.toString(solveIntersectionTwoArrays(nums1, nums2))));
	}	
	
	@Test
	public void testData3() {           //  Exp OP - [1]
		int[] nums1 = {1};
		int[] nums2 = {1};
		System.out.println((Arrays.toString(solveIntersectionTwoArrays(nums1, nums2))));
	}
	
	@Test
	public void testData4() {           //  Exp OP - [0]
		int[] nums1 = {1,2,3};
		int[] nums2 = {4,5,6};
		System.out.println((Arrays.toString(solveIntersectionTwoArrays(nums1, nums2))));
	}
	
	@Test
	public void testData5() {           //  Exp OP - [1,2,3,4]
		int[] nums1 = {1,2,3,4};
		int[] nums2 = {1,2,3,4};
		System.out.println((Arrays.toString(solveIntersectionTwoArrays(nums1, nums2))));
	}
	
	@Test
	public void testData6() {           //  Exp OP - [1]
		int[] nums1 = {1,1,1,1};
		int[] nums2 = {1,1,1,1};
		System.out.println((Arrays.toString(solveIntersectionTwoArrays(nums1, nums2))));
	}
	
	/*Pseudocode:
	 * - Sort both input arrays
	 * - Initialize left and right pointers
	 * - Iterate each pointer with each array
	 * 	   - Compare both pointer values		
	 *     - If value of left pointer is lesser than value of right pointer, increment left pointer
	 *     - If value of right pointer is lesser than value of left pointer, increment right pointer
	 *     - If both pointer value are equal, add to a set and increment both pointers
	 * - Convert the set into array and return the array.
	 */

	private int[] solveIntersectionTwoArrays(int[] nums1, int[] nums2) {
		Set<Integer> op = new HashSet<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int p1=0,p2=0;
		while(p1<nums1.length&&p2<nums2.length) {
			if(nums1[p1]==nums2[p2]) {
				op.add(nums1[p1]);
				p1++;
				p2++;
			}
			else if(nums1[p1]<nums2[p2]) p1++;
			else p2++;
		}
		int[] oparray = new int[op.size()];
		int temp=0;
		for(Integer num:op) {
			oparray[temp] =num;
			temp++;
		}
		return oparray;
	}
}
