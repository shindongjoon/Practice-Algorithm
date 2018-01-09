import java.util.Arrays;
import java.util.Scanner;

public class 회문1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int N = sc.nextInt();
			char check[][] = new char[8][8];
			for (int i = 0; i < 8; i++) {
				String str = sc.next();
				for (int j = 0; j < 8; j++) {
					check[i][j] = str.charAt(j);
		
				}
			}
			
			int cnt = 0;
			
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j <= 8 - N; j++) {
					for (int k = 0; k < Math.floor(N / 2); k++) {
						if (check[i][j + k] == check[i][j + N -1- k]) {
							cnt++;
						}
					}
					if (cnt == N / 2)
						//System.out.println(i + " " + j);
						ans++;
					cnt = 0;
				}
			}
			
			for (int j = 0; j < 8; j++) {
				for (int i = 0; i<= 8-N; i++) {
					for (int k = 0; k < Math.floor(N / 2); k++) {
						if (check[i+k][j] == check[i+N-1-k][j]) {
							cnt++;
						}
					}
					if (cnt == N / 2)
						//System.out.println(i + " " + j);
						ans++;
					cnt = 0;
				}
			}
			System.out.printf("#%d %d\n", CASE, ans);
		}
	}
}