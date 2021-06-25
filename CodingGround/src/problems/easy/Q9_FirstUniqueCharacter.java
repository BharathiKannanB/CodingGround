package problems.easy;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/*
 * S.No. : 9 
 * Problem : First Unique Character in a String	 
 * Link : https://leetcode.com/problems/first-unique-character-in-a-string/
 * Author : BK 
 * Version : 2.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q9_FirstUniqueCharacter {
	@Test
	public void testcase1() {
		String s ="leetcode";
		System.out.println(firstUniqueCharcterSolution2(s));
	}

	@Test
	public void testcase2() {
		String s ="loveleetcode";
		System.out.println(firstUniqueCharcterSolution2(s));
	}
	
	@Test
	public void testcase3() {
		String s ="llee";
		System.out.println(firstUniqueCharcterSolution2(s));
	}
	
	@Test
	public void testcase4() {
		String s ="abcd";
		System.out.println(firstUniqueCharcterSolution2(s));
	}
	
	@Test
	public void testcase5() {
		String s ="a";
		System.out.println(firstUniqueCharcterSolution2(s));
	}
	
	@Test
	public void testcase6() {
		String s ="llle";
		System.out.println(firstUniqueCharcterSolution2(s));
	}
	
	/* Solution2 - Brute Force */
	private int firstUniqueCharcterSolution1(String s) {
		if(s.length()==1) return 0;
		List<Character> temp = new ArrayList<Character>();
		char[] c = s.toCharArray();
		int output=0;
		for (int i = 0; i < c.length-1; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(temp.contains(c[i])) {output=1;break;}
				if(c[i]==c[j]) {output=1;temp.add(c[i]); break;}				
			}
			if(output==0) return i;
			output=0;
		}
		if(!temp.contains(c[c.length-1])) return c.length-1;
		else return -1;
	}
	
	/* Solution2 - HashMap */
	private int firstUniqueCharcterSolution2(String s) {
		Map<Character, Integer> op = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			op.put(s.charAt(i), op.getOrDefault(s.charAt(i), 0)+1);
		}
		for (int i = 0; i < s.length(); i++) {
			if(op.get(s.charAt(i))==1) return i;
		}
		return -1;
	}
	
	
	
	
	
}
