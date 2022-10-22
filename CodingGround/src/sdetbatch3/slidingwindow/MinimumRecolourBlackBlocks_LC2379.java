package sdetbatch3.slidingwindow;

import org.junit.Test;

public class MinimumRecolourBlackBlocks_LC2379 {


	/* Maximum Subarray (Solved using Kadane Algo)  - https://leetcode.com/problems/maximum-subarray/
	 * Time complexity - O[N]
	 * Space complexity - O[1]
	 */
	
	@Test
	public void testData1() {       // Exp. Op : 3
		String blocks = "WBBWWBBWBW";
		int k=7;
		System.out.println(solveMinimumRecolour(blocks,k));
	}
	
	@Test
	public void testData2() {       // Exp. Op : 0
		String blocks = "WBBWWBBWBW";
		int k=2;
		System.out.println(solveMinimumRecolour(blocks,k));
	}
	
	@Test
	public void testData3() {       // Exp. Op : 2
		String blocks = "WWWWWWW";
		int k=2;
		System.out.println(solveMinimumRecolour(blocks,k));
	}
	
	@Test
	public void testData4() {       // Exp. Op : 0
		String blocks = "BBBBBB";
		int k=2;
		System.out.println(solveMinimumRecolour(blocks,k));
	}
	
	@Test
	public void testData5() {       // Exp. Op : 0
		String blocks = "WBBWWBBWBW";
		int k=1;
		System.out.println(solveMinimumRecolour(blocks,k));
	}
	
	private int solveMinimumRecolour(String blocks, int k) {
		int win_blk=0,min_blk=0;
		for(int i=0;i<k;i++) {
			if(blocks.charAt(i)=='W')
				win_blk++;
		}
		min_blk=win_blk;
		for(int i=k;i<blocks.length();i++) {
			if(blocks.charAt(i)=='W')
				win_blk++;
			if(blocks.charAt(i-k)=='W')
				win_blk--;
			if(min_blk>win_blk)min_blk=win_blk;
		}
		return min_blk;
	}
	
}
