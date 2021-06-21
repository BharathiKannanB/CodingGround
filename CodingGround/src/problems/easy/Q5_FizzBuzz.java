package problems.easy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*S.No.  : 5
Problem  : Fizz Buzz
Link     : https://leetcode.com/problems/fizz-buzz/
Author 	 : BK
Version	 : 1.0
Time Complexity:O[N]
Space Complexity:O[1]*/

public class Q5_FizzBuzz {
	
	@Test
	public void testcase1() {
		int n= 5;
		System.out.println(FizzBuzzSolution1(n));
	}
	
	@Test
	public void testcase2() {
		int n= 0;
		System.out.println(FizzBuzzSolution1(n));
	}
	
	@Test
	public void testcase3() {
		int n= -5;
		System.out.println(FizzBuzzSolution1(n));
	}
	
	@Test
	public void testcase4() {
		int n= 25;
		System.out.println(FizzBuzzSolution1(n));
	}
	

	/* Solution 1 - Brute Force */
	private List<String> FizzBuzzSolution1(int n) {
		List<String> output = new ArrayList<String>();
		if(n<1) return output;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0&&i%5==0) output.add("FizzBuzz");
			else if(i%3==0) output.add("Fizz");
			else if(i%5==0) output.add("Buzz");
			else output.add(Integer.toString(i));
		}
		return output;
	}
	
	

}
