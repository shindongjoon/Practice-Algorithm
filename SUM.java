import java.util.Arrays;
import java.util.Scanner;

public class SUM {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int N = sc.nextInt();
			int check[][] = new int[100][100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					check[i][j] = sc.nextInt();
				}
			}
			int temp1 = 0;
			int temp2 = 0;
			int temp3 = 0;
			int temp4 = 0;
			int temp6 = 0;
			for (int i = 0; i < 100; i++) {
				temp6= ans;
				for (int j = 0; j < 100; j++) {
					temp1 += check[i][j];
					temp2 += check[j][i];
				}
				ans=Math.max(temp1, temp2);
				ans=Math.max(temp6,ans);
				temp1=0;
				temp2=0;
				temp3 += check[i][i];
				temp4+=check[100-1-i][i];
			}
			int temp5=Math.max(temp3, temp4);
			ans= Math.max(ans, temp5);
			
			System.out.printf("#%d %d\n", CASE, ans);
		}
	}
}