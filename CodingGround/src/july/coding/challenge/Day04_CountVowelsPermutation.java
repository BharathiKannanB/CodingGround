package july.coding.challenge;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/*
 * S.No. : Day 04
 * Problem : Count Vowels Permutation
 * Link : https://leetcode.com/explore/featured/card/july-leetcoding-challenge-2021/608/week-1-july-1st-july-7th/3802/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:
 * Space Complexity:
 */
public class Day04_CountVowelsPermutation {

	@Test
	public void testcase1() {
		int n = 1;
		System.out.println(countVowelsPermutationSolution(n));
	}
	
	@Test
	public void testcase2() {
		int n = 2;
		System.out.println(countVowelsPermutationSolution(n));
	}
	
	@Test
	public void testcase3() {
		int n = 5;
		System.out.println(countVowelsPermutationSolution(n));
	}

	private Map<String,Long> map = new HashMap<>();;
    private int MOD = 1000000007;
    
	private int countVowelsPermutationSolution(int n) {
		 long total = 0;
		    char[] charSet = new char[]{'a','e','i','o','u'};
		    for(char c : charSet) {
		      total = (total + helper(n-1,c)) % MOD;
		    }
		    return (int)total; 
	}
	
	 public long helper(int remaingChar, char prevChar) {
		    if(remaingChar == 0) return 1;
		    String key = "" + remaingChar + prevChar;
		    if(map.containsKey(key)) return map.get(key);
		    long total = 0;
		    switch(prevChar) {
		      case 'a': total = (helper(remaingChar - 1,'e')) % MOD;
		        break;
		      case 'e': total = (helper(remaingChar - 1,'a') + helper(remaingChar - 1, 'i')) % MOD;
		        break;
		      case 'i': total = (helper(remaingChar - 1,'a') + helper(remaingChar - 1, 'e') + helper(remaingChar - 1, 'o') + helper(remaingChar - 1, 'u')) % MOD;
		        break;
		      case 'o': total = (helper(remaingChar - 1,'i') + helper(remaingChar - 1,'u')) % MOD;
		        break;
		      case 'u': total = (helper(remaingChar - 1,'a')) % MOD;
		        break;
		    }
		    map.put(key , total);
		    return total;
}
}
