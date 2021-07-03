package july.coding.challenge;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * S.No. : Day 01
 * Problem : Gray Code
 * Link : https://leetcode.com/explore/challenge/card/july-leetcoding-challenge-2021/608/week-1-july-1st-july-7th/3799/
 * Author : BK 
 * Version : 1.0
 * Time Complexity:
 * Space Complexity:
 */
public class Day01_GrayCode {
@Test	
public void testcase1() {
	int n=2;
	System.out.println(grayCodeSolution(n));
}

@Test	
public void testcase2() {
	int n=3;
	System.out.println(grayCodeSolution(n));
}

@Test	
public void testcase3() {
	int n=0;
	System.out.println(grayCodeSolution(n));
}

@Test	
public void testcase4() {
	int n=16;
	System.out.println(grayCodeSolution(n).toString());
}

//@Test	
public void testcase5() {
	int n=100;
	System.out.println(grayCodeSolution(n).toString());
}
int nums = 0;
private List<Integer> grayCodeSolution(int n) {
	List<Integer> ret = new ArrayList<>();
    backTrack(n, ret);
    return ret;	
}

private void backTrack(int n, List<Integer> ret) {
    if (n == 0) {
        ret.add(nums);
        return;
    }
    else {
        backTrack(n - 1, ret);
        nums ^= (1 << n - 1); 
        backTrack(n - 1, ret);
    }
}
}
