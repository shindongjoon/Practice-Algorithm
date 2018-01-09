import java.util.Arrays;
import java.util.Scanner;

public class 가랏RC카 {
	public static int command[] = { 0, 1, 2 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;

		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			N = sc.nextInt();
			int distance =0 ;
			int V = 0;
			for (int i = 0; i < N; i++) {
				int c = sc.nextInt();
				if (command[c] == 1) {
					V += sc.nextInt();
				} else if (command[c] == 2) {
					V -= sc.nextInt();
				}
				if(V<0) {
					V=0;
				}
				distance += V;

			}
			System.out.printf("#%d %d \n", CASE, distance);
		}
	}
}
