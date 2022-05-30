package sdet.prep;

import java.util.Arrays;

import org.junit.Test;

public class Q189_RotateArray {

	/*
	 * S.No. : 189 Problem : Rotate Array :
	 * https://leetcode.com/problems/rotate-array/
	 * Author : BK 
	 * Version : 1.0
	 * Time Complexity:O[N] Space Complexity:O[1]
	 */
	
	
	@Test  // Expected OP - 6,7,1,2,3,4,5
	public void testdata1() {
		int[] iparray = {1,2,3,4,5,6,};
		int count = 2;
		System.out.println(Arrays.toString(RotateArraySolution2(iparray,count)));
	}
	
	@Test
	public void testdata2() {
		int[] iparray = {-1,2,-4,5,7,4};
		int count = 2;
		System.out.println(Arrays.toString(RotateArraySolution2(iparray,count)));
	}
	
	@Test
	public void testdata3() {
		int[] iparray = {1,2,3,4,5,6,7};
		int count = 0;
		System.out.println(Arrays.toString(RotateArraySolution2(iparray,count)));
	}
	
	@Test
	public void testdata4() {
		int[] iparray = {1,2,1};
		int count = 3;
		System.out.println(Arrays.toString(RotateArraySolution2(iparray,count)));
	}
	
	@Test
	public void testdata5() {
		int[] iparray = {1};
		int count = 3;
		System.out.println(Arrays.toString(RotateArraySolution2(iparray,count)));
	}
	
	@Test
	public void testdata6() {
		int[] iparray = {1,2,3,4,5,6,7};
		int count = 11;
		System.out.println(Arrays.toString(RotateArraySolution2(iparray,count)));
	}

	
	//Brute force with new array
	private int[] RotateArraySolution1(int[] iparray, int count) {
		int len = iparray.length;
		count=count%len;
		if(count==0||len==1) return iparray;
		int oparray[] = new int[len];
		int start=len-count,i=0;
		while(len>0) {
			start=start%len;
			oparray[i++] = iparray[start];
			len--;
			start++;
		}	
		return oparray;
	}
	
	//Brute force without new array 5 6 1 2 3 4
		private int[] RotateArraySolution2(int[] iparray, int count) {
			int len = iparray.length;
			count=count%len;
			if(count==0||len==1) return iparray;
			int i=0,a,b=iparray[0],c;
			while(len>=0) {
			c=i+count;
			c=i%(iparray.length);
			a = iparray[c];
			iparray[c] = b;
			b=a;
			i+=count;
			len--;			
			}
			return iparray;
		}
	
}
