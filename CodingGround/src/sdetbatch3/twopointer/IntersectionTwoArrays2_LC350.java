package sdetbatch3.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class IntersectionTwoArrays2_LC350 {
	
	/*	Problem  :   Intersection of Two Arrays 2 - https://leetcode.com/problems/intersection-of-two-arrays-ii/
	Time Complexity:O[N]
	Space Complexity:O[N]  */
	
		@Test
		public void testData1() {           //  Exp OP - [2,2]
			int[] nums1 = {1,2,2,1};
			int[] nums2 = {2,2};
			System.out.println((Arrays.toString(solveIntersectionTwoArrays(nums1, nums2))));
		}
		
		@Test
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
		public void testData6() {           //  Exp OP - [1,1,1,1]
			int[] nums1 = {1,1,1,1};
			int[] nums2 = {1,1,1,1};
			System.out.println((Arrays.toString(solveIntersectionTwoArrays(nums1, nums2))));
		}
		
		
		/* Pseudocode
		 *  - Initialize two pointers p1 and p2 for two arrays
		 *  - Sort both arrays
		 *  - Iterate through two input arrays
		 *    - If value of p1 and p2 are equal, add to a output list
		 *    - If value of p1 is greater than p2, increment p2
		 *    - If value of p2 is greater than p1, increment p1
		 *  - return the output  
		 */
		
		private int[] solveIntersectionTwoArrays2(int[] nums1, int[] nums2) {
			List<Integer> op = new ArrayList<Integer>();
			int p1=0,p2=0,j=0;
			Arrays.sort(nums1);
			Arrays.sort(nums2);
			while(p1<nums1.length&&p2<nums2.length) {
				if(nums1[p1]==nums2[p2]) {
					op.add(nums1[p1]);
					p1++;
					p2++;
				}
				else if(nums1[p1]>nums2[p2]) p2++;
				else p1++;
			}
			int[] result = new int[op.size()];
			for(int i:op)
				result[j++]=i;
			return result;
		}
		
		private int[] solveIntersectionTwoArrays(int[] nums1, int[] nums2) {	
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			List<Integer> op = new ArrayList<Integer>();
			int k=0;
			for(int i:nums1) {
				map.put(i, map.getOrDefault(i, 0)+1);
			}
			for(int j:nums2) {
				if(map.containsKey(j)&&map.get(j)>0) {
					op.add(j);
					map.put(j, map.get(j)-1);
				}
			}
			int[] result = new int[op.size()];
			for(int i:op)
				result[k++]=i;
			return result;
		}
		
		

}
