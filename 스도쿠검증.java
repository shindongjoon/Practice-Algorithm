import java.util.Scanner;

public class 스도쿠검증 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N1, N2, M1, M2;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			
			int Mat[][] = new int[9][9];
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					Mat[i][j] = sc.nextInt();
				}
			}
			int sum1=0;
			int sum2=0;
			int ans = 1;
			for(int i = 0; i < 9; i++) {
				sum1=0;
				sum2=0;
				for(int j = 0 ; j < 9 ; j++) {
					sum1+=Mat[i][j];
					sum2+=Mat[j][i];
				}
				if(sum1!=45 || sum2!=45) {
					ans=0;
				}
			}
			int sum3=0;
			for(int i = 0; i < 9; i=i+3) {
				for(int j = 0 ; j < 9 ; j=j+3) {
					sum3=0;
					for(int k = 0 ; k <3; k++) {
						for(int l = 0; l<3; l++) {
							sum3+=Mat[i+k][j+l];
						}
					}
					if(sum3!=45) {
						ans=0;
					}
				
				}		
			}
			System.out.printf("#%d %d\n", CASE,ans);
		}
	}
}
