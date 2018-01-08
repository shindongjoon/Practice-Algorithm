import java.util.Arrays;
import java.util.Scanner;

public class 중간평균값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int Tnum = 0;
		while (T-- > 0) {
			Tnum++;
			double ans = 0;
			int check [] = new int[10];
			for(int i = 0; i <10 ; i++) {
				check[i]=sc.nextInt();
			}
			Arrays.sort(check);
			double sum= 0;
			for(int i = 1; i <9; i++ ) {
				sum += check[i];
			}
			ans = sum / 8;
			System.out.println("#" + Tnum + " " + Math.round(ans));
		}
	}
}
