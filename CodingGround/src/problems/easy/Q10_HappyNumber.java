package problems.easy;

import org.junit.Test;

/*
 * S.No. : 10 
 * Problem : Happy Number 
 * Link : https://leetcode.com/problems/happy-number/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N2] 
 * Space Complexity:O[1]
 */

public class Q10_HappyNumber {

	//@Test
	public void testcase1() {
		int n = 19;
		System.out.println(HappyNumberSoluion1(n));
	}
	
	//@Test
	public void testcase2() {
		int n = 11;
		System.out.println(HappyNumberSoluion1(n));
	}
	
	//@Test
	public void testcase3() {
		int n = 1;
		System.out.println(HappyNumberSoluion1(n));
	}
	
	//@Test
	public void testcase4() {
		int n = 7;
		System.out.println(HappyNumberSoluion1(n));
	}
	
	//@Test
	public void testcase5() {
		int n = 145;
		System.out.println(HappyNumberSoluion1(n));
	}
	
	@Test
	public void testcase6() {
		int n = 1111111;
		System.out.println(HappyNumberSoluion1(n));
	}

	/* Solution1 - Brute Force */
	private boolean HappyNumberSoluion1(int n) {
			if(n==1||n==7) return true;
			int op,sum=0,q=0;
			if(n<10) op=n*n;
	        else op=n;
			while(op>=10) {
				while(op>0) {
					sum+=(op%10)*(op%10);
					if(op<10) break;
					op = op/10;
				}
				if(sum==1||sum==7) return true;
				op=sum;
				sum=0;
			}
			return false;
	}
}
