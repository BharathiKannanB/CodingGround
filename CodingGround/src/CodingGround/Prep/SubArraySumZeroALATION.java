package codinground.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class SubArraySumZeroALATION {

	// 2,8,-3,-5,2,-4,6,1,2,1,-3,4 - Solution need to tweak
	//@Test 
    public void solveSubArrayZero0(){
       int[] input = {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
       ArrayList<Integer> output = new ArrayList<Integer>();
       int left=0,right=1;
       int  cSum=input[0];
         output.add(input[left]);
       while(right<input.length){
           cSum = cSum+input[right];
             output.add(input[right]);
           if(cSum==0){
               System.out.println("SubArrays having zero sum "+ output);
               output.remove(input[left]);
           }
           else if(cSum>0){
               left++;
               cSum = cSum-input[left];
           }
           else
               right++;
               cSum = cSum+input[right];
           
       }
    }
	
    // Brute force
	//@Test 
    public void solveSubArrayZero1(){
       int[] input = {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
       int cSum = 0;
     for(int i=0;i<input.length-1;i++) {
    	 cSum += input[i];
    	 for(int j=i+1;j<input.length;j++) {
    		 cSum += input[j];
    		 if(cSum==0) {	 
				System.out.println(Arrays.toString(Arrays.copyOfRange(input, i, j+1)));	
			}
    	 }
    	 cSum=0;
     }
    }
	
	// Efficient solution
		@Test 
	    public void solveSubArrayZero2(){
			HashMap<Integer,ArrayList<Integer>> output = new HashMap<Integer,ArrayList<Integer>>();
			  int[] input = {2,8,-3,-5,2,-4,6,1,2,1,-3,4};
		       int cSum = 0;
		     for(int i=0;i<input.length;i++) {
		    	 cSum += input[i];
		    	 if(input[i]==0)
		    		 System.out.println(0);	
		    	 else if(cSum==0) {	 
						System.out.println(Arrays.toString(Arrays.copyOfRange(input, 0, i+1)));	
					} 
		    	 else if(output.containsKey(cSum)) {	 
		    			 for(Integer j:output.get(cSum))
						System.out.println(Arrays.toString(Arrays.copyOfRange(input, j+1, i+1)));	
		    			 output.get(cSum).add(i);
					}
		    		 else {
		    			 output.putIfAbsent(cSum, new ArrayList<Integer>());
		    			 output.get(cSum).add(i);
		    		 }
		    	 }
		     }
		
		
	     }
		


