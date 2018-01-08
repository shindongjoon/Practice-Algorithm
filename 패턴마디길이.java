import java.util.Scanner;
 
public class 패턴마디길이{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String str = new String();
        int a= 0;
        while (T-- > 0) {
            a++;
            str = sc.next();
 
            String temp;
            String check;
            int cnt = 0;
            boolean flag = false;
            for (int i = 1; i <= str.length(); i++) {
                temp = str.substring(0, i);
                for(int j=i ; j < str.length(); j+=i) {
                    if(j+i>30) {
                        break;
                    }
                    check = str.substring(j,j+i);
                    if(temp.equals(check)) {
                        cnt=i;
                        flag=true;
                        break;
                    }else {
                        break;
                    }
                }
                if(flag) {
                    break;
                }
            }
            System.out.println("#" + a + " "+ cnt);
        }
    }
}