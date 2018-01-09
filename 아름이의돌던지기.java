import java.util.Scanner;

public class 아름이의돌던지기 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int CASE = 0;
		while (T-- > 0) {
			int ans = 1000000;
			int N = sc.nextInt();
			int check[] = new int[N];
			for (int i = 0; i < N; i++) {
				check[i]=sc.nextInt();
			}

			for (int i = 0; i < N; i++) {
				ans=Math.min(Math.abs(check[i]),ans);
			}
			int cnt =0 ;
			for (int i = 0; i < N; i++) {
				if(ans==Math.abs(check[i])) {
					cnt++;
				};
			}
			System.out.printf("#%d %d %d\n", CASE,ans, cnt);
		}
	}
}
