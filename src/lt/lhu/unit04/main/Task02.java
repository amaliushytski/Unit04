package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		int x, y, z;

		x = inputIntFromConsole();
		y = inputIntFromConsole();
		z = inputIntFromConsole();

		System.out.println("Минимальное число: " + min(x, y, z));
		System.out.println("Максимальное число: " + max(x, y, z));

	}

	public static double min(double a, double b, double c) {

		return Math.min(Math.min(a, b), c);
	}

	public static double max(double a, double b, double c) {

		return Math.max(Math.max(a, b), c);
	}

	public static int inputIntFromConsole() {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		System.out.print("> ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Неверный ввод. Введите значение: ");
		}
		x = sc.nextInt();
		return x;
	}

}
