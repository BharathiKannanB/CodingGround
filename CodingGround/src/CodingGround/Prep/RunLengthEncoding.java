package codinground.prep;

import java.util.HashSet;

import org.junit.Test;

public class RunLengthEncoding {

	
	@Test
	public void solveRunLengthEncoding() {
		String input = "aaabbbccaaad";
		StringBuffer output = new StringBuffer();
		HashSet<Character> set = new HashSet<Character>();
		int left = 0,right=1,count=1;
		while(right<input.length()) {
			if(input.charAt(left)!=input.charAt(right)) {
				output.append(input.charAt(left)).append(count);
				count=1;
				left=right;
				right++;
			}
			else {
				right++;
				count++;
			}
			if(right==input.length()) output.append(input.charAt(left)).append(count);							
		}
		System.out.println(output.toString());
	}
	
}
