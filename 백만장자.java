import java.util.Arrays;
import java.util.Scanner;

public class 백만장자 {
	

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int cnt = 0;
		while (T-- > 0) {
			cnt++;
			int max = 0;
			long ans = 0;
			int n = sc.nextInt();
			int dp[] = new int[n];
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			

			for (int i = n - 1; i >= 0; i--) {
				max = Math.max(max, a[i]);
				dp[i] = max;
			}

			for (int i = 0; i < n; i++) {
				if (dp[i] > a[i]) {
					ans += dp[i] - a[i];
				}
			}

			System.out.println("#" + cnt + " " + ans);
		}
	}
}