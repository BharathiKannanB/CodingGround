package sdetbatch3.twopointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CheckDoublyExist_LC1346 {

	  

	    @Test
	    public void example6(){
	        int[] arr={-2,0,0,-19,4,6,-8};
	        Assert.assertEquals(nDoubleExist(arr), true);
	    }

	

	    private boolean nDoubleExist(int[] arr){
	    	 Set<Integer> set = new HashSet();
	         for (int n : arr) {
	             if (set.contains(2*n) 
	                 || (n%2 == 0 && set.contains(n/2)))
	                 return true;
	             set.add(n);
	         }
	         return false;

	}
}
	

