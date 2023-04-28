package codinground.prep;

public class ReverseStringWithSpaces {

	public static void main(String[] args) {
		String input = "intern at geeks";
		char[] output = input.toCharArray();
		char temp;
		int left = 0, right = input.length()-1;
		while(left<right) {
			if(output[left]==' ')
				left++;
			else if(output[right]==' ')
				right--;
			else {
				temp = output[left];
				output[left] = output[right];
				output[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(String.valueOf(output));
	}
}
