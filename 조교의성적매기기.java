import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 조교의성적매기기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int Tnum = 0;
		String[] res = {"D0","C-","C0","C+","B-","B0","B+","A-","A0","A+"};
		while (T-- > 0) {
			Tnum++;
			N=sc.nextInt();
			int K = sc.nextInt();
			double mid, fin, home;
			double check[] = new double [N];
			for(int i = 0 ; i < N ; i ++) {
				mid = sc.nextInt();
				fin = sc.nextInt();
				home = sc.nextInt();
				check[i]=mid*0.35 + fin * 0.45 + home* 0.2;
			}

		    
			double check2[] = new double [N];
			System.arraycopy(check, 0, check2, 0, check.length);
			Arrays.sort(check);

		    
			int temp=0;
			for(int i = 0 ; i < N ; i++) {
				if(check2[K-1]==(check[i])) {
					temp=i;			
					break;
				}
			}
			
			System.out.println("#" + Tnum + " " + res[temp/(N/10)] );
		}
	}
}
