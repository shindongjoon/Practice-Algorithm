
import java.util.Arrays;
import java.util.Scanner;

public class Flatten {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int N = sc.nextInt();
			int check[] = new int[100];
			for (int i = 0; i < 100; i++) {
				check[i] = sc.nextInt();
			}
			
			int i = 0;
			int k = 0;
			while (N-- > 0) {
				Arrays.sort(check);
				check[99]--;
				check[0]++;
			}
			Arrays.sort(check);
			System.out.printf("#%d %d\n", CASE, check[99]-check[0]);
		}
	}
}