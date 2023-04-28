package codinground.prep;

import java.util.Arrays;

import org.junit.Test;

public class OddEven {

	
	@Test
	public void solveOddEven() {
		int[] input =  {1,2,3,4,5,6,7,8,9};
		int left=0,right= input.length-1,temp;
		System.out.println(Arrays.toString(input));
		while(left<right)
		{
			if(input[left]%2==1) {
				temp= input[left];
				input[left] = input[right];
				input[right] = temp;
				right--;
			}
			if(input[right]%2==0) {
				temp= input[left];
				input[left] = input[right];
				input[right] = temp;
				left++;
			}
			if(input[right]%2==1) right--;
			if (input[left]%2==0) left++;
			
		}
		System.out.println(Arrays.toString(input));
	}
	
}
