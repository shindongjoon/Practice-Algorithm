import java.util.Scanner;
 
public class 달팽이숫자 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N;
        int CASE = 0;
        while (T-- > 0) {
            CASE++;
            int ans = 0;
            N = sc.nextInt();
            int Mat[][] = new int[N][N];
            int num = 1;
            int row = 0;
            int col = -1;
            int dir = 1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N - i; j++) {
                    col = col + dir;
                    Mat[row][col] = num;
                    num++;
                }
 
                for (int j = 0; j < N - i - 1; j++) {
                    row = row + dir;
                    Mat[row][col] = num;
                    num++;
 
                }
                dir = dir * -1;
            }
            System.out.printf("#%d\n", CASE);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(Mat[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}