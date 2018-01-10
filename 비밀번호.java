import java.util.ArrayList;
import java.util.Scanner;

public class 비밀번호 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int N = sc.nextInt();
			String str = sc.next();
			ArrayList<Integer> strarr = new ArrayList<Integer>();
			for (int i = 0; i < str.length(); i++) {
				strarr.add(Integer.parseInt(String.valueOf(str.charAt(i))));
			}
			
			int cnt=0;
			while (true) {
				cnt=0;
			
				for (int i = 0; i < strarr.size()-1; i++) {
					if (strarr.get(i) == strarr.get(i + 1)) {
						strarr.remove(i);
						strarr.remove(i);
						cnt++;
						break;
					}
				}
				if(cnt==0) {
					break;
				}
			}
			System.out.printf("#%d ", CASE);
			for (int i = 0; i < strarr.size(); i++) {
				System.out.print(strarr.get(i));
			}
			System.out.println();
		}
	}
}