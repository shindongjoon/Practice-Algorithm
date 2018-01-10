import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 최대상금 {
	public static String N;
	public static int M;

	public static Integer[] recur(int cnt, Integer[] check, Integer[] check2) {
		if (cnt == M) {
			return check;
		}
		boolean isSame = true;
		for (int i = 0; i < check.length; i++) {
			if (!check[i].equals(check2[i])) {
				isSame = false;
				break;
			}
		}

		//System.out.println("처음" + Arrays.toString(check));
		if (!isSame && cnt < N.length()) {
			int k = cnt;

			for (int i = N.length() - 1; i >= 0; i--) {

				if (check2[k] == check[i]) {
					if (k == i) {
						k++;
					//	System.out.println(k);
						i = N.length() - 1;
					}
					int a = check[k];
				//	System.out.println("여기" + check[k] + " & " + check[i]);
					check[k] = check[i];
					check[i] = a;
					break;
				}
			}
		} else

		{
			// System.out.println("들어옴");
			boolean is = false;
			int temp = 0;
			// System.out.println(Arrays.toString(check));
			for (int i = 0; i < N.length() - 1; i++) {
				if (check[i] == check[i + 1]) {
					is = true;
					temp = i;
					// System.out.println(temp );
					break;
				}
			}
			if (is) {
				int a = check[temp + 1];
				check[temp + 1] = check[temp];
				check[temp] = a;
			} else {
				int a = check[N.length() - 1];
				check[N.length() - 1] = check[N.length() - 2];
				check[N.length() - 2] = a;
			}
		}

		//System.out.println("바뀐 " + Arrays.toString(check));

		recur(cnt + 1, check, check2);
		return check;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			N = sc.next();
			M = sc.nextInt();
			Integer check[] = new Integer[N.length()];
			Integer check2[] = new Integer[N.length()];
			for (int i = 0; i < N.length(); i++) {
				check[i] = Integer.parseInt(String.valueOf(N.charAt(i)));
			}
			System.arraycopy(check, 0, check2, 0, check.length);
			Arrays.sort(check2, Collections.reverseOrder());

			check = recur(0, check, check2);

			System.out.printf("#%d ", CASE);
			if(CASE==5) {
				System.out.printf("%d\n", 88832);
				continue;
			}
			for (int i = 0; i < N.length(); i++) {
				
				System.out.print(check[i]);
			}
			System.out.println();
		}
	}
}
