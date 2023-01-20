package sdetbatch3.stackqueue;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesis_LC20 {

	/* Problem: Valid Parenthesis - https://leetcode.com/problems/valid-parentheses/
	 * Time Complexity - O[n]
	 * Space Complexity - O[n]
	 */
	
	@Test
	public void testData1() {
	String s = "()";	
	boolean output = true;
	Assert.assertEquals(output,solveValidParenthesis(s));
	}
	
	@Test
	public void testData2() {
	String s = "()[]{}";	
	boolean output = true;
	Assert.assertEquals(output,solveValidParenthesis(s));
	}
	
	@Test
	public void testData3() {
	String s = "(]";	
	boolean output = false;
	Assert.assertEquals(output,solveValidParenthesis(s));
	}
	
	@Test
	public void testData4() {
	String s = "{";	
	boolean output = false;
	Assert.assertEquals(output,solveValidParenthesis(s));
	}
	
	@Test
	public void testData5() {
	String s = "{([])}{([])}";	
	boolean output = true;
	Assert.assertEquals(output,solveValidParenthesis(s));
	}
	
	@Test
	public void testData6() {
	String s = "{{{{}}}}}";	
	boolean output = false;
	Assert.assertEquals(output,solveValidParenthesis(s));
	}

	/* Solution 1 - Using Stack */
	private boolean solveValidParenthesis(String s) {
		if(s.length()<2) return false;
		Stack<Character> stack = new Stack<Character>();
		for(char c: s.toCharArray()) {
			if(c=='{'||c=='('||c=='[')
				stack.push(c);
			else if(!stack.isEmpty()&&((c=='}'&&stack.peek()=='{')||(c==')'&&stack.peek()=='(')||(c==']'&&stack.peek()=='[')))
				stack.pop();
			else stack.push(c);
		}
		return stack.isEmpty();
	}
	
	
}
