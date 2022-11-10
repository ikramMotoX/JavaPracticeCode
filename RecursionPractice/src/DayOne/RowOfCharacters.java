package DayOne;

public class RowOfCharacters {

	public static void main(String[] args) {
		displayRowOfCharacters('*', 5);

	}
	public static void displayRowOfCharacters(char c, int num) {
		if(num == 1)
			System.out.print('*');
		displayRowOfCharacters(c, num-1);
		
	}

}
