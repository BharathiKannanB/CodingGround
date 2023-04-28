package codinground.prep;

import org.junit.Test;

public class ReverseStringSpacesPAYTM {

	
	//@Test// I Am Not String.  ---> g ni rtS toNmAI
	public void solveStringReverse() {
		String input ="I Am Not String";
		char[] output = new char[input.length()];
		output = input.toCharArray();
		char[] inputString = input.toCharArray();
		int j=0,i=inputString.length-1;
		while(i>=0&&j<inputString.length) {
			if(!(output[j]==' ')&&!(inputString[i]==' ')) {
			output[j]=inputString[i];
			j++;
			i--;
			}
			else {
			if(output[j]==' ') j++;
			if(output[i]==' ') i--;
			}
			
		}
		System.out.println("Reversed String value : "+String.valueOf(output));
	}
	
	@Test// Using Two pointer - I Am Not Stri ng.  ---> g ni rtS toNmAI
	public void solveStringReverse2() {
		String input ="I Am Not Stri ng";
		char[] output = input.toCharArray();
		int left = 0, right = output.length-1;
		char temp;
		while(left<right) {
			if(output[left]==' ')
				left++;
			else if(output[right]==' ')
				right--;
			else {
			temp = output[left];
			output[left]=output[right];
			output[right]=temp;
			left++;
			right--;
			}
		}
		System.out.println("Reversed String value : "+String.valueOf(output));
	}
	
	
	
}
