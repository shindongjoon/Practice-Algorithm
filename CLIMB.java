import java.util.Scanner;

public class CLIMB {
	public static int n, m;
	public static double check[][];
	public static double climb(int day, int climbed) {
		if(day==m) {
			return climbed>=n ? 1 : 0;
		}
		if(check[day][climbed] !=-1) {
			return check[day][climbed];
		}
		return check[day][climbed] = 0.75 * climb(day+1,climbed+2) + 0.25 *climb(day+1,climbed+1);  
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0) {
			n = sc.nextInt();
			m = sc.nextInt();
			check = new double[1001][2001];
			for(int i = 0 ; i < 1001; i++) {
				for(int j = 0; j< 2001; j++) {
					check[i][j]=-1;
				}
			}
			System.out.println(climb(0,0));
		
		}	
	}
}