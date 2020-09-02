
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int N_col = scanner.nextInt();
        int M_row  = scanner.nextInt();

        int[][] chocBar = new int[M_row][N_col];

        int K = scanner.nextInt();

        if ((N_col * M_row > K) && (K % M_row == 0 || K % N_col == 0)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}