package problems.easy;

import org.junit.Test;


/*
S.No.    : 2
Problem  : Reverse String Compare
https://leetcode.com/problems/reverse-string/
Author 	 : BK
Version	 : 1.0
Time Complexity:O[N/2]
Space Complexity:O[1]
Leetcode Submission:*/
public class Q2_ReverseStringCompare {
	
	
	@Test
	public void testcase_1() {
		String a = "apple";
		String b = "elppa";
		System.out.println(validAnagramSolution2(a,b));
	}
	
	@Test
	public void testcase_2() {
		String a = "mom";
		String b = "mom";
		System.out.println(validAnagramSolution2(a,b));
	}
	
	@Test
	public void testcase_3() {
		String a = "apple";
		String b = "apple";
		System.out.println(validAnagramSolution2(a,b));
	}
	
	@Test
	public void testcase_4() {
		String a = "a";
		String b = "a";
		System.out.println(validAnagramSolution2(a,b));
	}
	
	@Test
	public void testcase_5() {
		String a = "apple";
		String b = "mango";
		System.out.println(validAnagramSolution2(a,b));
	}
	
	@Test
	public void testcase_6() {
		String a = "ap";
		String b = "mango";
		System.out.println(validAnagramSolution2(a,b));
	}

	
	/* Solution 1: Two pointer */
	private boolean validAnagramSolution1(String a, String b) {
		if(a.length()!=b.length()) return false;
		if(a==b&&(a.length()==1)) return true;
		if(a==b&&(a.length()==0)) return false;
		char[] output = new char[a.length()];
		output = a.toCharArray();
		int left=0,right=a.length()-1;
		char temp;
		while(left<right){
		temp = output[left];
		 output[left]=  output[right];
		 output[right]= temp;
				 left++;
		 		right--;}
		if(String.valueOf(output).equals(b)) return true;
		else return false;
	}
	
	/* Solution 1: StringBuffer */
	private boolean validAnagramSolution2(String a, String b) {
		if(a.length()!=b.length()) return false;
		if(a==b&&(a.length()==1)) return true;
		if(a==b&&(a.length()==0)) return false;
		if(new StringBuffer(a).reverse().toString().equals(b)) return true;
		else return false;
	}

}
