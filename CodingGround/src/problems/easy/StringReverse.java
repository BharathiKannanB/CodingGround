package problems.easy;

import org.junit.Test;

public class StringReverse {

	@Test
	public void testcase_1()
	{
		String input = "apple";
		System.out.println("Reversed Output :"+StringReverseSolution2(input));
	}
	
	@Test
	public void testcase_2()
	{
		String input = "APPLE";
		System.out.println("Reversed Output :"+StringReverseSolution2(input));
	}
	
	@Test
	public void testcase_3()
	{
		String input = "APPle";
		System.out.println("Reversed Output :"+StringReverseSolution2(input));
	}
	
	@Test
	public void testcase_4()
	{
		String input = "a";
		System.out.println("Reversed Output :"+StringReverseSolution2(input));
	}
	
	@Test
	public void testcase_5()
	{
		String input = "mom";
		System.out.println("Reversed Output :"+StringReverseSolution2(input));
	}

	/*Solution 1 - String Builder  */
	private String StringReverseSolution1(String input) {
		if(input.length()<=1)
			return input;
		StringBuilder output = new StringBuilder();
		output.append(input);
		return output.reverse().toString();
	}
	
	/*Solution 2 - Array  */
	private String StringReverseSolution2(String input) {
		if(input.length()<=1)
			return input;
		char[] output = new char[input.length()];
		output = input.toCharArray();
		int j= output.length-1;
		for (int i = 0; i < output.length; i++) {
			output[j]=input.charAt(i);
			j--;
		}
		return String.valueOf(output);
	}
	
	
	
	
	
}
