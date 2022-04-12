package sdet.prep;

import org.junit.Test;

public class FibonacciSeriesRecursion {
	
	int a=0, b=1,c,temp=0;
	@Test	
	public void testcase1() {
		int ip = 5;
		FibnocacciSeriesSolution1(ip);
		System.out.println();
	}
	
	@Test	
	public void testcase2() {
		int ip = 15;
		FibnocacciSeriesSolution1(ip);
		System.out.println();
	}
	
	@Test	
	public void testcase3() {
		int ip = 2;
		FibnocacciSeriesSolution1(ip);
		System.out.println();
	}

	private void FibnocacciSeriesSolution1(int ip) {
		if(temp==0) {
			System.out.print(a+" "+b);temp++;ip-=2;
		}
		if(ip>0) {
			c=a+b;
			System.out.print(" "+c);		
			a=b;
			b=c;
			FibnocacciSeriesSolution1(ip-1);
		}
		temp=0;
	}

}
