import java.util.Scanner;

public class TILTING {
	
	public static int n;
	public static int check[];
	
	public static int tiling(int n) {
		if(n <= 1 ){
			return 1;
		}
		if(check[n]!=0) {
			return check[n];
		}
		
		return check[n] = (tiling(n-1) + tiling(n-2)) % 1000000007;
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		check = new int[101];
		while(T-->0) {
			n = sc.nextInt();
			System.out.println(tiling(n));
		}
		
	}
}
