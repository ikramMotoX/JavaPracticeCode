package DayOne;

import java.util.Iterator;
import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
//		System.out.println(Multiply(7,4));
		int [] a = {1,0,1,0,1,0,1,0,1,0,1,0,1};
//		System.out.println(LargeIt(a));
//		System.out.println(displayRowOfCharacter("&", 9));
//		InputRange();
		//System.out.println(findMaxConsecutiveOnes(a));
		String str = new String();
		System.out.println(str);
		
		

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
	public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0;
        int count = 0;
        for(int num: nums){
        	if(num == 1){
                count++;
                continue;
            }
            if(maxCount < count)
                maxCount = count;
            count=0; 
        }
        return maxCount;
    }

}
