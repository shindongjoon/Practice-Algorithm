import java.util.ArrayList;
import java.util.Scanner;

public class 새로운불면증치료법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;

		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int cnt = 0;
			int k = 0;
			N = sc.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			while (cnt != 10) {
				k++;
				ans = k * N;

				String n = String.valueOf(ans);
				for (int i = 0; i < n.length(); i++) {
					int b = Integer.parseInt(String.valueOf(n.charAt(i)));

					if (!a.contains(b)) {
						a.add(b);
						cnt++;
					}
				}

			}

			System.out.printf("#%d %d \n", CASE, ans);
		}
	}
}
