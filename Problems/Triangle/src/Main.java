import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(!(a + b > c)){
            System.out.println("NO");
        } else if(!(a + c > b)){
            System.out.println("NO");
        } else if (!(b + c > a)){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}