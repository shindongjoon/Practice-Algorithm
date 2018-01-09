import java.util.Scanner;

public class 수도요금경쟁 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 1000000;
			int P,Q,R,S,W;
			P=sc.nextInt();
			Q=sc.nextInt();
			R=sc.nextInt();
			S=sc.nextInt();
			W=sc.nextInt();
			int costA=0;
			int costB=0;
			
			costA= P*W;
			
			if(W>=R) {
				costB=Q+(W-R)*S;
			}else {
				costB=Q;
			}
			
			
			System.out.printf("#%d %d\n", CASE, Math.min(costA, costB));
		}
	}
}