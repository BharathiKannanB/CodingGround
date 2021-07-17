package problems.easy;

import org.junit.Test;

/*
 * S.No. : 23
 * Problem : Best Time to Buy and Sell Stock II
 * Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q23_BuySellStock2 {

	@Test
	public void testcase1() {
	int[] prices = {7,1,5,3,6,4};
	System.out.println(buySellStock2Solution(prices));      // Expected Output: 7
	}
	
	@Test
	public void testcase2() {
	int[] prices = {1,2,3,4,5};
	System.out.println(buySellStock2Solution(prices));      // Expected Output: 4
	}
	
	@Test
	public void testcase3() {
	int[] prices = {7,6,4,3,1};
	System.out.println(buySellStock2Solution(prices));      // Expected Output: 0
	}
	
	@Test
	public void testcase4() {
	int[] prices = {7};
	System.out.println(buySellStock2Solution(prices));      // Expected Output: 0
	}
	
	@Test
	public void testcase5() {
	int[] prices = {1,5};
	System.out.println(buySellStock2Solution(prices));      // Expected Output: 4
	}

	/* Solution 1 - One Pass */
	private int buySellStock2Solution(int[] prices) {
		int maxprofit =0;
		if(prices.length<=1) return 0;
		for (int i = 1; i < prices.length; i++) {
			if(prices[i]>prices[i-1])
				maxprofit += prices[i] - prices[i-1];
		}
		return maxprofit;
	}
}
