package lt.lhu.unit04.main;

public class Lesson6_Task04 {

	public static void main(String[] args) {

		int[] D = new int[7];

		for (int i = 0; i <= 6; i++) {
			D[i] = i + 1;
		}

		System.out.println("D[l] + D[2] + D[3] = " + sum(D[0], D[1], D[2]));
		System.out.println("D[3] + D[4] + D[5] = " + sum(D[2], D[3], D[4]));
		System.out.println("D[5] + D[6] + D[7] = " + sum(D[4], D[5], D[6]));
	}

	public static int sum(int x, int y, int z) {
		int sum = x + y + z;
		return sum;
	}
}
