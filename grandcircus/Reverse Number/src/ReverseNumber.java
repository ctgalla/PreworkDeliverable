import java.util.Scanner;

public class ReverseNumber {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);

		// user prompted to enter number with non-zero units place because int drops the ending zero
		System.out.println("Enter number with non-zero units place to reverse: ");

		// variables assigned value
		// used entered value assigned as original int
		int initial = s.nextInt();
		int reverse = 0;
		int remainder;

		//initial value loop
		while (initial !=0) {

			//loop variables assigned 
			remainder = initial % 10;
			reverse = reverse * 10 + remainder;
			initial = initial / 10;
		}

		// output of reversed number printed
		System.out.printf("Reversed number is: " + reverse);

	}
}