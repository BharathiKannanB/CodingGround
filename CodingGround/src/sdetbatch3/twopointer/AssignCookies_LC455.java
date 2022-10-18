package sdetbatch3.twopointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class AssignCookies_LC455 {

	/*	Problem  :   Assign Cookies - https://leetcode.com/problems/assign-cookies/
	Time Complexity:O[N]
	Space Complexity:O[1]  */
	
	@Test
	public void testData1() {           //  Exp OP - 1
		int[] nums1 = {1,2,3};
		int[] nums2 = {1,1};
		System.out.println(solveAssignCookies(nums1, nums2));
	}
	
	@Test
	public void testData2() {           //  Exp OP - 2
		int[] nums1 = {1,2};
		int[] nums2 = {1,2,3};
		System.out.println(solveAssignCookies(nums1, nums2));
	}
	
	
	@Test
	public void testData3() {           //  Exp OP - 0
		int[] nums1 = {1,2,3};
		int[] nums2 = {};
		System.out.println(solveAssignCookies(nums1, nums2));
	}
	
	@Test
	public void testData4() {           //  Exp OP - 0
		int[] nums1 = {2,3,3};
		int[] nums2 = {1,1};
		System.out.println(solveAssignCookies(nums1, nums2));
	}
	
	@Test
	public void testData5() {           //  Exp OP - 3
		int[] nums1 = {1,2,3};
		int[] nums2 = {1,2,3};
		System.out.println(solveAssignCookies(nums1, nums2));
	}
	
	/*Pseudocode:
	 * - Sort both input arrays
	 * - Initialize p1 and p2 pointers
	 * - Iterate each pointer with each array
	 * 	   - Compare both pointer values		
	 *     - If value of p1 pointer is lesser than or equal to value of p2 pointer, increment both pointer and increment output
	 *     - else, increment p2 pointer
	 * - return the output.
	 */
	
	private int solveAssignCookies(int[] nums1, int[] nums2) {
		if(nums2.length==0) return 0;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int p1=0,p2=0,output=0;
		while(p1<nums1.length&&p2<nums2.length) {
			if(nums1[p1]<=nums2[p2]) {
				output++;
				p1++;}
				p2++;
			
		}
		return output;
	}

	

	
}
