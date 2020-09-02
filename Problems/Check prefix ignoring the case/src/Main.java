import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String str2 = str.toLowerCase();

        if (str2.startsWith("j")){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}