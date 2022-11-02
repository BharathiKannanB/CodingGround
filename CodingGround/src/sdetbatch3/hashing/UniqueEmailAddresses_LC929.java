package sdetbatch3.hashing;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;


public class UniqueEmailAddresses_LC929 {

	/* Unique Email Addresses - https://leetcode.com/problems/unique-email-addresses/
	 * Time Complexity - O[n]
	 * Space Complexity - O[n]
	 */
	
	@Test
	public void TestData1() {
		String[] emails ={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		int output = 2;
		Assert.assertEquals(output, solveUniqueEmailAddresses(emails));
	}
	
	@Test
	public void TestData2() {
		String[] emails ={"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
		int output = 3;
		Assert.assertEquals(output, solveUniqueEmailAddresses(emails));
	}
	
	@Test
	public void TestData3() {
		String[] emails ={"test.email+@leetcode.com","testemail+@leetcode.com"};
		int output = 1;
		Assert.assertEquals(output, solveUniqueEmailAddresses(emails));
	}
	
	@Test
	public void TestData4() {
		String[] emails ={"test.email+@leetcode.com"};
		int output = 1;
		Assert.assertEquals(output, solveUniqueEmailAddresses(emails));
	}
	
	@Test
	public void TestData5() {
		String[] emails ={"@"};
		int output = 1;
		Assert.assertEquals(output, solveUniqueEmailAddresses(emails));
	}
	
	/* Pseudocode:
	 *  - Initialize a output set
	 *  - Itearate through input emails 
	 *  			- local name  = substring of input email local name before '+' and remove '.'
	 * 			    - host name  = substring of input email host name and remove '.'
	 * 				- output = local name + host name
	 * 				- if(output is not present in set)
	 * 					- add output to the set
	 *  - return output set size
	 */

	private int solveUniqueEmailAddresses(String[] emails) {
		if(emails.length<2) return emails.length;
		String output ="";
		HashSet<String> result = new HashSet<>();
		for(String email:emails) {			
			output = email.substring(0, email.indexOf('+')>0
					?email.indexOf('+')
					:email.indexOf('@')).replace(".","")
					+email.substring(email.indexOf('@'),email.length() );
			if(!result.contains(output)) result.add(output);
		}
		return result.size();
	}
	
	
}
