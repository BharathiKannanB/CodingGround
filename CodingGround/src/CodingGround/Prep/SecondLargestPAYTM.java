package codinground.prep;

import org.junit.Test;

public class SecondLargestPAYTM {

	// {5,10,2,14,1}-> 10  
	
		/*
		 *   Max1 and Max2  -> Max2<n Max2 = n -> Max1<Max2 Max1=Max2
		 */
		
		@Test  // Solution 1 using two for loops
		public void solveSecondLargest() {
			int[] input = {5,3,2,14,7,8};
			int firstMax= Integer.MIN_VALUE;
			int secondMax= Integer.MIN_VALUE;
			
			// finding the first maximum number
			for(int i:input) {
				if(firstMax<i)
					firstMax=i;
			}
			
			// finding the second maximum number
					for(int i:input) {
						if(secondMax<i&&i!=firstMax)
							secondMax=i;
					}
			System.out.println("Second Largest number : "+secondMax);
		}
		
		//@Test  // Solution 2 using single for loop
		public void solveSecondLargest2() {
			int[] input = {5,3,2,14,1,7,8};
			int firstMax= Integer.MIN_VALUE;
			int secondMax= Integer.MIN_VALUE;
			
			// finding the second maximum number
			for(int i:input) {
				if(firstMax<i)	
				{
					secondMax = firstMax;
					firstMax=i;		
				}
				else if(secondMax<i)	
				{
					secondMax = i;	
				}
					}
			System.out.println("Second Largest number : "+secondMax);
		}

}
