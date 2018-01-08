import java.util.Arrays;
import java.util.Scanner;

public class 숫자를정렬하자 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans=0;
			N=sc.nextInt();
			int check [] = new int[N];
			
			for(int i =0; i < N ; i++) {
				check[i]=sc.nextInt();
			}
			Arrays.sort(check);
			System.out.printf("#%d ", CASE);
			for(int i = 0; i <N; i++) {
				System.out.printf("%d ", check[i]);				
			}
			System.out.println();
		}
	}
}
