import java.util.Arrays;
import java.util.Scanner;

public class 보충학습 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			
			int sum = 0 ;
			for(int i = 0 ; i < 5; i++) {
				int num =sc.nextInt();
				if(num>40) {
					sum+=num;
				}else {
					sum+=40;
				}
			}
		
			System.out.printf("#%d %d \n", CASE, sum/5);
		}
	}
}