import java.util.Scanner;

public class 두개의숫자열 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N, M;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans=0;
			
			N=sc.nextInt();
			M=sc.nextInt();
			int A[] = new int[N];
			int B[] = new int[M];
			for(int i = 0 ; i < N ; i++) {
				A[i]=sc.nextInt();
			}
			for(int i = 0 ; i < M ; i++) {
				B[i]=sc.nextInt();
			}
			int max=0;
			if(N<=M) {
				for(int i =0; i<=M-N;i++) {
					for(int j=0; j<N;j++) {
					max+=A[j]*B[j+i];
				//	System.out.println(A[j] +" * "+ B[j+i] + " = " + max);
					}
					ans=Math.max(ans,max);
					max=0;
				}
			}else {
				for(int i =0; i<=N-M;i++) {
					for(int j=0; j<M;j++) {
					max+=A[j+i]*B[j];
					}
					ans=Math.max(ans,max);
					max=0;
				}
			}
			
			
			
			
			System.out.printf("#%d %d\n", CASE, ans);
		}
	}
}
