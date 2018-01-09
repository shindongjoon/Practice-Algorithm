import java.util.Scanner;

public class Magnetic {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int N = sc.nextInt();
			int Mat[][] = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					Mat[i][j] = sc.nextInt();
				}
			}

			
			int cnt = 0;
			for (int j = 0; j < N; j++) {
				for (int i = 0; i < N; i++) {
					if (Mat[i][j] ==1) {
						for(int k=i+1; k<N; k++) {
							if(Mat[k][j]==2) {
								cnt++;
								i=k;
								break;
							}
						}
					}
				}
			}

			System.out.printf("#%d %d\n", CASE, cnt);
		}
	}
}