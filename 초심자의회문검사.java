import java.util.Scanner;

public class 초심자의회문검사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int Tnum = 0;
		String str = new String();

		while (T-- > 0) {
			Tnum++;
			int ans = 1;
			str = sc.next();
			if (str.length() % 2 != 0) {
				for (int i = 0; i <= (str.length() / 2) - 1; i++) {
					if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
						ans = 0;
					}
				}
			} else {
				for (int i = 0; i < (str.length() / 2); i++) {

					if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
						ans = 0;
					}
				}
			}

			System.out.println("#" + Tnum + " " + ans);
		}
	}
}
