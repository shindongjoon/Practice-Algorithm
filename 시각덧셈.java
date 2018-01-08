import java.util.Scanner;

public class 시각덧셈 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N1,N2, M1,M2;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans=0;
			N1=sc.nextInt();
			M1=sc.nextInt();
			
			N2=sc.nextInt();
			M2=sc.nextInt();
			
			int hour =N1+N2 ; 
			int min = M1+M2;
			
			if(min>60) {
				min = (min)%60;
				hour=hour+1;
			}else {
				min = (min)%60;
			}
			if(hour>12) {
				hour=hour%12;
			}
			if(hour==0) {
				hour=12;
			}
			System.out.printf("#%d %d %d\n", CASE, hour,min);
		}
	}
}
