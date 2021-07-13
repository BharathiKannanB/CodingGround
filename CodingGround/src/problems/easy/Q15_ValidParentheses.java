package problems.easy;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

/*
 * S.No. : 15
 * Problem : Valid Parentheses
 * Link : https://leetcode.com/problems/valid-parentheses/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q15_ValidParentheses {
	
	@Test
	public void testcase1() {
	String s = "()";
	System.out.println(validParenthesesSolution2(s));
	}
	
	@Test
	public void testcase2() {
	String s = "()[]{}";
	System.out.println(validParenthesesSolution2(s));
	}
	
	@Test
	public void testcase3() {
	String s = "(}";
	System.out.println(validParenthesesSolution2(s));
	}
	
	@Test
	public void testcase4() {
	String s = "([)]";
	System.out.println(validParenthesesSolution2(s));
	}
	
	@Test
	public void testcase5() {
	String s = "{[]}";
	System.out.println(validParenthesesSolution2(s));
	}
	
	@Test
	public void testcase6() {
	String s = "{[]";
	System.out.println(validParenthesesSolution2(s));
	}

	/* Solution 1 - Brute Force - solution issue */
	private boolean validParenthesesSolution(String s) {
		if(s.length()%2!=0) return false;
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		int i=0;
		while(i < ch.length) {
			switch(ch[i]) {
			case '(':
				if(ch[i+1]!=')') return false;
				else i+= 2; break;
			case '{':
				if(ch[i+1]!='}') return false;
				else i+= 2; break;
			case '[':
				if(ch[i+1]!=']') return false;
				else i+= 2; break;
			}
		}
		return true;
	}
	
	/* Solution 2 - Stack */
	private boolean validParenthesesSolution2(String s) {
		if(s.length()%2!=0) return false;
		Stack<Character> op = new Stack<Character>();

		for(char i:s.toCharArray()) {
			if(i=='{') op.push('}');
			else if(i=='(') op.push(')');
			else if(i=='[') op.push(']');
			else if(op.isEmpty() || op.pop()!=i) return false ;
		}
			
		return op.isEmpty();
	}
}
