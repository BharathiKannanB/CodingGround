package sdetbatch3.twopointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import org.junit.Test;

public class ReverseVowels_LC345 {

	
/*	Problem  : Reverse Vowels - https://leetcode.com/problems/reverse-vowels-of-a-string/ 
	Time Complexity:O[N]
	Space Complexity:O[N]  */
	
	
	@Test
	public void testData1() {           //  Exp OP - "holle"
		String s = "hello";
		System.out.println((reverseVowelsSolution(s)));
	}
	
	@Test
	public void testData2() {           //  Exp OP - "leotcede"
		String s = "leetcode";
		System.out.println((reverseVowelsSolution(s)));
	}
	
	@Test
	public void testData3() {           //  Exp OP - "Rhythm"
		String s = "Rhythm";
		System.out.println((reverseVowelsSolution(s)));
	}
	
	@Test
	public void testData4() {           //  Exp OP - "redIvidEr"
		String s = "rEdivIder";
		System.out.println((reverseVowelsSolution(s)));
	}
	
	@Test
	public void testData5() {           //  Exp OP - "a"
		String s = "a";
		System.out.println((reverseVowelsSolution(s)));
	}
	
	/* Pseudocode:
	 * - Initialize two pointer variables
	 * - Iterate the pointer variables from each end
	 * - if left pointer doesn't contain any vowels, increment left pointer
	 * - if right pointer doesn't contain any vowels, decrement right pointer
	 * - else swap both pointer values and increment left & decrement right pointer
	 */
	
	//Two pointer using Hashset
	private String reverseVowelsSolution(String s) {
		Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (!set.contains(arr[left])) {
                left++;
            } else if (!set.contains(arr[right])) {
                right--;
            } else {
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(arr);
	}
	
	//Two pointer using Regex pattern
	private String reverseVowelsSolution2(String ip) {
	int left=0, right=ip.length()-1;
	char temp=0;
	char[] op = ip.toCharArray();
	Pattern VOWELS_PATTERN = Pattern.compile("[aeiouAEIOU]");
	while(left<right) {
		if(VOWELS_PATTERN.matcher(Character.toString(op[left])).matches())
		{
			if(VOWELS_PATTERN.matcher(Character.toString(op[right])).matches())
			{temp=op[left];
			op[left]=op[right];
			op[right]=temp;
			left++;
			right--;
			}
			else
				right--;
		}
		else left++;
	}
	return String.valueOf(op);
}
}
