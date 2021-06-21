package problems.easy;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Q6_SingleNumber {

	/*S.No.  : 6
	Problem  : Single Number
	Link     : https://leetcode.com/problems/single-number/
	Author 	 : BK
	Version	 : 1.0
	Time Complexity:O[N]
	Space Complexity:O[1]*/
	@Test
	public void testcase1() {
		int[] input = {1,2,2};
		System.out.println(singleNumberSolution2(input));
	}
	@Test
	public void testcase2() {	
		int[] input = {1,2,1,2,4};
		System.out.println(singleNumberSolution2(input));
	}
	@Test
	public void testcase3() {	
		int[] input = {1,2,1,2};
		System.out.println(singleNumberSolution2(input));
	}
	@Test
	public void testcase4() {	
		int[] input = {1};
		System.out.println(singleNumberSolution2(input));
	}

	/* Solution 1 - HashMap */
	private int singleNumberSolution1(int[] input) {	
		Map<Integer, Integer> output = new HashMap<Integer, Integer>();
		for(int i: input)
		{
			output.put(i, output.getOrDefault(i, 0)+1);
//			if(output.containsKey(i))
//				output.put(i, output.get(i)+1);
//			else
//				output.put(i, 1);
		}
		for(Map.Entry<Integer, Integer> temp: output.entrySet())
		{
			if(temp.getValue()==1)
				return temp.getKey();		
		}
		return 0;
	}
	
	/* Solution 2 - XOR operator */
	private int singleNumberSolution2(int[] num) {	
		int output = 0;
		for (int i = 0; i < num.length; i++) {
			output ^= num[i];
		}
		return output;
	}
}
