package problems.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

/*
 * S.No. : 19
 * Problem : Excel Sheet Column Number
 * Link : https://leetcode.com/problems/excel-sheet-column-number/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q19_ExcelColumnNumber {
	
	@Test
	public void testcase1() {
	String columnTitle ="C";
	System.out.println(excelColumnNumberSolution(columnTitle));
	}
	
	@Test
	public void testcase2() {
	String columnTitle ="AB";
	System.out.println(excelColumnNumberSolution(columnTitle));
	}
	
	@Test
	public void testcase3() {
	String columnTitle ="ZY";
	System.out.println(excelColumnNumberSolution(columnTitle));
	}
	
	@Test
	public void testcase4() {
	String columnTitle ="FXSHRXW";
	System.out.println(excelColumnNumberSolution(columnTitle));
	}
	
	//@Test
	public void testcase5() {
	String columnTitle ="aa";
	System.out.println(excelColumnNumberSolution(columnTitle));
	}

	/* Solution 1 - Brute Force */
	private int excelColumnNumberSolution(String columnTitle) {
		Map<Character, Integer> ip = new HashMap<Character, Integer>();
		for(int i=1;i<27;i++) {
			ip.put((char) (64+i), i);
		}
		int len = columnTitle.length();
		if(len==1) return ip.get(columnTitle.charAt(0));
		int sum = ip.get(columnTitle.charAt(len-1));
		int power = 1;
		for (int i = len-2; i >= 0; i--) {
			sum += Math.pow(26, power)*ip.get(columnTitle.charAt(i));
			power++;
		}
		return sum;
	}
}
