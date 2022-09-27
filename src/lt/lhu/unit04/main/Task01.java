package lt.lhu.unit04.main;

public class Task01 {

	public static void main(String[] args) {
		int x, y;
		while (true) {
			x = Task02.inputIntFromConsole();
			y = Task02.inputIntFromConsole();

			System.out.println("Наибольший общий делитель:" + gcd(x, y));
			System.out.println("Наибольшее общее кратное:" + nok(x, y));
			System.out.println("---------------------------------------");

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

	public static int nok(int a, int b) {
		int nok = a * b / gcd(a, b);
		return nok;
	}
}
