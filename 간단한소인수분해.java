
import java.util.Scanner;

public class 간단한소인수분해 {
	public static int num=0;
	public static int N=0;
	public static int soinsu(int d) {
		if(N%d==0) {
			num++;
			N=N/d;
			soinsu(d);
		}else {
			return num;
		}
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int CASE = 0;
		while (T-- > 0) {
			CASE++;
			int ans = 0;
			N=sc.nextInt();
			int a[] = new int [5];
			a[0]=soinsu(2);
			num=0;
			a[1]=soinsu(3);
			num=0;
			a[2]=soinsu(5);
			num=0;
			a[3]=soinsu(7);
			num=0;
			a[4]=soinsu(11);
			num=0;
			
			System.out.printf("#%d %d %d %d %d %d\n", CASE,a[0], a[1], a[2], a[3], a[4] );
		}
	}
}