import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
       
        String str1 = scanner.nextLine();
        str1.toUpperCase();
     
        String str2 = scanner.nextLine();
        str2.toUpperCase();

        String str3 = str1.replace(" ", "");
        String str4 = str2.replace(" ", "");

        System.out.println(str3.equals(str4));
    }
}
