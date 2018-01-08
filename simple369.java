import java.util.Scanner;

public class simple369 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			int temp = i;
			int cnt = 0;
			
			while(temp!=0) {
				if( temp %10 ==3 || temp %10 ==6 || temp %10 ==9 ) {
					cnt++;
				}
				temp = temp/10;
			}
			for(int j = 0 ; j < cnt; j++) {
				System.out.print("-");
			}
			if(cnt ==0) {
				System.out.print(i);
			}
			System.out.print(" ");
		}
		
	}
}
