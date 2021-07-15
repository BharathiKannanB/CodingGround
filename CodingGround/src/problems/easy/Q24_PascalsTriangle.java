package problems.easy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * S.No. : 24
 * Problem : Pascal's Triangle
 * Link : https://leetcode.com/problems/pascals-triangle/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N^2] 
 * Space Complexity:O[1]
 */
public class Q24_PascalsTriangle {
	@Test
	public void testcase1() {
	int numRows = 3;
	System.out.println(pascalsTriangleSolution(numRows));   // Expected Op : [1],[1,1],[1,2,1]
	}

	@Test
	public void testcase2() {
	int numRows = 1;
	System.out.println(pascalsTriangleSolution(numRows));   // Expected Op : [1]
	}
	
	@Test
	public void testcase3() {
	int numRows = 5;
	System.out.println(pascalsTriangleSolution(numRows));   // Expected Op : [1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]
	}
	
	@Test
	public void testcase4() {
	int numRows = 10;
	System.out.println(pascalsTriangleSolution(numRows));   // Expected Op : [1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]
	}
	
	/* Solution 1 - DP */
	private List<List<Integer>> pascalsTriangleSolution(int numRows) {
		List<Integer> inList = new ArrayList<Integer>();
		List<List<Integer>> outList = new ArrayList<List<Integer>>();
		inList.add(1);
		outList.add(new ArrayList<Integer>(inList));	
		if(numRows==1) return outList;
		inList.clear();
		for (int i = 2 ;i <=numRows; i++) {
			for (int j = 0; j < i; j++) {
				if(j==0||j==i-1) inList.add(1);
				else inList.add(outList.get(i-2).get(j-1)+outList.get(i-2).get(j));
			}
			outList.add(new ArrayList<Integer>(inList));
			inList.clear();
		}
		return outList;
	}
}
