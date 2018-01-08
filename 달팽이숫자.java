import java.util.Scanner;

public class 달팽이숫자 {
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        int M1,D1,M2,D2;
	        int CASE = 0;
	        int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	        while (T-- > 0) {
	            CASE++;
	            int ans = 0;
	            M1=sc.nextInt();
	            D1=sc.nextInt();
	            M2=sc.nextInt();
	            D2=sc.nextInt();
	            if(M1==M2) {
	                ans = D2-D1+1;
	            }else {
	                for(int i = M1-1 ; i <M2-1; i++) {
	                    ans+=day[i] ;
	                }
	                ans=ans+D2-D1+1;
	            }
	            System.out.printf("#%d %d\n", CASE, ans);
	 
	        }
	    }
	}