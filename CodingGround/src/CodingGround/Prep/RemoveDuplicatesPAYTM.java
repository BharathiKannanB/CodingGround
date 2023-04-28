package codinground.prep;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class RemoveDuplicatesPAYTM {

	
	//@Test   // Java Program to remove duplicates from integer array without Collection
	public void solveRemoveDuplicates() {
		
		int[] input = {1, 1, 1, 1, 1, 1, 1};
		for(int i=0;i<input.length-1;i++) {
			if(input[i]==Integer.MIN_VALUE) continue;
			for(int j=i+1;j<input.length;j++) {
				if(input[i]==input[j]) {
					input[j] = Integer.MIN_VALUE;
				}
			}	
		}
		for(int i:input) {
			if(i!=Integer.MIN_VALUE) System.out.print(i+" ");
		}
	}
	
	//@Test // Using HashSet
	public void solveRemoveDuplicatesUsingSet() {
		
		int[] input = {3, 1, 2, 2, 3, 6, 8};
		HashSet<Integer> output = new HashSet<Integer>();
		for(int i: input) {
			output.add(i);
		}
		System.out.println("Unique values "+output);
	}
	
	@Test // Using sorting
	public void solveRemoveDuplicates2() {
		
		int[] input = {3, 1, 2, 2, 3, 6, 8};
		Arrays.sort(input);
		int counter = 0;
		for(int i=0;i<input.length;i++) {
			if(i==input.length-1||input[i]!=input[i+1]) {
				input[counter] = input[i];
				counter++;
			}	
		}
		for(int j=0;j<counter;j++) {
			System.out.print(input[j]+" ");
		}
		
	}
	
	//  Update cell1 = 5 from Table where 
}
