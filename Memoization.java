
public class Memoization {

	public static int check[][];
	public static int memo(int n, int r) {
		
		if(r==0||n==r) {
			return 1;
		}
		if(check[n][r]!=0) {
			return check[n][r];
		}
		check[n][r]=memo(n-1,r-1) + memo(n-1,r);
		return check[n][r];
	}
	
	public static void main(String args[]) {
		check = new int[30][30];
		System.out.println(memo(5,2));
	}
}
