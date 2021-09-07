package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 153;
		int calculated = 0;
		int remainder, original;
		original = input;
		while (input > 0) {
			remainder = input % 10;
			calculated = calculated + (remainder * remainder * remainder);
			input = input / 10;

		}
		if (calculated == original)
			System.out.println("given number is armstrong");
		else
			System.out.println("given number is not armstrong");

	}

}
