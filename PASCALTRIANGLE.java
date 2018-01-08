import java.util.Scanner;

public class PASCALTRIANGLE {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int a = 0;
		while (T-- > 0) {
			a++;
			N = sc.nextInt();
			System.out.println("#" + a);
			int check[][] = new int[N][N];

			for (int i = 0; i < N; i++) {
				if(i==0) {
					check[i][0]=1;
					continue;
				}
				for (int j = 0; j <= i; j++) {
					if (i == j) {
						check[i][j] = 1;
					} else if (j == 0) {
						check[i][0]=1;
					} else {
						check[i][j] = check[i - 1][j - 1] + check[i - 1][j];
					}
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(check[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}


