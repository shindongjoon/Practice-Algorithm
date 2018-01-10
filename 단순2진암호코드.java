import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 단순2진암호코드 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int CASE = 0;
		int check[][] = new int[10][7];
		int a0[] = { 0, 0, 0, 1, 1, 0, 1 };
		int a1[] = { 0, 0, 1, 1, 0, 0, 1 };
		int a2[] = { 0, 0, 1, 0, 0, 1, 1 };
		int a3[] = { 0, 1, 1, 1, 1, 0, 1 };
		int a4[] = { 0, 1, 0, 0, 0, 1, 1 };
		int a5[] = { 0, 1, 1, 0, 0, 0, 1 };
		int a6[] = { 0, 1, 0, 1, 1, 1, 1 };
		int a7[] = { 0, 1, 1, 1, 0, 1, 1 };
		int a8[] = { 0, 1, 1, 0, 1, 1, 1 };
		int a9[] = { 0, 0, 0, 1, 0, 1, 1 };
		check[0] = a0;
		check[1] = a1;
		check[2] = a2;
		check[3] = a3;
		check[4] = a4;
		check[5] = a5;
		check[6] = a6;
		check[7] = a7;
		check[8] = a8;
		check[9] = a9;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int N = sc.nextInt();
			int M = sc.nextInt();
			int Mat[][] = new int[N][M];
			int check2[] = new int[56];
			int tempi = 0;
			int tempj = 0;
			String a;
			for (int i = 0; i < N; i++) {
				a = sc.next();
				for (int k = 0; k < a.length(); k++) {
					Mat[i][k] = Integer.parseInt(String.valueOf(a.charAt(k)));
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = M - 1; j >= 0; j--) {
					if (Mat[i][j] == 1) {
						tempi = i;
						tempj = j;
						break;
					}
				}
				if (tempi != 0) {
					break;
				}
			}

			for (int i = 0; i < 56; i++) {
				check2[i] = Mat[tempi][tempj - 55 + i];
			}

			int check3[] = new int[8];

			for (int i = 0; i < 8; i++) {
				int check4[] = new int[7];
				for (int j = 0; j < 7; j++) {
					check4[j] = check2[i * 7 + j];
				}
				for (int k = 0; k < 10; k++) {
					if (Arrays.equals(check[k], check4)) {
						check3[i] = k;
					}
				}
			}

			if( ( 3*(check3[0]+check3[2]+check3[4]+check3[6])+check3[1]+check3[3]+check3[5]+ check3[7]) % 10==0){
				ans = (check3[0]+check3[2]+check3[4]+check3[6])+check3[1]+check3[3]+check3[5] + check3[7];
			}
			
			System.out.printf("#%d %d\n",CASE,ans);
		}
	}
}