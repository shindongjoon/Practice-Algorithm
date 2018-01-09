import java.util.Arrays;
import java.util.Scanner;

public class 거듭제곱 {
	public static long res;
	public static int pow(int n, int d) {
		if(d==0) {
			return 1;
		}	
		return n= pow(n,d-1)*n;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			res=0;
			int N = sc.nextInt();
			int n = sc.nextInt();
			int d = sc.nextInt();
			
			System.out.printf("#%d %d\n", CASE, pow(n,d));
		}
	}
}