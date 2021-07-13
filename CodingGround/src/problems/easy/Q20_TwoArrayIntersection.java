package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/*
 * S.No. : 20
 * Problem : Intersection of Two Arrays II
 * Link : https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q20_TwoArrayIntersection {

	//@Test
	public void testcase1() {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		System.out.println(Arrays.toString(twoArrayIntersectionSolution1(nums1,nums2)));
	}
	
	//@Test
	public void testcase2() {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		System.out.println(Arrays.toString(twoArrayIntersectionSolution1(nums1,nums2)));
	}
	
	//@Test
	public void testcase3() {
		int[] nums1 = {1,2,3};
		int[] nums2 = {4,5,6};
		System.out.println(Arrays.toString(twoArrayIntersectionSolution1(nums1,nums2)));
	}
	
	//@Test
	public void testcase4() {
		int[] nums1 = {1,2,3};
		int[] nums2 = {1,2,3};
		System.out.println(Arrays.toString(twoArrayIntersectionSolution1(nums1,nums2)));
	}
	
	@Test
	public void testcase5() {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2};
		System.out.println(Arrays.toString(twoArrayIntersectionSolution1(nums1,nums2)));
	}
	
	/* Solution 1 - Brute Force */
	private int[] twoArrayIntersectionSolution1(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(map.get(i) != null && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
		return list.stream().mapToInt(i->i).toArray();
	}
}
