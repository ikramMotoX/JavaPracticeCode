package DayOne;

import java.util.Iterator;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(Multiply(7,4));
		int [] a = {2,5,6,8,6,8,9,78,4,3,6,5,4,3};
		System.out.println(LargeIt(a));

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
		System.out.println("test");
		return large;
		
	}

}
