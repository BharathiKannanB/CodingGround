package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class TestArea {
	@Test
	public void listPractise() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(1);
		al.add(3);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
	}
	
	//@Test
	public void performInput() {
		Scanner ip = new Scanner(System.in);
		String temp = ip.nextLine();
		int temp2 = ip.nextInt();
		System.out.println(temp+" "+temp2);
	}
	
	//@Test
	public void performMultidimensionalArray() {
		int op[][] = new int[3][3];
		//System.out.println(op.length);
		for(int i=0;i<op.length;i++) {
			for(int j=0;j<op.length;j++) {
				op[i][j]=i+j;
	}
		}
		System.out.println(Arrays.deepToString(op));
	}
	
	//@Test
		public void performArray() {
			int a[] = {1,2,3};
			int b[] = {1,3,2};
			//System.out.println(Arrays.equals(a, b));
			Arrays.sort(b);
			//System.out.println(Arrays.toString(b));
			System.out.println(Arrays.asList(b));
			
		}
	
}
