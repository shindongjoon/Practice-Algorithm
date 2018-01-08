import java.util.Scanner;
 
public class 지그재그숫자 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N;
        int Tnum = 0;
        while (T-- > 0) {
            Tnum++;
            N=sc.nextInt();
            int ans = 0;
            int check [] = new int[N];
            for(int i = 1; i <=N ; i++) {
                if(i%2==0) {
                    ans-=i;
                }else {
                    ans+=i;
                }
            }
             
            System.out.println("#" + Tnum + " " + ans);
        }
    }
}