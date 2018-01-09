import java.util.Arrays;
import java.util.Scanner;

public class 회문2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int N = sc.nextInt();
			char check[][] = new char[100][100];
			for (int i = 0; i < 100; i++) {
				String str = sc.next();
				for (int j = 0; j < 100; j++) {
					check[i][j] = str.charAt(j);

				}
			}
			int check2 [] = new int [100];
			for (int p = 1; p < 100; p++) {
				int cnt = 0;
				for (int i = 0; i < 100; i++) {
					for (int j = 0; j <= 100 - p; j++) {
						for (int k = 0; k < Math.floor(p / 2); k++) {
							if (check[i][j + k] == check[i][j + p - 1 - k]) {
								cnt++;
							}
						}
						if (cnt == p / 2)
							// System.out.println(i + " " + j);
							check2[p]++;
						cnt = 0;
					}
				}

				for (int j = 0; j < 100; j++) {
					for (int i = 0; i <= 100 - p; i++) {
						for (int k = 0; k < Math.floor(p / 2); k++) {
							if (check[i + k][j] == check[i + p - 1 - k][j]) {
								cnt++;
							}
						}
						if (cnt == p / 2)
							// System.out.println(i + " " + j);
							check2[p]++;
						cnt = 0;
					}
				}
			}
			int temp=0;
			for(int i = 0 ; i < 100 ; i++) {
				if(check2[i]!=0) {
					temp=i;
				}
			}
			
			System.out.printf("#%d %d\n", CASE, temp);
		}
	}
}