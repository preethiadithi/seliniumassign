package week1.day2;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 454;
		int temp = num;
		int r, sum = 0;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = (sum * 10) + r;

		}
		if (temp == sum)
			System.out.println("the given number is pallindrome");
		else
			System.out.println("the given number is not a pallindrome ");
	}

}
