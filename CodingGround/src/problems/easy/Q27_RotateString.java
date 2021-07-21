package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/*
 * S.No. : 27
 * Problem : Rotate String
 * Link : https://leetcode.com/problems/rotate-string/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:O[N] 
 * Space Complexity:O[1]
 */

public class Q27_RotateString {
	
@Test	
public void testcase1() {
	String s = "abcde";
	String goal ="cdeab";
	System.out.println(rotateStringSolution3(s,goal));   // Expected O/P - true
}

@Test	
public void testcas2() {
	String s = "abcde";
	String goal ="abced";
	System.out.println(rotateStringSolution3(s,goal));   // Expected O/P - false
}

@Test	
public void testcase3() {
	String s = "abcde";
	String goal ="abcde";
	System.out.println(rotateStringSolution3(s,goal));   // Expected O/P - true
}

@Test	
public void testcase4() {
	String s = "abcde";
	String goal ="abcd";
	System.out.println(rotateStringSolution3(s,goal));   // Expected O/P - false
}

@Test	
public void testcase5() {
	String s = "abcde";
	String goal ="cdeaB";
	System.out.println(rotateStringSolution3(s,goal));   // Expected O/P - false
}


/* Solution1  - BF*/
private boolean rotateStringSolution(String s, String goal) {
	if(s.length()!=goal.length()) return false;
	if(s.equals(goal)) return true;
	char temp;int ind=0;
	List<Character> ip = new ArrayList<Character>();
	for (char c : s.toCharArray()) {
		ip.add(c);
	}
	for (int i = 0; i < ip.size(); i++) {
		temp=ip.get(0);
		ip.remove(0);
		ip.add(temp);
		for (int j = 0; j < goal.length(); j++) {
			if(ip.get(j)==goal.charAt(j))  ind++;
			else break;
		}
		if(ind==goal.length()) return true;
		else ind=0;
	}	
	return false;
}


/* Solution1  - Better Solution*/
private boolean rotateStringSolution2(String s, String goal) {
	for (int i = 0; i < s.length(); i++) {
		String fWord = s.substring(0,1);
		String oWord = s.substring(1,s.length());
		s= oWord +fWord;
		if(s.equals(goal)) return true;
	}
	return false;
}


/* Solution1  - Best Solution*/
private boolean rotateStringSolution3(String s, String goal) {
	return s.length() == goal.length() && (s + s).contains(goal);
}
}
