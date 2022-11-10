package DayOne;

public class RecSequentialSearch {
	
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

}
