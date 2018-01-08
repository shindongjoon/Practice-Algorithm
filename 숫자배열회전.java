import java.util.Scanner;

public class 숫자배열회전 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans=0;
			N = sc.nextInt();
			int Mat[][] = new int [N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <N; j++) {
					Mat[i][j]= sc.nextInt();
				}
			}
			
			int Mat1[][] = new int [N][N];
			int Mat2[][] = new int [N][N];
			int Mat3[][] = new int [N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <N; j++) {
					Mat1[j][N-i-1]= Mat[i][j];
				}
			}
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <N; j++) {
					Mat2[N-i-1][N-j-1]= Mat[i][j];
				}
			}
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <N; j++) {
					Mat3[N-j-1][i]= Mat[i][j];
				}
			}
			
			System.out.printf("#%d \n", CASE);
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <N; j++) {
					System.out.print(Mat1[i][j]);
				}
				System.out.print(" ");
				for(int j = 0; j <N; j++) {
					System.out.print(Mat2[i][j]);
				}
				System.out.print(" ");
				for(int j = 0; j <N; j++) {
					System.out.print(Mat3[i][j]);
				}
				System.out.println();
			}
		}
	}
}
