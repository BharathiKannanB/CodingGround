package codinground.prep;

import java.util.Arrays;

import org.junit.Test;

public class RotateImage {

	
	@Test
	public void testData1() {
		int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(solveRotateImage(input)));
	}
	
	@Test
	public void testData2() {
		int[][] input = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		System.out.println(Arrays.deepToString(solveRotateImage(input)));
	}

	private int[][] solveRotateImage(int[][] input) {
		
		int arrayLength = input.length;
		for(int j=arrayLength-1;j>arrayLength/2;j--) {
			rotateSides(input,j);
		}
		return input;
	}
	
	public int[][] rotateSides(int[][] input,int arrayLength)
	{
		int temp1=0,temp2=arrayLength;
		for(int i=0;i<arrayLength;i++)
		{
		temp1 = input[temp2][0];
		input[temp2][0]=input[arrayLength][temp2];
		input[arrayLength][temp2]=input[i][arrayLength];
		input[i][arrayLength]=input[0][i];
		input[0][i]=temp1;
		temp2--;
		}
	return input;
	}
}
