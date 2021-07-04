package july.coding.challenge;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * S.No. : Day 02
 * Problem : Find K Closest Elements
 * Link : https://leetcode.com/explore/challenge/card/july-leetcoding-challenge-2021/608/week-1-july-1st-july-7th/3799/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:
 * Space Complexity:
 */

public class Day02_KClosestElement {
	
	@Test
	public void testcase1() {
		int[] arr = {1,2,3,4,5};
		int k = 4;
		int x=3;
		System.out.println(kClosestElementSolution(arr,k,x));
	}

	@Test
	public void testcase2() {
		int[] arr = {1,2,3,4,5};
		int k = 4;
		int x=-1;
		System.out.println(kClosestElementSolution(arr,k,x));
	}
	
	/* Solution 1 - Two Pointer */
	private List<Integer> kClosestElementSolution(int[] A, int k, int x) {
		 int left = 0, right = A.length - k;
	        while (left < right) {
	            int mid = (left + right) / 2;
	            if (x - A[mid] > A[mid + k] - x)
	                left = mid + 1;
	            else
	                right = mid;
	        }
	        List<Integer> res = new ArrayList<>();
	        for (int i = 0; i < k; i++) res.add(A[left + i]);
	        return res;
	}

}
