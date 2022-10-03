package lt.lhu.unit04.main;

public class Lesson6_Task01 {

	public static void main(String[] args) {
		int x, y, z;

		x = Task02.inputIntFromConsole();
		y = Task02.inputIntFromConsole();
		z = Task02.inputIntFromConsole();

		if (gcd(gcd(x, y), z) == 1) {

			System.out.println("Числа взаимно простые");
		} else {
			System.out.println("Числа не взаимно простые");
		}

	}

	public static int gcd(int a, int b) {
		int gcd = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
}
