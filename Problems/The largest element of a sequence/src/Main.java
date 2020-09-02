import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int largestNumber = scanner.nextInt();
        while (scanner.hasNextInt()){
            int nextNum = scanner.nextInt();
            if (nextNum > largestNumber){
             largestNumber = nextNum;
            }
        }
        System.out.println(largestNumber);
    }
}