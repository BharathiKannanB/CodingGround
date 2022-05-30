package problems.easy;

import org.junit.Test;

/*
 * S.No. : 29
 * Problem : Excel Sheet Column Title
 * Link : https://leetcode.com/problems/excel-sheet-column-title/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q29_ExcelColumnTitle {

	@Test
	public void testData1() {
		int td = 1;
		System.out.println(getExcelColumnTitle2(td));  //Expected op: A
	}
	
	@Test
	public void testData2() {
		int td = 28;
		System.out.println(getExcelColumnTitle2(td));  //Expected op: AB
	}
	
	@Test
	public void testData3() {
		int td = 701;
		System.out.println(getExcelColumnTitle2(td));  //Expected op: ZY
	}

	@Test
	public void testData4() {
		int td = 471744;
		System.out.println(getExcelColumnTitle2(td));  //Expected op: zuuz
	}
	
	@Test
	public void testData5() {
		int td = -10;
		System.out.println(getExcelColumnTitle2(td));  //Expected op: null
	}
	
	/* Solution 1 - BF */  // Works only till 2 digits
	private String getExcelColumnTitle(int td) {
		int temp=0;
		if(td<=0) return null;
		String op = "";
		while(td>0) {
		if(td<=26) {
			if(temp!=0) op+=(char)(64+temp);
			op+=(char)(64+td);
			break;
		}
		else {temp++; td-=26; }	}
		return op;
	}
	
	/* Solution 2 - Efficient way */  
	private String getExcelColumnTitle2(int td) {
		StringBuilder op =new StringBuilder();
		if(td<=0) return null;
		while(td>0) {
			td--;
			op.insert(0, (char)('A'+td%26));
			td/=26;
		}		
		return op.toString();
	}
	
	
	
}
