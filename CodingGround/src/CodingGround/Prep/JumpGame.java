package codinground.prep;

import org.junit.Assert;
import org.junit.Test;



public class JumpGame {

	/* Jump Game
	 * 
	 * 
	 */
	
	@Test
	public void testData1() {  				//+ve case
		int[] input = {2,3,1,1,4};
		boolean output = true;
		Assert.assertEquals(output, solveJumpGame(input,0,0));
	}

	@Test
	public void testData2() {  				//+ve case
		int[] input = {2,3,2,0,4};
		boolean output = true;
		Assert.assertEquals(output, solveJumpGame(input,0,0));
	}
	
	@Test
	public void testData3() {  				//-ve case
		int[] input = {3,2,1,0,4};
		boolean output = false;
		Assert.assertEquals(output, solveJumpGame(input,0,0));
	}
	
	@Test
	public void testData4() {  				//-ve case
		int[] input = {0,0,0,0};
		boolean output = false;
		Assert.assertEquals(output, solveJumpGame(input,0,0));
	}
	
	@Test
	public void testData5() {  				//edge case
		int[] input = {4};
		boolean output = true;
		Assert.assertEquals(output, solveJumpGame(input,0,0));
	}
	
	@Test
	public void testData6() {  				//edge case
		int[] input = {3,0,8,2,0,0,1};
		boolean output = true;
		Assert.assertEquals(output, solveJumpGame(input,0,0));
	}
	
	/* Pseudocode -
	 * Initialize target as input array size and csum & psum as zero
	 * 
	 * if csum == target
	 * 		return true
	 * else if csum > target || input[csum]==0
	 * 		csum = psum
	 * 		csum += --input[csum]
	 * else
	 * 		psum=csum
	 * 		csum = csum + input[csum]
	 * 		solve
	 * 
	 */
	
	/* Solution - Using recursion - wont work */
	private boolean solveJumpGame1(int[] input,int csum,int psum) {
		int target = input.length-1;
		if(csum==target||target==0) {
			return true;
			}
		else if(csum>target || input[csum]==0) {
			csum=psum;
			--input[csum];
			if(input[csum]<1&&csum==0) return false;
			csum += input[csum];
			}
		else {
			psum=csum;
			csum += input[csum];
		}
		return solveJumpGame(input,csum,psum);
	}
	
	/* Solution - from back to front */
	private boolean solveJumpGame(int[] input,int csum,int pointer) {
		int target = input.length-1;
		if(target==0) return true;
		pointer=1;
		while(pointer<=target) {
			if(input[target-pointer]<pointer)
				pointer++;
			
				
				
		}
		
		return false;
	}
	
}
