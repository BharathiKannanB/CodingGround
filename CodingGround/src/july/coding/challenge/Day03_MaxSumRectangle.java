package july.coding.challenge;

import java.util.TreeSet;

import org.junit.Test;

/*
 * S.No. : Day 03
 * Problem : Max Sum of Rectangle No Larger Than K
 * Link : https://leetcode.com/explore/featured/card/july-leetcoding-challenge-2021/608/week-1-july-1st-july-7th/3801/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:
 * Space Complexity:
 */
public class Day03_MaxSumRectangle {

	@Test
	public void testcase1() {
		int[][] matrix = {{1,0,1},{0,-2,3}};
		int k = 2;
		System.out.println(maxSumRectangleSolution(matrix, k));
	}
	
	@Test
	public void testcase2() {
		int[][] matrix = {{2,2,-1}};
		int k = 3;
		System.out.println(maxSumRectangleSolution(matrix, k));
	}

	private int maxSumRectangleSolution(int[][] matrix, int k) {
		int row = matrix.length;
	    int col = matrix[0].length;
	    int max = Integer.MIN_VALUE;
	    for (int i = 0; i < row; i ++) {
	      int[] colSum = new int[col];
	      for (int j = i; j < row; j ++) {
	        for (int c = 0; c < col; c ++) {
	          colSum[c] += matrix[j][c];
	          //System.out.print(colSum[c] + " ");
	        }
	        //System.out.println();
	        max = Math.max(max, find(colSum, k));
	      }
	    }
	    return max;
	}
	
	private int find(int[] sum, int k) {
	    int result = Integer.MIN_VALUE;
	    TreeSet<Integer> set = new TreeSet<>();
	    set.add(0);
	    int prefixSum = 0;
	    for(int i = 0; i < sum.length; i++) {
	      prefixSum += sum[i];

	      Integer target = set.ceiling(prefixSum - k);

	      if(target != null) {
	        result = Math.max(result, prefixSum - target);
	      }
	      set.add(prefixSum);
	    }

	    return result;
	  }

	

}
