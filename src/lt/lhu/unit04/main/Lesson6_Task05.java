package lt.lhu.unit04.main;

import java.util.Scanner;

public class Lesson6_Task05 {

	public static void main(String[] args) {
		int cub1Place;
		int cub2Place;
		int cub3Place;

		int cub1Number;
		int cub2Number;
		int cub3Number;

		int startPosition;

		cub1Place = inputNumberOfPosition();
		cub1Number = inputCubeScore();

		cub2Place = inputNumberOfPosition();
		cub2Number = inputCubeScore();

		if (cub1Place == cub2Place) {
			System.out.println("Ошибка ввода позиции");
			System.exit(0);
		}

		if (Math.abs(cub2Place - cub1Place) > 1) {
			System.out.println("Ошибка ввода позиции");
			System.exit(0);
		}
		if (sum(cub1Number, cub2Number) < 4 || sum(cub1Number, cub2Number) > 9) {

		}

		if (cub1Place < cub2Place) {
			startPosition = cub1Place;
		} else {
			startPosition = cub2Place;
		}

		if (startPosition == 1) {
			cub3Place = 3;
			cub3Number = 10 - sum(cub1Number, cub2Number);
			System.out.println("Позиция третьего кубика: " + cub3Place);
			System.out.println("Номер первого кубика: " + cub1Number);
			System.out.println("Номер второго кубика: " + cub2Number);
			System.out.println("Номер третьего кубика: " + cub3Number);
		} else if (startPosition == 9) {
			cub3Place = 8;
			cub3Number = 10 - sum(cub1Number, cub2Number);
			System.out.println("Позиция третьего кубика: " + cub3Place);
			System.out.println("Номер первого кубика: " + cub1Number);
			System.out.println("Номер второго кубика: " + cub2Number);
			System.out.println("Номер третьего кубика: " + cub3Number);
		} else {
			cub3Place = 1;
			cub3Number = 10 - sum(cub1Number, cub2Number);
			System.out.println("Позиция третьего кубика: " + cub3Place);
			System.out.println("Номер первого кубика: " + cub1Number);
			System.out.println("Номер второго кубика: " + cub2Number);
			System.out.println("Номер третьего кубика: " + cub3Number);
		}

	}

	public static int sum(int x, int y) {
		int sum = x + y;
		return sum;
	}

	public static int inputNumberOfPosition() {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер позиции для кубика");
		System.out.print("> ");
		while (!sc.hasNextInt()) {
			sc.nextInt();
			System.out.print("Неверный ввод. Введите значение: ");
		}
		x = sc.nextInt();
		return x;
	}

	public static int inputCubeScore() {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число на кубике");
		System.out.print("> ");
		while (!sc.hasNextInt()) {
			sc.nextInt();
			System.out.print("Неверный ввод. Введите значение: ");
		}
		x = sc.nextInt();
		return x;
	}
}
