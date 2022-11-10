package DayOne;

import java.util.Iterator;
import java.util.Scanner;

public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**System.out.println(Multiply(7,4));
		int [] a = {1,0,1,0,1,0,1,0,1,0,1,0,1};
//		System.out.println(LargeIt(a));
//		System.out.println(displayRowOfCharacter("&", 9));
//		InputRange();
		//System.out.println(findMaxConsecutiveOnes(a));
		String str = new String();
		System.out.println(str);
		*/
		T[] arr = [3,7,4,5,6,98,43,24,65,86,45,8,5];s
		boolean t = inArray(arr,24));
		
		
		
		

	}
	public static <T> boolean inArray(T[] anArray, T anEntry) {
		return searchElement(anArray, 0, anArray.length -1 , anEntry);
	}
	
	/**
	 * Recursive sequential search of an unsorted array
	 */
	public static <T> boolean searchElement(T[] arr, int first, int last, T element) {
		
		
		boolean found;
		if(first > last)
			found = false;
		else if(element.equals(arr[first]))
			found = true;
		else
			found = searchElement(arr, first+1, last, element);
		
		return found;
		
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
