import java.util.Scanner;

public class 최빈수구하기 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int check[] = new int[101];
			sc.nextInt();
			for(int i =0 ; i < 1000; i++) {
				check[sc.nextInt()]++;
			}
			int max=0;
			int temp=0;
			for(int i =0 ; i < 101; i++) {
				max = Math.max(check[i], max);
				if(check[i]>=max) temp = i;
			}

			System.out.printf("#%d %d\n", CASE, temp);
		}
	}
}