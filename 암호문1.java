import java.util.ArrayList;
import java.util.Scanner;

public class 암호문1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int N = sc.nextInt();
			ArrayList<Integer> old = new ArrayList<Integer>();
			for (int i = 0; i < N; i++) {
				old.add(sc.nextInt());

			}

			int M = sc.nextInt();
			int x, y;

			for (int i = 0; i < M; i++) {
				String I = sc.next();
				x = sc.nextInt();
				y = sc.nextInt();
				int s[] = new int[y];
				for (int j = 0; j < y; j++) {
					old.add(x+j, sc.nextInt());
				}
			}

			System.out.printf("#%d ", CASE);
			for (int i = 0; i < 10; i++) {
				System.out.print(old.get(i) + " ");
			}
			System.out.println();
		}
	}
}