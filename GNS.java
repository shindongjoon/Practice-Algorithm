import java.util.Arrays;
import java.util.Scanner;

public class GNS {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int CASE = 0;
		String arr[] = { "ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN" };
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			sc.next();
			int N = sc.nextInt();
			int check[] = new int[N];
			
			for (int j = 0; j < N; j++) {
				String num = sc.next();
				for (int i = 0; i < 10; i++) {
					if (num.equals(arr[i])) {
						check[j]=i;
					}
				}
			}
			Arrays.sort(check);

			String check2[] = new String[N];
			
			for (int j = 0; j < N; j++) {
				for (int i = 0; i < 10; i++) {
					if (check[j]==i) {
						check2[j]=arr[i];
					}
				}
			}
			System.out.printf("#%d\n",CASE);

			for (int j = 0; j < N; j++) {
				System.out.printf(check2[j]+" ");
			}
			System.out.println();
		}
	}
}