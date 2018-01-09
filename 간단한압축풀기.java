import java.util.Arrays;
import java.util.Scanner;

public class 간단한압축풀기{
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        int N;
	        int CASE= 0; 
	        while (T-- > 0) {
	            CASE++;
	            int ans = 0;
	            N=sc.nextInt();
	            String str[] = new String[N];
	            int arr[] = new int[N];
	            int temp=0;
	            for(int i = 0 ; i < N ; i++) {
	            	str[i]=sc.next();
	            	arr[i]=sc.nextInt();
	            	temp +=arr[i];
	            }
	            String str2[] = new String[temp];
	            int temp2=0;
	            for(int i = 0; i <N; i++) {
	            	for( int j = 0; j<arr[i];j++) {
	            		str2[temp2]=str[i];
	            		temp2++;
	            	}
	            }
	            int temp3=0;
	            System.out.printf("#%d \n",CASE);
	            for(int i = 0; i <= (temp2/10); i++) {
	            	for( int j = 0; j<10;j++) {
	            		if(temp3>=temp2) {
	            			break;
	            		}
	            		System.out.print(str2[temp3]);
	            		temp3++;
	            	}
	            	System.out.println();
	            }
	 
	        }
	    }
	}