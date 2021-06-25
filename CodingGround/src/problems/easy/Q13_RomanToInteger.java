package problems.easy;
import org.junit.Test;

/*
 * S.No. : 13
 * Problem : Roman to Integer
 * Link : https://leetcode.com/problems/roman-to-integer/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q13_RomanToInteger {
	@Test
	public void testcase1() {
		String s ="III";
		System.out.println(romanToIntegerSolution2(s));
	}

	@Test
	public void testcase2() {
		String s ="IV";
		System.out.println(romanToIntegerSolution2(s));
	}
	
	@Test
	public void testcase3() {
		String s ="IX";
		System.out.println(romanToIntegerSolution2(s));
	}
	
	@Test
	public void testcase4() {
		String s ="LVIII";
		System.out.println(romanToIntegerSolution2(s));
	}
	
	@Test
	public void testcase5() {
		String s ="MCMXCIV";
		System.out.println(romanToIntegerSolution2(s));
	}
	
	/* Solution 1 - Brute Force - Solution not working*/
	private int romanToIntegerSolution1(String s) {
		int sum=0;
		for (int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i)=='I') {
				if((s.charAt(i+1)=='V'||s.charAt(i+1)=='X')&&i<s.length()-1) sum -= 1;
				else sum +=1;}
			if(s.charAt(i)=='V')
				sum += 5;
			if(s.charAt(i)=='X') {
				if(s.charAt(i+1)=='L'||s.charAt(i+1)=='C'&&i<s.length()-1) sum -= 10;
				else sum +=10;}
			if(s.charAt(i)=='L')
				sum += 50;
			if(s.charAt(i)=='C') {
				if(s.charAt(i+1)=='D'||s.charAt(i+1)=='M'&&i<s.length()-1) sum -= 100;
				else sum +=100;}
			if(s.charAt(i)=='D')
				sum += 500;
			if(s.charAt(i)=='M')
				sum += 1000;			
		}		
		return sum;
	}
	
	/* Solution 2 - Brute Force - Solution working*/
	private int romanToIntegerSolution2(String s) {
		int nums[]=new int[s.length()];
	    for(int i=0;i<s.length();i++){
	        switch (s.charAt(i)){
	            case 'M':
	                nums[i]=1000;
	                break;
	            case 'D':
	                nums[i]=500;
	                break;
	            case 'C':
	                nums[i]=100;
	                break;
	            case 'L':
	                nums[i]=50;
	                break;
	            case 'X' :
	                nums[i]=10;
	                break;
	            case 'V':
	                nums[i]=5;
	                break;
	            case 'I':
	                nums[i]=1;
	                break;
	        }
	    }
	    int sum=0;
	    for(int i=0;i<nums.length-1;i++){
	        if(nums[i]<nums[i+1])
	            sum-=nums[i];
	        else
	            sum+=nums[i];
	    }
	    return sum+nums[nums.length-1];
	}
	
}
