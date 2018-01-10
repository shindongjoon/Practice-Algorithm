import java.util.Arrays;
import java.util.Scanner;

public class 영준이와신비한뿔의숲 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int q= N-M;
			int r= M-q;
		
			System.out.printf("#%d %d %d\n", CASE, r,q);
		}
	}
}