import java.util.Scanner;

public class LIS {
	public static int check[], s[];
	public static int n;
	
	public static int lis(int pos) {
		if(check[pos]!=0) {
			return check[pos];
		}
		check[pos]=1;
		for(int next = pos; next<n; next++) {
			if(s[pos] < s[next+1]) {
				check[pos]=Math.max(check[pos], lis(next+1)+1);
			}
		}		
		return check[pos];
	}
	
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		check = new int[100];
		s = new int[100];
		while(T-->0) {
			
		n=sc.nextInt();
		for(int i = 0; i < n ; i++) {
			s[i]=sc.nextInt();
		}
		System.out.println(lis(0));
		}
	}
}
