package week1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };
		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < b.length; k++)

				if (a[i] == b[k])
					System.out.println("original number:" + a[i]);

		}

	}

}
