package lt.lhu.unit04.main;

public class Lesson6_Task03 {

	public static void main(String[] args) {
		int x;

		for (x = 1; x <= 407; x++) {
			if (numberDefiner(x) == x) {
				System.out.println(x + "- Это число Армстронга");
			} else {
				System.out.println(x + "- Это не число Армстронга");
			}
		}

	}

	public static int numberDefiner(int x) {
		int y = 0;
		int w = 0;
		int sum = 0;
		while (x != 0) {
			y = x % 10;
			x = x / 10;

			w = (int) (Math.pow(y, 3));
			sum = sum + w;
		}
		return sum;
	}

}
