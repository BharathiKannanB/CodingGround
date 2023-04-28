package codinground.prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import org.junit.Test;

public class DifferenceOfTwoLOOPHEALTH {

	
	/* inputArray = [80,83,79,11,9,91,79,76,32,30]
		outArray= [[30,32], [9,11], ...]
	 * 
	 */
	
	@Test  // Solution using Brute force
	public void solveTwoDiffernce() {
		int[] input = {80,83,79,11,9,91,79,76,32,30,2,4,82,6,4};

		HashSet<ArrayList<Integer>> outputSet = new HashSet<ArrayList<Integer>>();
		
		for(int i=0;i<input.length-1;i++)
		{
			for(int j=i+1;j<input.length;j++) {
				if(input[i]-input[j]==2||input[i]-input[j]==-2) {
					ArrayList<Integer> outputList = new ArrayList<Integer>();
					outputList.add(input[i]);
					outputList.add(input[j]);
					Collections.sort(outputList);					
					outputSet.add(outputList);
					
					
				}	
			}
			
		}
		System.out.println(outputSet);
		
	}
	
}
