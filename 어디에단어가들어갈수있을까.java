
import java.util.Arrays;
import java.util.Scanner;

public class 어디에단어가들어갈수있을까 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int cnt = 0;
		int N, K;
		while (T-- > 0) {
			cnt++;
			int ans = 0;
			N = sc.nextInt();
			K = sc.nextInt();
			int Mat[][] = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					Mat[i][j] = sc.nextInt();
				}
			}

			int sum = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					
					
					
					if (j + K <= N) {
						for (int l = 0; l < K; l++) {
							sum += Mat[i][j + l];
						}
					}
					if (sum == K) {
						if (j == 0) {
							if (Mat[i][j + K] != 1) {
							//	System.out.println("1 : " + i +"  "+ j);
								ans++;
							}
						} else if (j + K < N) {
							if (Mat[i][j - 1] != 1 && Mat[i][j + K] != 1) {
							//	System.out.println("2 : " + i +"  "+ j);
								ans++;
							}
						} else if (Mat[i][j - 1] != 1 ) {
							//System.out.println("3 : " + i +"  "+ j);
							ans++;
						}
					}
					sum = 0;
					
					
					if (i + K <= N) {
						for (int l = 0; l < K; l++) {
							sum += Mat[i + l][j];
						}
					}
					if (sum == K) {
						if (i == 0) {
							if (Mat[i + K][j] != 1) {
								//System.out.println("4 : " + i +"  "+ j);
								ans++;
							}
						} else if (i + K < N) {
							if (Mat[i - 1][j] != 1 && Mat[i + K][j] != 1) {
							//	System.out.println("5 : " + i +"  "+ j);
								ans++;
							}
						} else if (Mat[i - 1][j] != 1) {
						//	System.out.println("6 : " + i +"  "+ j);
							ans++;
						}
					}
					sum = 0;
					
					
				}
			}
			System.out.println("#" + cnt + " " + ans);
		}
	}
}
