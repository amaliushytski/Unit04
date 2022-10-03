package lt.lhu.unit04.main;

import java.util.Scanner;

public class Lesson6_Task02 {

	public static void main(String[] args) {
		String x, y;

		Long z;
		Long w;

		x = inputStringFromConsole();
		y = inputStringFromConsole();

		z = Long.parseLong(x);
		w = Long.parseLong(y);

		Long sum = z + w;
		System.out.println("Сумма двух чисел равна: " + sum);
	}

	public static String inputStringFromConsole() {
		String x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		System.out.print("> ");
		while (!sc.hasNextLine()) {
			sc.nextLine();
			System.out.print("Неверный ввод. Введите значение: ");
		}
		x = sc.nextLine();
		return x;

	}
}