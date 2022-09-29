package DayOne;

import java.util.Iterator;
import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
//		System.out.println(Multiply(7,4));
//		int [] a = {2,5,6,8,6,8,9,78,4,3,6,5,4,3};
//		System.out.println(LargeIt(a));
//		System.out.println(displayRowOfCharacter("&", 9));
		InputRange();

	}
	
	public static int Multiply(int x, int y) {
		if(x==1)
			return y;
		return y+ Multiply(x-1, y);
	}
	
	public static int LargeIt(int [] a) {
		int large=a[0];
		for (int j = 1; j < a.length; j++) {
			if(large<a[j])
				large = a[j];
		}
		return large;
		
	}
	public static String displayRowOfCharacter(String c, int x) {
		if(x==1)
			return c;
		return c+displayRowOfCharacter(c, x-1);
		
	}
	public static int InputRange() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		if(num < 1 || num > 10)
			InputRange();
		return num;
	
	}

}
