
import java.util.Scanner;

public class 파리퇴치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int N, M;
		int Tnum=0;
		while(T-->0) {
			Tnum++;
			N= sc.nextInt();
			M= sc.nextInt();
			int pari[][] = new int [N][N];
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0 ; j < N ; j++) {
					pari[i][j]=sc.nextInt();
				}
			}
			int ans=0;
			int temp=0;
			for(int i = 0 ; i < N-M+1 ; i++) {
				for(int j = 0 ; j < N-M+1 ; j++) {
					for(int p = 0 ; p < M; p++) {
						for(int q = 0 ; q < M ; q++) {
							temp += pari[i+p][j+q];		
						}
					}
					ans = Math.max(ans, temp);
					temp=0;
				}	
			}			
			System.out.println("#"+ Tnum + " "+ ans);
		}
	}
}
