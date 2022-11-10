package DayOne;

public class LargestValue {

	public static void main(String[] args) {
		
		int [] ar = {2,4,5,3,5,3,2,4,5,8,7,99,9};
		

	}
	public static int LargestValueArray(int[] ar) {
		int firstIndex = 0;
		int lastIndex = ar.length;
		int largest = ar[firstIndex];
		if(ar[firstIndex]<ar[lastIndex] && firstIndex != lastIndex)
			largest = ar[lastIndex];
		
		return largest;
	}

}
