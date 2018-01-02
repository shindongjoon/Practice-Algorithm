import java.util.Scanner;

public class TRIANGLEPATH {
	public static int n;
	public static int mat[][];
	public static int check[][];
	public static int cntcheck[][];
	public static int path2(int x, int y) {
		if(x==n-1) {
			return mat[x][y];
		}

		if(check[x][y]!=0) {
			return check[x][y];
		}
		
		return check[x][y] = Math.max(path2(x+1,y) , path2(x+1,y+1)) + mat[x][y];
	}
	public static int cnt(int x , int y) {
		if(x == n-1) return 1;
		if(cntcheck[x][y]!=0) return cntcheck[x][y];
		
		if(path2(x+1,y+1) >= path2(x+1,y)) cntcheck[x][y] += cnt(x+1,y+1);
		if(path2(x+1,y+1) <= path2(x+1,y)) cntcheck[x][y] += cnt(x+1,y);
		
		return cntcheck[x][y];
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {			
			n=sc.nextInt();
			mat = new int[n][n];
			check = new int[n][n];
			cntcheck = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <=i; j++) {
					mat[i][j] = sc.nextInt();
				}
			}
			
			System.out.println(cnt(0,0));

			for (int i = 0; i < n; i++) {
				for (int j = 0; j <=i; j++) {
					System.out.print(cntcheck[i][j]+ " ");
				}
				System.out.println();
			}
		}
	}
}



