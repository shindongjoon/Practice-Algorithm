import java.util.Scanner;

public class STRING {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int cnt = 0;
			int N = sc.nextInt();
			String pattern = sc.next();
			String str = sc.next();
			boolean flag = false;
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < pattern.length(); j++) {
					if (i + j < str.length()) {
						if (str.charAt(i + j) == pattern.charAt(j)) {
							cnt++;
						}
					}
				}
				if (cnt == pattern.length()) {
					ans++;
				}
				cnt=0;
			}
			
			System.out.printf("#%d %d\n", CASE, ans);
		}
	}
}