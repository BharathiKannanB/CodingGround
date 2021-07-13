package problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

/*
 * S.No. : 17
 * Problem : Majority Element
 * Link : https://leetcode.com/problems/majority-element/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */
public class Q17_MajorityElement {

	//@Test
	public void testcase1() {
		int[] nums = {3,2,3};
		System.out.println(majorityElementSolution3(nums));
	}
	
	//@Test
	public void testcase2() {
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElementSolution3(nums));
	}
	
	//@Test
		public void testcase3() {
			int[] nums = {1};
			System.out.println(majorityElementSolution1(nums));
		}
	
	//@Test
	public void testcase4() {
		int[] nums = {1,2,3};
		System.out.println(majorityElementSolution1(nums));
	}
	
	//@Test
		public void testcase5() {
			int[] nums = {1,1,2,2};
			System.out.println(majorityElementSolution1(nums));
		}
		
		@Test
		public void testcase6() {
			int[] nums = {2,2,2,1,1};
			System.out.println(majorityElementSolution3(nums));
		}
	
	
		/* Solution 1 - Inbuilt functions */
	private int majorityElementSolution1(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	
	/* Solution 2 - Hash Map */
	private int majorityElementSolution2(int[] nums) {
		int max=0,mkey=0;
		Map<Integer,Integer> op = new HashMap<Integer,Integer>();
		for(int i: nums) {
				op.put(i, op.getOrDefault(i, 0)+1);	
		} 
		for(Entry<Integer,Integer> entry : op.entrySet()) {
			if(entry.getValue()>max) {max=entry.getValue();mkey=entry.getKey();}
		}
		System.out.println(op);
		return mkey;
	}
	
	/* Solution 3 - Boyer-Moore Voting Algorithm */
	private int majorityElementSolution3(int[] nums) {
		 int count = 0;
	        Integer candidate = null;

	        for (int num : nums) {
	            if (count == 0) {
	                candidate = num;
	            }
	            count += (num == candidate) ? 1 : -1;
	        }

	        return candidate;
	}
}
