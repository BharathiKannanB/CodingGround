package problems.easy;

import org.junit.Test;

/*
 * S.No. : 11 
 * Problem : Best Time to Buy and Sell Stock 
 * Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */
public class Q11_BuySellStock {
	
	@Test
	public void testcase1() {
	int[] prices = {7,1,5,3,6,4};
	System.out.println(buySellStockSolution2(prices));
	}
	
	@Test
	public void testcase2() {
	int[] prices = {7,6,4,3,1};
	System.out.println(buySellStockSolution2(prices));
	}
	
	@Test
	public void testcase3() {
	int[] prices = {1,2,3,4,5};
	System.out.println(buySellStockSolution2(prices));
	}
	
	@Test
	public void testcase4() {
	int[] prices = {56,58};
	System.out.println(buySellStockSolution2(prices));
	}
	
	@Test
	public void testcase5() {
	int[] prices = {5,5,5,5,5};
	System.out.println(buySellStockSolution2(prices));
	}

	/* Solution 1 - Brute Force */
	private int buySellStockSolution1(int[] prices) {
		int temp=0,output=0;
		for (int i = 0; i < prices.length-1; i++) {
			for (int j = i+1; j < prices.length; j++) {
				temp = prices[j] - prices[i];
				if(temp<0) temp=0;
				if(output<=temp) output=temp;
			}
		}
		return output;
	}
	
	/* Solution 2 - One Pass */
	private int buySellStockSolution2(int[] prices) {
		int minval=Integer.MAX_VALUE,maxprofit=0;
		for (int i = 0; i < prices.length; i++) {
			if(prices[i]<minval) minval = prices[i];
			else if(prices[i]-minval>maxprofit) maxprofit =prices[i]-minval; 
		}
		return maxprofit;
	}
}
