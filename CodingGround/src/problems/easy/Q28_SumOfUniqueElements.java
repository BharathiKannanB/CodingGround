package problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/*
 * S.No. : 27
 * Problem : Rotate String
 * Link : https://leetcode.com/problems/rotate-string/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q28_SumOfUniqueElements {

	@Test
	public void testcase1() {
		int[] nums = {1,2,3,2};
		System.out.println(sumOfUniqueElementSolution1(nums));  //Expected op: 4
	}
	
	@Test
	public void testcase2() {
		int[] nums = {1,1,1,1,1};
		System.out.println(sumOfUniqueElementSolution1(nums));  //Expected op: 0
	}
	
	@Test
	public void testcase3() {
		int[] nums = {1,2,3,4,5};
		System.out.println(sumOfUniqueElementSolution1(nums));  //Expected op: 15
	}
	
	@Test
	public void testcase4() {
		int[] nums = {1};
		System.out.println(sumOfUniqueElementSolution1(nums));  //Expected op: 1
	}

	/* Solution 1 - BF */
	private int sumOfUniqueElementSolution1(int[] nums) {
		 int res = 0;
	        Map<Integer,Integer> map = new HashMap<>();
	        for(int i = 0;i<nums.length;i++){
	            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
	            if(map.get(nums[i]) == 1)res+=nums[i];
	            else if(map.get(nums[i]) == 2)res-=nums[i];
	        }
	        return res;
		
	}
	
}
