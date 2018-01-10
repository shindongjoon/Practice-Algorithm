import java.util.Arrays;
import java.util.Scanner;

public class 암호생성기 {
	public static int[] arr;

	public static int[] amho(int check[]) {
		int temp = 0;
		if (check[7] <= 0) {
			check[7] = 0;
			return check;
		} else {
			for (int i = 1; i <= 5; i++) {
				temp = check[0];
				temp = temp - i;

				for (int j = 0; j < 7; j++) {
					check[j] = check[j + 1];
				}
				if (temp <= 0) {
					check[7] = 0;
					return check;
				} else {
					check[7] = temp;
				}

			}
			amho(check);
		}

		return check;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			// int N = sc.nextInt();
			sc.nextInt();
			int check[] = new int[8];

			for (int i = 0; i < 8; i++) {
				check[i] = sc.nextInt();
			}
			amho(check);
			System.out.printf("#%d ", CASE);
			for (int i = 0; i < 8; i++) {
				System.out.print(check[i] + " ");
			}
			System.out.println();
		}
	}
}