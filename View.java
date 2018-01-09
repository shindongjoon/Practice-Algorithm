import java.util.Scanner;

public class View {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			int N = sc.nextInt();
			int check [] = new int[N];
			int check2 [] = new int[N];
			
			for(int i = 0; i < N; i++) {
				check[i]=sc.nextInt();
			}
			for(int i = 0 ; i < N-2; i++) {
				if(check[i+2]>=check[i+1] && check[i+2] >= check[i]) {
					check2[i+2]=Math.min(check[i+2]-check[i], check[i+2]-check[i+1]);
				}
			}
			int temp=0;
			for(int i =0 ; i <N-2; i++) {
				if(check[i]>=check[i+1] && check[i] >= check[i+2]) {
					temp=Math.min(check[i]-check[i+2], check[i]-check[i+1]);
					check2[i] = Math.min(check2[i], temp);
				}else {
					check2[i]=0;
				}
			}
		
			for(int i = 0 ; i<N ; i++) {
				ans +=check2[i];
			}
			System.out.printf("#%d %d\n", CASE, ans);
		}
	}
}