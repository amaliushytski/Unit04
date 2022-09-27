package lt.lhu.unit04.main;

public class Task03 {

	public static void main(String[] args) {
		int x, y;

		x = Task02.inputIntFromConsole();
		y = Task02.inputIntFromConsole();

		digitsCalculation(x);
		digitsCalculation(y);

		if (digitsCalculation(x) > digitsCalculation(y)) {
			System.out.println("В числе " + x + " цифр больше чем в числе " + y);
		} else if (digitsCalculation(x) == digitsCalculation(y)) {
			System.out.println("В числах равное количество цифр");
		} else {
			System.out.println("В числе " + y + " цифр больше чем в числе " + x);
		}
	}

	public static double digitsCalculation(double x) {
		int count = 0;
		while (x != 0) {
			x = x / 10;
			count++;
		}
		System.out.println(count);
		return count;

	}

}
